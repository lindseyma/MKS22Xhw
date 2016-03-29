public MyQueue<T>{
    
    /**
     * Adds the given item to the rear of the queue.
     */
    void enqueue(T item){
	LNode newNode = new LNode(item);
	stack.add(item);///hfioehwaht
	size++;
    }//broken af
    /**
     * Removes the front item from the queue and returns it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    T dequeue(){
	if(size<=0){
	    throw new NoSuchElementException();
	}
	else{
	    T ans = head.getValue();
	    stack.remove(0);
	    return ans;
	    size--;
	}
    }

    /**
     * Returns the front item from the queue without popping it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    T peek(){
	if(size==0){
	    throw new NoSuchElementException();
	}
	else{
	    return head.getValue();
	}
    }//peek
    
    /**
     * Returns the number of items currently in the queue.
     */
    int size(){
	return size;
    }//size

    /**
     * Returns whether the queue is empty or not.
     */
    boolean isEmpty(){
	if(size==0){
	    return true;
	}
	else{
	    return false;
	}
    }
}