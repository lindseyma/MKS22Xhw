public class MyLinkedList{
    
    LNode start;
    int size;
   
    public void add(int value){
	size++;
	
    }

    public String toString(){
	
    }

    public int get(int index){
	
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
