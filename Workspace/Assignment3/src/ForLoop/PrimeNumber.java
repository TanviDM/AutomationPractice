package ForLoop;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n= 100 ,i ;		
        for(   i = 2; i < n; i++)         
            if(n%i==0)            
            break;            
            if(i==n)            
            	System.out.println( " Prime");            
            else            	
               System.out.println(  " Not a Prime");            
        
	}
}

