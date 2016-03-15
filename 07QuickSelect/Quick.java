import java.util.*;

    public class Quick{

	public static String name(){
	    return "7, Ma, Lindsey";
	}

	
	public static void main(String[]args){
	    int[] data = new int[] {1, 3, 2, 9, 7, 4, 5, 6};
	    //System.out.println(quickSelect(data, 3));
	    quickSort(data);
	    printAry(data);
	    for(int i=0; i<data.length-1; i++){
		if(data[i+1] <= data[i]){
		    System.out.println("t");
		}
		System.out.println("f");
	    }
	    }

	/*	public static void main(String[]args){
	    int[]a = new int[4000000];
	    for(int i=0; i<a.length; i++){
		a[i] = (int)(Math.random() * 3);
	    }
	    // Arrays.sort(a); 
	    //quickSortOld(a);
	    //   quickSort(a);
	    for(int i=0; i<a.length; i++){
		a[i] = (int)(Math.random()*Integer.MIN_VALUE);
	    }

	    //Arrays.sort(a);
	    //quickSortOld(a);
	    quickSort(a);
	}*/

	public static int partitionOld(int[]data, int left, int right){
	    
	    int randNum = (int)(Math.random() * (right-left + 1 )) + left;

	    int current = data[randNum];
	    
	    swap(data, randNum, right);
	    
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

	public static int[] partition(int[]data, int left, int right){
	    int[] returnAry = new int[2];
	    int randNum = (int)(Math.random()*(right-left+1))+left;
	    swap(data, randNum, right);
	    for(int i=left; i<right; i++){
		if(data[i] > data[right]){
		    swap(data, i, left);
		    left++;
		}
	    }
	    swap(data, left, right);
	    returnAry[0] = left;
	    int ans=0;
	    for(int i=left; i<data.length; i++){
		if(data[i] == left){
		    ans++;
		}
	    }
	    returnAry[1] = ans;
	    for(int i=0; i<returnAry.length; i++){
		System.out.print(returnAry[i] + " ");
	    }
	    System.out.println("\n");
	    return returnAry;
	}

	
	  


	public static int quickSelectOld(int[] data, int k){
	    return quickSelectOld(data, k, 0, data.length-1);
	}

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
	    return -1;
		
	}

	public static void swap(int[]data, int a, int b){
	    int temp = data[a];
	    data[a] = data[b];
	    data[b] = temp;
	}
	
	public static void quickSortOld(int[]data){
	    quickSortOld(data, 0, data.length-1);
	}

	public static void quickSortOld(int[]data, int left, int right){
	    if(right - left > 0){
		int pivot = partitionOld(data, left, right);
		quickSortOld(data, left, pivot-1);
		quickSortOld(data, pivot + 1, right);
	    }
	}
	
	public static void quickSort(int[]data){
	    quickSort(data, 0, data.length-1);
	}
	
	public static void quickSort(int[]data, int left, int right){
	    if(left < right){
		int[]ary = partition(data, left, right);
		quickSort(data, left, ary[0]-1);
		quickSort(data, right, ary[1]+1);
	    }
	}
	
	public static void printAry(int[]data){
	    for(int i=0; i<data.length; i++){
		System.out.println(data[i]);
	    }
	}
    }