public class ParenDemo{
    
    public static boolean isMatching(String s){

	MyStack<String> current = new MyStack<String>();
	for(int i=0; i<s.length; i++){
	    char a = s.charAt(i);
	    if(a == '{' || a == '(' || a == '<' || a == '['){
		current.push(a);
	    }
	    if(a == '}' || a == ')' || a == '>' || a == ']'){
		if(current.isEmpty()){
		    return false;
		}
		char b = current.pop();
		if(!isRight(b,a)){
		    return false;
		}
		else{
		    return true;
		}
	    }
	}
	return true;
    }
		    
    public static boolean isRight(char a, char b){
	if((a == '{' && b == '}')||
	   (a == '(' && b == ')')||
	   (a == '<' && b == '>')||
	   (a == '[' && b == ']')){
	    return true;
	}
	else{
	    return false;
	}
    }

}