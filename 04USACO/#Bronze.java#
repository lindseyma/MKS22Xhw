import java.util.*;
import java.io.*;

public class Bronze{
    
    public int[][] pasture;
    public int[][] instructions;
    public int elevation;

    public Bronze(String filename){
	try{
	    Scanner s = new Scanner(new File(filename));

	    int R = s.nextInt();
	    int C = s.nextInt();
	    elevation = s.nextInt();
	    int N = s.nextInt();

	    pasture = new int[R][C];

	    for(int i=0; i<R; i++){
		for(int j=0; j<C; j++){
		    pasture[i][j] = s.nextInt();
		}
	    }

	    instrucs = new int[N][3];
	    for(int i=0; i<N; i++){
		for(int j=0; j<3; j++){
		    instrucs[i][j] = s.nextInt();
		}
	    }
	}

	catch(FileNotFoundException e){
	    System.out.println("File not found");
	}
    }

    public void stomp(int row, int col, int depth){

	col--;
	row--;
	
	int high = pasture[row][col];
	
	//forloops to find the highest plot of land in the square being stomped
	for (int i=row; i<row + 3; i++){
	    for(int j=col; j<col+3; j++){
		if(high < pasture[i][j]){
		    high = pasture[i][j];
		}
	    }
	}

	//subtract one from each square equal to the high
	//until you get to the depth
	for(int i= 0; i<depth; i++){
	    //loop through each piece of land
	    for(int j=row; j<row+3; j++){
		for(int k = col; k<col+3; k++){
		    if(pasture[j][k] == high){
			pasture[j][k]--;
		    }
		}
	    }

	    high--;
	}
    }//stomp

    public int calculate(){
	int ans;

	for (int i=0; i<instructions.length; i++){
	    stomp(instructions[i][0], instructions[i][1], instructions[i][2]);
	}//for instructions
	
	for(int i=0; i<pasture.length; i++){
	    for(int j=0; j<pasture[i].length; j++){
		if(pasture[i][j] >= elevation){
		    pasture[i][j] = 0;
		}
		else{
		    pasture[i][j] = elevation - pasture[i][j];
		}
	    }
	}//for

	//figuring out how much in each plot
	for(int i=0; i<pasture.length; i++){
	    for(int j=0; j<pasture[i].length; j++){
		ans+=pasture[i][j];
	    }
	}//

	return ans * 72 * 72;
    }

    public static void main(String[]args){
	Bronze test = new Bronze("makelake.in");
	System.out.println(test.calculate() + ", 7, Ma, Lindsey");
    }
}//class
