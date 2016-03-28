public class MyLinkedList{
    
    LNode head;
    int size;
   
    public boolean add(int value){
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

    public boolean add(int index, int value){
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

    public int get(int index){
	LNode a = head;
	for(int i=0; i<index; i++){
	    a = a.getNext();
	}
	return a.getValue();
    }

    public int set(int index, int newValue){
	LNode a = head;
	for(int i=0; i<index; i++){
	    a = a.getNext();
	}
	int ans = a.getValue();
	a.setValue(newValue);
	return ans;
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

    public int remove(int index){
	if(index == 0){
	    int ans = head.getValue();
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
	    int ans = temp.getValue();
	    temp = temp.getNext();
	    a.setNext(temp);
	    size--;
	    return ans;
	}
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    
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
