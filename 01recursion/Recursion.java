public class Recursion{

    public String name(){
	return "Ma,Lindsey";
    }

    public double sqrt(double n){
	if(n<0){
	    throw new IllegalArgumentException();
	}
	//base case!
	if(n==0 || n==1){
	    return n;
	}
	else{
	    return sqrtH(n, n/2);
	}
    }
	

	public double sqrtH(double n, double guess){
	    if (Math.abs(n-(guess*guess))<0.0000000000001){
		return guess;
	    }
	    else{
		guess=(n/guess+guess)/2;
		return sqrtH(n, guess);
	    }
	}
}