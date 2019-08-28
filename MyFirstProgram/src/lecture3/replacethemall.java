package lecture3;

public class replacethemall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert0To5(10120)); 
	
	}
		static int convert0To5Rec(int num) 
	    { 
	       
	        if (num == 0) 
	            return 0; 
	          
	       
	        int digit = num % 10;  
	        if (digit == 0) 
	            digit = 5; 
	  
	      
	        return convert0To5Rec(num / 10) * 10 + digit; 
	    } 
	  
	  
	    static int convert0To5(int num) 
	    { 
	        if (num == 0) 
	            return 5; 
	        else
	            return convert0To5Rec(num); 
	    } 
	  
	   
	  

}
