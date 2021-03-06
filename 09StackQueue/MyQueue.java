public class MyQueue<T>{

    private MyLinkedList<T> queue;

    public MyQueue(){
        queue = new MyLinkedList<T>();
    }

    /**
     * Adds the given item to the rear of the queue.
     */
    public void enqueue(T item){
	queue.add(item);
    }
    /**
     * Removes the front item from the queue and returns it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    public T dequeue(){
	if(size<=0){
	    throw new NoSuchElementException();
	}
	else{
	    return queue.remove(0);
	}
    }

    /**
     * Returns the front item from the queue without popping it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    public T peek(){
	if(size==0){
	    throw new NoSuchElementException();
	}
	else{
	    return getValue(0);
	}
    }//peek
    
    /**
     * Returns the number of items currently in the queue.
     */
    public int size(){
	return queue.size;
    }//size

    /**
     * Returns whether the queue is empty or not.
     */
    public boolean isEmpty(){
	if(size==0){
	    return true;
	}
	else{
	    return false;
	}
    }
}