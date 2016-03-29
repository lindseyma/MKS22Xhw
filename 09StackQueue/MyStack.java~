import java.util.*;

public MyStack<T>{
    
    /**
     * Adds the given item to the top of the stack.
     */
    void push(T item){
	LNode newNode = new LNode(item);
	newNode.setNext(head);
	head = newNode;
	size++;
    }

    /**
     * Removes the top item from the stack and returns it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    T pop(){
	if(size<=0){
	    throw new NoSuchElementException();
	}
	else{
	    T ans = head.getValue();
	    remove(0);//fix this lol
	    size--;
	    return ans;
	}
    }//pop
	    

    /**
     * Returns the top item from the stack without popping it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    T peek(){
	if(size <= 0){
	    throw new NoSuchElementException();
	}
	else{
	    T ans = head.getValue();
	    return ans;
	}
    }

    /**
     * Returns the number of items currently in the stack.
     */
    int size(){
	return size;
    }

    /**
     * Returns whether the stack is empty or not.
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