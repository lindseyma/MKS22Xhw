public class NQueen{
    
    int[][] board;
    int queen;

    public NQueen(int size){
	board = new int[size][size];
	queen=size; //subtract one for each queen placed successfully
	for(int i=0; i<size; i++){
	    for(int j=0; j<size; j++){
		board[i][j]=0;
	    }
	}
    }

    /*
    public void add(int x){
	int i=0;
	while(i<size+1){
	    if(board[x][i]==0){
		board[x][i]=1;
		i=size+1;
	    }
	}
    */

    public void add(int x, int y){
	board[x][y]=1;
	//horizontal
	for(int i=0; i< size-x; i++){
	    board[i][y]-=1;
	}
	//diag
	for(int j=0; j< size-x; j++){
	    for(int k=0; k<size; k++){
		if(