public class Bronze{
    
    private int[][] pasture;

    public void stomp(int row, int col, int depth){
	int high = pasture[row][col];
	for (int i=0; i<pasture.length; i++){
	    