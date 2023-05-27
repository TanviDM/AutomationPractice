package Pack1;
import pack2.ProtectedMem;
public class AccessProtectedMembers {
	

	
	class AccessProtectedMembers extends ProtectedMem {

		public static void main(String[] args) {

			AccessProtectedMembers p1 = new AccessProtectedMembers();
			System.out.println("Accessing Protected members from another class outside of package");
			System.out.println(p1.acc);
			p1.displayAccNum();
		}
	}

	/*
	 * using inheritance we can access protected members from outside the package
	 */

}
