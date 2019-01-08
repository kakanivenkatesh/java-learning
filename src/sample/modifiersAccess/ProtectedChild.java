package sample.modifiersAccess;

import sample.basics.ProtectedExample;

public class ProtectedChild extends ProtectedExample{
	public int count= 9;
		public void testIt() {
			//Integer count= 19;
		//System.out.println("x is " + age); 
		ProtectedExample protectedParent  = new ProtectedExample(); 
		protectedParent.finalMethod();
		//System.out.println("X in parent is " + protectedParent.age); // Compiler error!
		System.out.println("count"+count);
		}
/*	public final void finalMethod(){
		  System.out.println("final method");
	  }*/
public static void main(String[] args) {
	new ProtectedChild().testIt();
}
}
