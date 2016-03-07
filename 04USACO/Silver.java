import java.io.*;
import java.util.*;

public class Silver{
    int[][] pasture;
    int[][] oldPast;
    int R1; 
    int R2;
    int C1;
    int C2;
    int time;
    int rows;
    int cols;

    //main
    public static void main(String[]args){
	Silver a = new Silver("pasture.in");
	System.out.println(a.solve() + ", 7, Ma, Lindsey");
    }

    //constructor
    public Silver(String filename){
	try{
	    Scanner s = new Scanner(new File(filename));
	    rows = s.nextInt();
	    cols = s.nextInt();
	    time = s.nextInt();
	    pasture = new int[rows][cols];
	    oldPast = new int[rows][cols];
	    
	    for(int i=0; i<rows; i++){
		String line = s.next();
		for(int j=0; j<cols; j++){
		    if(line.charAt(j) != '*'){
			pasture[i][j] = 0; //regular spaces
		    }
		    else{
			pasture[i][j] = -1;
		    }
		}
	    }

	    R1 = Integer.parseInt(s.next())-1;
	    C1 = Integer.parseInt(s.next())-1;
	    R2 = Integer.parseInt(s.next())-1;
	    C2 = Integer.parseInt(s.next())-1;

	}
	catch(FileNotFoundException e){
	    System.out.println("File not found");
	}

    }//constructor

	public int solve(){
	    pasture[R1][C1] = 1;
	    for(int i=0; i<time; i++){
		pasture = solveH();
	    }//solve for
	    return pasture[R2][C2];
	}

	public int[][] solveH(){
	    
	    int[][]a = new int[pasture.length][pasture[0].length];

	    for(int i=0; i<pasture.length; i++){
		for(int j = 0; j<pasture[0].length; j++){
		    if(pasture[i][j] != -1){//check if tree
			a[i][j]=nextS(i,j);
		    }
		    else{
			a[i][j] = -1;
		    }
		}
	    }
	    return a;
	}

	public int nextS(int x, int y){
	    int ans =0;
	    if(check(x, y+1)){
		ans+=pasture[x][y+1];
	    }
	    if(check(x,y-1)){
		ans+=pasture[x][y-1];
	    }
	    if(check(x+1,y)){
		ans+=pasture[x+1][y];
	    }
	    if(check(x-1,y)){
		ans+=pasture[x-1][y];
	    }
	    //System.out.println(ans);
	    return ans;
	}
	
	public boolean check(int x, int y){
	    //System.out.println("Rows/cols" + rows + cols + "x/y" + x + y);
	    if(x>=rows || y>=cols || x<0 || y<0 || pasture[x][y] < 0){
		return false;
	    }
	    return true;
	}
	
}