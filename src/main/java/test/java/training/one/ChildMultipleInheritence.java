package test.java.training.one;

public class ChildMultipleInheritence implements TestInterface1,TestInterface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildMultipleInheritence child=new ChildMultipleInheritence();
		child.testMethod4();
	}

@Override
public void testMethod1() {
	System.out.println("Child method 1");
	
}

@Override
public void testMethod2(String methodParam) {
	// TODO Auto-generated method stub
	System.out.println("Child method 2");
}

@Override
public void testMethod3() {
	// TODO Auto-generated method stub
	System.out.println("Child method 3");
}

@Override
public void testMethod4() {
	// TODO Auto-generated method stub
	System.out.println("Child method 4");
}

}
