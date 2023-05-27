package ifElse;

public class EvenOdd {
	
	static int A;
	
	 static int Number( int A) {
		 
		 
		//method definition
			if(A%2==0) 
			    System.out.println(A+" is even"); 
			else 
			    System.out.println(A+" is odd");
			//return A;
			return 0;
			
			}
	 

	public static void main(String[] args) {
		
		int result=EvenOdd.Number(10);
		System.out.println(result);
		
		// TODO Auto-generated method stub

	}

}
