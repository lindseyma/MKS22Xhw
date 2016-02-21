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

    int endPoint = board.length * board[0].length+1;
    int numCols = board.length - 1;
    int numRows = board[0].length - 1;


    public boolean solveH(int num, int col, int row){

	if(num == endPoint){
	    return true;

	System.out.println(num + " " + col + " " + row);

	if(addKnight(num, row, col)){
	    num+=1;
	    if(check(col+1, row-2)){
		return solveH(num, col+1, row-2);
	    }
	    else if(check(col+2, row-1)){
		return solveH(num, col+2, row-1);
	    }
	    else if(check(col+2, row+1)){
		return solveH(num, col+2, row+1);
	    }
	    else if(check(col+1, row+2)){
		return solveH(num, col+1, row+2);
	    }
	    else if(check(col-1, row+2)){
		return solveH(num, col-1, row+2);
	    }
	    else if(check(col-2, row+1)){
		return solveH(num, col-2, row+1);
	    }
	    else if(check(col-2, row-1)){
		return solveH(num, col-2, row-1);
	    }
	    else{
		return solveH(num, col-1, row-2);
	    }
	}//recursion
	
	else{
	    return false;
	}

	return false;
      
	}
    }
   
    public boolean check(int col, int row){
	if(col < 0 ||
	   col > numCols ||
	   row < 0 ||
	   row > numRows){
	    return false;
	}
	else{
	    return true;
	}
    }
    
    public boolean addKnight(int num, int row, int col){
	//checks if in bounds
	if(col < 0 ||
	   col > numCols ||
	   row < 0 ||
	   row > numRows){
	    return false;
	}
	//check if already a knight here
	if (board[row][col] > 0){
	    return false;
	}
	//put the # on the board
	else{
	    board[row][col] = num;
	    return true;
	}
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