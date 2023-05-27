package StaticMethods;

public class Addnumbers {
	
	static int a;
	static int b;
	
	static int add(int a, int b) {
		int c= a+b;
		return c;
		
	}
	
public static void main(String args [] ) {
	int x=Addnumbers.add(10 ,20);
	System.out.println(x);
	
}
}
