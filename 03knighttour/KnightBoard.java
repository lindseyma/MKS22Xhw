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
       	if(num == (board.length * board[0].length)+1){
	    return true;
	}

	System.out.println(num + " " + col + " " + row);

	for(int i=0; i<board.length; i++){
	    for(int j = 0; j<board[0].length; j++){
		if(board[i][j]>=num){
		    board[i][j] = 0;
		}
	    }
	}

	addKnight(num, col, row);
	
	if(check(col+1, row-2) && solveH(num+1, col+1, row-2)){
	    return solveH(num + 1, col+1, row-2);
	}
	else if(check(col+2, row-1) && solveH(num+1,col+2,row-1)){
	    return solveH(num + 1, col+2, row-1);
	}
	else if(check(col+2, row+1) && solveH(num+1,col+2, row+1)){
	    return solveH(num+1, col+2, row+1);
	}
	else if(check(col+1, row+2) && solveH(num+1,col+1,row+2)){
	    return solveH(num+1, col+1, row+2);
	}
	else if(check(col-1, row+2) && solveH(num+1, col-1, row+2)){
	    return solveH(num+1, col-1, row+2);
	}
	else if(check(col-2, row+1) && solveH(num+1, col-2, row+1)){
	    return solveH(num+1, col-2, row+1);
	}
	else if(check(col-2, row-1) && solveH(num+1, col-2, row-1)){
	    return solveH(num+1, col-2, row-1);
	}
	else if(check(col-1, row-2) && solveH(num+1, col-1, row-2)){
	    return solveH(num + 1, col-1, row-2);
	}
	//recursion
    
	else{
	    return false;
	}
    }

    
   
    public boolean check(int col, int row){
	if(col < 0 ||
	   col + 1 > board[0].length ||
	   row < 0 ||
	   row + 1 > board.length){
	    return false;
	}
	else if(board[col][row] != 0){
	    return false;
	}
	else{
	    return true;
	}
    }
    
    public boolean addKnight(int num, int col, int row){
	board[col][row]=num;
	return true;

    }

    public void printSolution(){
	for(int i=0; i<board[0].length; i++){
	    for(int j=0; j<board.length; j++){
		System.out.print(board[i][j]);
		System.out.print("\t");
	    }
	    System.out.print("\n");
	}
    }
    /*
    public static void main(String[]args){
	KnightBoard b = new KnightBoard(8);
	b.solve();
	b.printSolution();
	}*/
    
}