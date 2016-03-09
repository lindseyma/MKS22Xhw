import java.util.Random;
import java.util.Arrays;

public class Sorts{

    public static void fillRandom(int[] ary){
	    int max=10000;
	    Random num = new Random();
	    for(int i=0; i<ary.length; i++){
		ary[i]=num.nextInt(max);
	    }
    } 

    public static void swap(int[] ary, int i, int j){
	int temp=ary[i];
	ary[i]=ary[j];
	ary[j]=temp;
    }

    public static void main(String[]args){
	/*int size=5;
	int max = 10;
	int[] test = new int[size];
	Random num = new Random();
	for(int i=0; i<size; i++){
	    test[i]=num.nextInt(max);
	}   
	//insertionSort(test);
	bubbleSort(test);*/
    }

        public static void insertionSort(int[] myData){
	    int x; //x is current number
	    for(int i=1; i<myData.length; i++){
		//1 because start w/ 2nd #
		x=myData[i];
		int j=i-1;
		for (j=i-1; j>=0 && x < myData[j]; j--){
		    myData[j+1]=myData[j];
		    //}//for j
		    myData[j+1]=x;
		}//for j
	    }//for i
	    for(int k=0; k<myData.length; k++){
		System.out.print(myData[k]);
	    }//for k 
	}
	
    public static void selectionSort(int[] myData){
	for (int i=0; i<myData.length; i++){
	    int x=myData[i]; //current least value
	    int y=-1; //spot of least value
	    for(int j=i+1; j<myData.length; j++){
		if (myData[j]<x){
		x=myData[j];
		y=j;
		}//if
		if(x!=myData[i] && y>-1){
		myData[y]=myData[i];
		myData[i]=x;
		}//if
	    }//for j
	    /*for(int d=0; d<myData.length; d++){
		System.out.print(myData[d] + ", ");
		}//d test*/
	}//for i
	for (int k=0; k < myData.length; k++){
	    System.out.print(myData[k]);
	}//for
    }//selection	
	 

    public static void bubbleSort(int[] myData){
	//int x=myData.length-1;
	for(int i=0; i<myData.length; i++){
	    for(int j=1; j<myData.length-i; j++){
		if(myData[j-1]>myData[j]){//swap if int is > next int
		    int x=myData[j-1];//holds the number for swapping
		    myData[j-1]=myData[j];
		    myData[j]=x;
		}//if
	    }//for j
	    for(int j=0; j<myData.length; j++){
		System.out.print(myData[j]);
	    }//printing
	}//for i
    }//bubble

    public static int[] mergesort(int[] data, int start, int end){
	if (data.length == 1){
	    return data;
	}
	//create arrays for each half of the ary
	int t = data.length/2;
	int[] left = new int[t];
	int[] right = new int[data.length-t];

	for(int i=0; i<left.length; i++){
	    left[i]=data[i];
	}

	for(int j=t+1; j<right.length; j++){
	    right[j] = data[j];
	}
	
    //mergesort both and then merge
    return merge(mergesort(left), mergesort(right));
    }

    private static int[] mergesort(int[] data){
	mergesort(data, 0, data.length-1);
    }
	
    public static int[] merge(int[] data, int[] dataB){
	int[]ans = new int[data.length + dataB.length];
	int data1curr = 0;
	int data2curr = 0;
	int ansCurrent = 0;
	
	
	//compare numbers; add smaller one to array; add to the counter for that ary
	if(data[data1curr] <= data2[data2curr]){
	    ans[ansCurrent] = data[data1curr];
	    data1curr++;
	}
	else{
	    ans[ansCurrent] = data2[data2curr];
	    data2curr++;
	}

    }
    
}//Sorts
   
