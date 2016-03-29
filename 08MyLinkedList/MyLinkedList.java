public class MyLinkedList<T> implements Iterable<T>{
    
    LNode head;
    int size;
   
    public boolean add(T value){
	if(head == null){
	    head = new LNode(value);
	}
	else{
	    LNode p = head;
	    while(p.getNext()!=null){
		p=p.getNext();
	    }
	    p.setNext(new LNode(value));
	}
	size +=1;
	return true;
    }

    public boolean add(int index, T value){
	if(index>size || index<0){
	    throw(new IndexOutOfBoundsException());
	}
	else{
	    if(index == size){
		return add(value);
	    }
	else if(index == 0){
	    LNode a = new LNode(value);
	    a.setNext(head);
	    head = a;
	}
	else{
	    LNode b = head;
	    LNode addee = new LNode(value);
	    for(int i=0; i<index-1; i++){
	        b = b.getNext();
	    }
	    addee.setNext(b.getNext());
	    b.setNext(addee);
	}
	    size++;
	    return true;
	}
    }

    public T get(int index){
	if(index>size || index<0){
	    throw(new IndexOutOfBoundsException());
	}
	else{
	    LNode a = head;
	    for(int i=0; i<index; i++){
		a = a.getNext();
	    }
	    return a.getValue();
	}
    }

    public T set(int index, T newValue){
	if(index>size || index<0){
	    throw(new IndexOutOfBoundsException());
	}
	else{
	    LNode a = head;
	    for(int i=0; i<index; i++){
		a = a.getNext();
	    }
	    T ans = a.getValue();
	    a.setValue(newValue);
	    return ans;
	}
    }


    public String toString(){
	String ans = "[";
	LNode p = head;
	while(p != null){
	    ans+= p.getValue();
	    if(p.getNext() != null){
		ans+= ", ";
	    }
	    p = p.getNext();
	}
	return ans + "]";
    }

    public int size(){
	return size;
    }

    public T remove(int index){
	if(index>size || index<0){
	    throw(new IndexOutOfBoundsException());
	}
	else{
	    if(index == 0){
		T ans = head.getValue();
		head = head.getNext();
		size--;
		return ans;
	    }
	    else{
		LNode a = head;
	    int ind = index;
	    while(ind>1){
		a = a.getNext();
		ind--;
	    }
	    LNode temp = a.getNext();
	    T ans = temp.getValue();
	    temp = temp.getNext();
	    a.setNext(temp);
	    size--;
	    return ans;
	    }
	}
    }

    public Iterator<T> iterator(){
	return new iter();
    }
    
    private class iter implements Iterator<T>{
	LNode a;
	
	public iter(){
	    a = head;
	}
	
	public boolean hasNext(){
	    if(next != null){
		return true;
	    }
	    else{
		return false;
	    }
	}//hasNext
	
	public T next(){
	    if(!hasNext()){
		throw new NoSuchElementException();
	    }
	    T ret = next.getValue();
	    next = next.getNext();
	    return value;
	}
	
	public void remove(){
	    throw new UnsupportedOperationException();
	}
    }//iter

    ////////////////////////////////////////////////////////////////////////////////////////
    
    public class LNode{
	
	T value;
	LNode next;
	
	//get/set value and get/set next
	public LNode(T value){
	    this.value = value;
	}
	
	public T getValue(){
	    return value;
	}

	public void setValue(T value){
	    this.value = value;
	}
	
	public LNode getNext(){
	    return next;
	}
	
	public void setNext(LNode next){
	    this.next = next;
	}

    }

}
