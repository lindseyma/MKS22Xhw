import java.util.*;

    public class Quick{

	public static void main(String[]args){
	    int[] data = new int[] {1, 3, 2, 9, 7, 4, 5, 6};
	    System.out.println(quickSelect(data, 3));
	}

	public static int partitionOld(int[]data, int left, int right){
	    
	    int randNum = (int)(Math.random() * (right-left + 1 )) + left;

	    int current = data[randNum];
	    
	    swap(data, randNum, right);
	    
	    /*int start = left +1;
	      int end = right;
	      while(start<end){
	      if(data[start] < data[left]){
	      swap(data, start, end);
	      end--;
	      else{
	      start ++;
	      }
	    */

	    for(int i=left; i<right; i++){
		if(data[i] > data[right]){ //checks to see where to put curr num
		    swap(data, i, left);
		    left++;
		}//if
	    }//for
	    
	    //to put the num where it should go
	    swap(data, left, right);

	    return left;
	}

	public static int quickSelectOld(int[] data, int k){
	    return quickSelectOld(data, k, 0, data.length-1);
	}

	//helper func
	public static int quickSelectOld(int[] data, int k, int left, int right){
	    if(left <= right){
		
		int a = partitionOld(data, left, right);
		if(a == k){
		    return data[a];
		}
		
		if(a > k){
		    return quickSelectOld(data, k, left, a-1);
		}
		
		return quickSelectOld(data, k, a + 1, right);
		    
		    
	    }
	    return "Error";
		
	}

	public static void swap(int[]data, int a, int b){
	    int temp = data[a];
	    data[a] = data[b];
	    data[b] = temp;
	}
	
	public static void quickSortOld(int[]data){
	    sort(data, 0, data.length-1);
	}

	public static void quickSortOld(int[]data, int left, int right){
	    if(right - left > 0){
		int pivot = partitionOld(data, left, right);
		QuickSortOld(data, left, pivot-1);
		quickSortOld(data, pivot + 1, right);
	    }
	}
	
    }