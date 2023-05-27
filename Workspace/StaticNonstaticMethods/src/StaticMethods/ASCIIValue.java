package StaticMethods;

public class ASCIIValue {
	
	static char A;
	static char B;
	
	static int value(char A, char B) {
		int V1 =  A;  
		return  V1;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=ASCIIValue.value(A, B);
		System.out.println(result);

	}

}
