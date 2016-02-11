public class KnightBoard{

    int[][] board;  

    public KnightBoard(int size){
	board = new int[size][size];
    }

    public boolean solve(){
	
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

}
