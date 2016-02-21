public class KnightBoard{

    int[][] board;  

    public KnightBoard(int size){
	board = new int[size][size];
    }

    public KnightBoard(int cols, int rows){
	board = new int[cols][rows];
    }

    public boolean solve(){
	return solveH(1, 0, 0);
    }

    public boolean solveH(int num, int col, int row){

	//check if in bounds
	if(col < 0 ||
	   col > board.length ||
	   row < 0 ||
	   row > board[0].length){
	    return false;
	}

	if(num == board.length * board[0].length + 1){
	    return true;
	}
	System.out.println(num + " " + col + " " + row);
	if(board[row][col] > 0){
	    return false;
	}

	//set the # and search for next space
	else{
	    board[row][col] = num;
	    num+=1;
	    return(solveH(num, col+1, row-2)||
		   solveH(num, col+2, row-1)||
		   solveH(num, col+2, row+1)||
		   solveH(num, col+1, row+2)||
		   solveH(num, col-1, row+2)||
		   solveH(num, col-2, row+1)||
		   solveH(num, col-2, row-1)||
		   solveH(num, col-1, row-2));
	}//else w/ the recursion
	
	
    }

    public void printSolution(){
	for(int i=0; i<board.length; i++){
	    for(int j=0; j<board.length; j++){
		System.out.print(board[i][j]);
		System.out.print("\t");
	    }
	    System.out.print("\n");
	}
    }

public static void main(String[]args){
    KnightBoard b = new KnightBoard(5);
    b.solve();
    b.printSolution();
}

}