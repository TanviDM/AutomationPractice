package Practise;

public class Operators {

	public static void main(String[] args) {
		


		System.out.println("Program Starts");
		//syntax to declare & initlize a variable: datatype variablename = value;
		// 50 + 15 =65
		int num1=50,num2=15;
		int result=num1+num2;
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("Addition of two number is : "+result);//65
		
		//substraction, declare new variable res to store substraction result
		num1=10;	
		int res= num1-num2;
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("Substraction of two number is : "+res);//-5
		
		//multipication
		num1=15;
		num2=5;
		result= num1*num2;
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("Multipication of two number is : "+result);//75
		
		//division
		num1=100;
		num2=10;
		result= num1/num2;
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("Division of two number is : "+result);//10
		
		
		
		num1=25;
	    num2=15;
		result=num1/num2;//
		System.out.println("Number 1 is : "+num1);//25
		System.out.println("Number 2 is : "+num2);//15
		System.out.println("Division of two number is : "+result);//
		
		
		double num=25;
	    num2=15;
		double result1=num1/num2;//
		System.out.println("Number 1 is : "+num1);//25.0
		System.out.println("Number 2 is : "+num2);//15
		System.out.println("Division of two number is : "+result1);// 1 | 1.66666.. | NOA
		
		
	   num1=25;
       num2=15;
	   result=num1%num2;//mod
		System.out.println("Number 1 is : "+num1);//25
		System.out.println("Number 2 is : "+num2);//15
		System.out.println("Mod of two number is : "+result);//
		System.out.println("Program ends");
		
		
				int num3 = 5, num4 = 55;
				System.out.println("num1: " + num3);
				System.out.println("num2: " + num4);
				// is equal to
//				boolean res = (num3 == num4);
//				System.out.println("num3 == num4 = " + res);// 
						//or
				System.out.println("num1 == num2 = " + (num3 == num4));//
				// is not equal to
				System.out.println("num1 != num2 = " + (num3 != num4));// 
				// Greater than
				System.out.println("num1 >  num2 = " + (num3 > num4));// 
				// Less than
				System.out.println("num1 <  num2 = " + (num3 < num4));// 
				// Greater than or equal to
				System.out.println("num1 >= num2 = " + (num3 >= num4));// 
				// Less than or equal to
				System.out.println("num1 <= num2 = " + (num3 <= num4));// 
			
		
		//All relational operator will give you the result in form of true or false(boolean)
	
	}
}
