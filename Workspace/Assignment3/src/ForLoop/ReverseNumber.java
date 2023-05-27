package ForLoop;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reverse=0, num=0;
for( num= 1213; num!=0; num=num/10)
	
{
	int remainder=num%10;
reverse=reverse*10+remainder;
}
System.out.println(reverse);
	}

}
/*
1st 
number = 1213    true
remainder = 3   --> 121.3
reverse = 0 * 10 + 3    =  3        

 --> remainder = 3 , reverse = 3, 
 
 2nd
 num= 121   true
 remainder = 1 -->    12.1
 reverse = 3 *10 + 1 = 31
 
 -->  remainder = 1, reverse = 31
 
 3rd 
 num = 12   true
 rem = 2     --->   1.2
 reverse = 31 *10 + 2 = 312
 
 4th 
 num = 1 true
 rem = 1    --->     0.1
 rev =  312 *10 + 1 = 3121
 
 false
 
 
 
 
 
 
 */