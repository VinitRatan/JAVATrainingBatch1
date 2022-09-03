package test.java.training.two;

import test.java.training.one.AccessModifierTest;

public class SubclassTest extends AccessModifierTest{

	public void method2(){
		System.out.println("n1 "+n1);
		System.out.println("n2 "+n2);
		//System.out.println("n3 "+n3);
		//System.out.println("n4 "+n4);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new SubclassTest().method2();
	}

}
