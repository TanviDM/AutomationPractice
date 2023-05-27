package ifElse;

public class LeapYear {



	public static void main(String[] args) {
		int year = 2000;
		if (((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0)) {
			System.out.println("LEAP YEAR");
		} else {
			System.out.println(" NON LEAP YEAR");
		}
		
		//way-3
		boolean res=checkLeapYear(2021);//method will be executed, you will be able to store return value in the variable for future use
		System.out.println("Year status: "+res);
	}
	static boolean checkLeapYear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			 System.out.println("LEAP YEAR");
			return true;
		} else {
			System.out.println("COMMON YEAR or NON LEAP YEAR");
			return false;
		}
	}
		
	
	
}

