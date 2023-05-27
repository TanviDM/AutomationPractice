package Practise;

public class Unary1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -95, b;
		b = a++;//-95
		int x = a, y; //-94
		System.out.println(x);// -94
		y = ++x;// 
		System.out.println(a);// -94
		System.out.println(b);// -95
		System.out.println(x);// -93
		System.out.println(y);// -93

		int p = 15, q = 30, res;

		res = p++ + --q;// res = 
		System.out.println("res: " + res);// 
		System.out.println("p: " + p);// 
		System.out.println("q: " + q);//
		System.out.println("*****************************");
		int res1 = ++p + ++q;// res1 = 
		System.out.println(res1);// 
		System.out.println("p: " + p);//
		System.out.println("q: " + q);

	}

}
