import java.util.*;
public class MyDeque<T>{

    private T[] data;
    private int size;
    private int start, end;
    
    @SuppressWarnings("unchecked")
	public MyDeque(){
	data = (T[]) new Object[10];
	size = 0;
	start = 0;
	end = 0;
    }
    
    @SuppressWarnings("unchecked")
    private void grow(){
	T[] data2 = (T[]) new Object[data.length*2];
	int index = start;
	for(int i =0; i<size; i++){
	    data2[i] = data[index];
	    if(index == size){
		index = 0;
	    }//if
	    index++;
	}//for
	start = 0;
	end = size-1;
	data = data2;
    }//grow

    public void addFirst(T value){
	//check if ary should grow
	if(size == data.length-1){
	    grow();
	}
	if(start == 0){
	    start = data.length-1;
	}
	if(start>=1){
	    start--;
	}
	data[start] = value;
	size++;
    }//addFirst

    public void addLast(T value){
	if(size == data.length-1){
	    grow();
	}
	//basically the opposite of addF
	if(end == data.length-1){
	    end = 0;
	}
	else{
	    end++;
	}
	data[end] = value;
	size++;
    }//addLast

    public T removeFirst(){
	if(data[start] == null){
	    throw new NoSuchElementException();
	}
	T ans = data[start];
	data[start] = null;
	if (start == data.length-1){
	    start = 0;
	}
	else{
	    start++;
	}
	size--;
	return ans;
    }

    public T removeLast(){
	if(data[end] == null){
	    throw new NoSuchElementException();
	}
	T ans = data[end];
	data[end] = null;
	if(end == 0){
	    end = data.length-1;
	}
	else{
	    end--;
	}
	size--;
	return ans;
    }
    
    //accessor
    public T getFirst(){
	if(data[start] == null){
	    throw new NoSuchElementException();
	}
	return data[start];
    }

    public T getLast(){
	if(data[end] == null){
	    throw new NoSuchElementException();
	}
	return data[end];
    }

}