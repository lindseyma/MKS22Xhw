public class KnightBoard{

    int[][] board;  

    public KnightBoard(int size){
	board = new int[size][size];
    }

    public KnightBoard(int cols, int rows){
	board = new int[cols][rows];
    }

    public boolean solve(){
	/*
	for(int i=0; i<board.length; i++){
	    for(int j=0; j<board[0].length; j++){
		if(board[i][j]>=num){
		    board[i][j] = 0;
		}
	    }
	}
	*/
	int deltaX[] = {1, 2, 2, 1, -1, -2, -2, -2};
	int deltaY[] = {-2, -2, 1, 2, 2, 1, -1, -2};

	board[0][0] = 1;

	if( solveH(1, 0, 0, deltaX, deltaY)){
	    return true;
	}
	else{
	    return false;
	}
	//int deltaX[] = {1, 2, 2, 1, -1, -2, -2, -1};
	//int deltaY[] = {-2, -2, 1, 2, 2, 1, -1, -2};
    }

    public boolean solveH(int num, int col, int row, int deltaX[], int deltaY[]){
	if(num == (board.length * board[0].length)+1){
	    return true;
	}

	int currX; 
	int currY;
	/*
	for(int i=0; i<board.length; i++){
	    for(int j=0; j<board[0].length; j++){
		if(board[i][j]>=num){
		    board[i][j] = 0;
		}
	    }
	}
	*/
	for(int a = 0; a < num; a++){
	    currX = col + deltaX[a];
	    currY = row + deltaY[a];
	    if(check(currX, currY)){
		addKnight(num, currX, currY);
		if (solveH(num++, currX, currY, deltaX, deltaY)){
		    return true;
		}
		else{
		    board[currX][currY] = 0;
		}
	    }
	}
	//return false;
	System.out.println(num + " " + col + " " + row);
	return false;
	/*
	if(check(col,row)){
	    addKnight(num, col, row);
	}
	else{
	    return false;
	}*/
	
    //recursion
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
	System.out.println(b.solve());
	b.printSolution();
    }
    
}