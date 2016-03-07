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

    //main
    public static void main(String[]args){
	Silver a = new Silver("pasture.in");
	System.out.println(a.solve() + ", 7, Ma, Lindsey");
    }

    //constructor
    public Silver(String filename){
	try{
	    Scanner s = new Scanner(new File(filename));
	    int rows = s.nextInt();
	    int cols = s.nextInt();
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
		solveH();
	    }//solve for
	    return pasture[R2][C2];
	}

	public void solveH(){
	    
	    int[][]a = new int[pasture.length][pasture[0].length];

	    for(int i=0; i<pasture.length; i++){
		for(int j = 0; j<pasture[0].length; j++){
		    if(pasture[i][j] != -1){//check if tree
			a[i][j]=nextS(i,j);
		    }
		    return a;
		}
	    }
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
	    return ans;
	}
	
	public void check(int x, int y){
	    if(x >= row || y>=col || x<0 || y<0 || pasture[x][y]<0){
		return false;
	    }
	    return true;
	}
	
}