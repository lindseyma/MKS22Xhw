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

    /*
    int endPoint = board.length * board[0].length+1;
    int numCols = board.length - 1;
    int numRows = board[0].length - 1;
    */

    public boolean solveH(int num, int col, int row){
	/*
	int endPoint = board.length * board[0].length+1;
	int numCols = board.length-1;
	int numRows = board[0].length-1;
	*/
	if(num == (board.length * board[0].length)+1){
	    return true;
	}

	System.out.println(num + " " + col + " " + row);

	//addKnight(num, col, row);
	//num+=1;
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
	else if(check(col-1, row-2)){
	    return solveH(num, col-1, row-2);
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
	//System.out.println(num);
	//checks if in bounds
	/*	if(col < 0 ||
	   col + 1 > board[0].length||
	   row < 0 ||
	   row + 1 > board.length){
	    System.out.println("checking for out of bound");
	    return false;
	}
	//check if already a knight here
	if(board[col][row] > 0){
	    System.out.println("test" + col + " " + row + " " + board[col][row]);
	    return false;
	}
	//put the # on the board
	else{
	    board[col][row] = num;
	    return true;
	}
	}*/
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
    
    public static void main(String[]args){
	KnightBoard b = new KnightBoard(5);
	b.solve();
	b.printSolution();
    }
    
}