package ForLoop;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="Test";
		
		/*char[] reverse= s.toCharArray();// convert input string to character array using to.CharArray
		for( int i =reverse .length-1 ;i>=0 ; i-- ) 
		{
			System.out.print(reverse[i]);
		}*/
		
		
		StringBuffer rev= new StringBuffer(s);
		
		rev.reverse();
		System.out.println(rev);
	}
	
	

}
//0123
//Test -tseT