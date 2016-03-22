public class MyLinkedList{
    
    LNode head;
    int size;
   
    public void add(int value){
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

    public class LNode{
	
	int value;
	LNode next;
	
	//get/set value and get/set next
	public LNode(int value){
	    this.value = value;
	}
	
	public int getValue(){
	    return value;
	}

	public void setValue(int value){
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
