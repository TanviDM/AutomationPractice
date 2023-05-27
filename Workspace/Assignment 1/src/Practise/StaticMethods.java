package Practise;

public class StaticMethods {
	
	 int x = 15;  
	  int y = 20; 
  int square(int x) 
	{ // Here, x is a local variable. 
	  int a = x * x; 
	  return a; 
	  } 
	static int cube(int y){ // Here, y is a local variable. 
	   int b = y*y*y; 
	    return b; 
	 } 
	public static void main(String[] args) 
	{ 
	   StaticMethods sq= new StaticMethods();
	 int a= sq.square(5);
	   int CB = cube(10); 
	   System.out.println(a); 
	   System.out.println(CB); 
	 //  int qw=sq+1;
	 //  System.out.println(qw);
	  } 
	
}
