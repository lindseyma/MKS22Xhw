import java.util.*;

    public class Quick{
	
	public static int partition(int[]data, int left, int right){
	    
	    int randNum = (int)(Math.random() * (right-left + 1 )) + left;

	    int current = data[randNum];
	    
	    swap(data, randNum, right);
	    
	    for(int i=left; i<right; i++){
		if(data[i] < current){ //checks to see where to put curr num
		    swap(data, i, left);
		    left++;
		}//if
	    }//for
	    
	    //to put the num where it should go
	    swap(data, left, right);

	    return left;
	}

	public static int quickselect(int[] data, int k){
	    return quickselect(data, k, 0, data.length-1);
	}

	//helper func
	public static int quickselect(int[] data, int k, int left, int right){
	    int a = partition(data, left, right);
	    if(a == k){
		return data[a];
	    }
	    
	    if(a > k){
		return quickselect(data, k, a, right);
	    }

	    if(a <=  k){
		return quickselect(data, k, left, a-1);
	    }

	    return quickselect(data, k, a, right);
	}

	public static void swap(int[]data, int a, int b){
	    int temp = data[a];
	    data[a] = data[b];
	    data[b] = temp;
	}
				
    }