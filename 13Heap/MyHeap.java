import java.util.*;
@SuppressWarnings("unchecked")
public class MyHeap<T extends Comparable<T>>
{
    private int size;
    private T[] data;

    public MyHeap(){
	size = 0;
	isMax = true;
	data = (T[]) new Comparable[6];
    }

    public MyHeap(T[] array){
	size = array.length;
	data = (T[])new Comparable[size+1];
	data[0] = null;
	isMax = true;
	for(int i=1; i<size+1; i++){
	    data[i] = array[i-1];
	}
	heapify();
    }

	/**pushDown
      precondition: datas[k]'s children are valid heaps
      postconditions:-the element at index k has been 
                     shifted to the correct spot.
                     -data[k] and is a valid heap
	**/
    private void pushDown(int k){
	if(k - 1 < size/2){
	    if(data[k].compareTo(data[k*2])<0){
		swap(k, k*2);
		pushDown(k*2);
	    }
	    if(data[k].compareTo(data[k*2+1])<0){
		swap(k, k*2+1);
		pushDown(k*2+1);
	    }
	}
    }
	    
	/**pushUp
      precondition: data is a heap with at most one item
      out of place (element at k)
      postconditions:-the element at index k has been 
                     shifted to the correct spot.
                     -data is a valid heap
	**/
    private void pushUp(int k){
	if(k > 1){
	    if(data[k].compareTo(data[k/2]


	private void heapify()
	public T delete()
	public void add(T x)
	private void doubleSize()
	public String toString()

	//do this last
	public MyHeap(boolean isMax)
	public MyHeap(T[] array, boolean isMax)

	}