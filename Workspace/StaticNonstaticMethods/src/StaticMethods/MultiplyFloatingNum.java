package StaticMethods;

public class MultiplyFloatingNum {
	
	
	float a;
	float b;
	
	static float Multiply(float a, float b) {
		float c=a*b;
		
		return c ;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float res=MultiplyFloatingNum.Multiply(2f, 5.5f);
		float result =MultiplyFloatingNum.Multiply(6f, 5.8f);
		System.out.println(res);
		System.out.println(result);
		

	}

}
