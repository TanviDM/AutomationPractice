package ForLoop;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reverse =0,i = 121,temp; // temporary for storing original value(i);   
	    temp = i;
	    
	    for(  ; i != 0 ; i=i/10)  // int i has been declared and initialzed before thats y space is given
	    {
		int rem =  i % 10 ;  // 		
		reverse = reverse * 10 + rem;
	    }
		if(temp ==reverse) 
		{
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}

}
