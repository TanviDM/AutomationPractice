package pack2;


public class PrivatePack1 {
	

	

		private int accNum=12345;
		private void displayAccNum() {
			System.out.println("Account Number: "+accNum);
		}
		public static void main(String[] args) {		
			PrivatePack1 p1=new PrivatePack1();
			System.out.println(p1.accNum);
			p1.displayAccNum();
		}
	}
	class AccessPrivateMembers2 {

		public static void main(String[] args) {
			
			PrivatePack1 p1=new PrivatePack1();
			System.out.println(p1.accNum);
			p1.displayAccNum();
		}
	}
	/**
	 * private member are accessible with in class only
	 */

}
