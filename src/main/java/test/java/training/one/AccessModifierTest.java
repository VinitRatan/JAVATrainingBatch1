package test.java.training.one;

public class AccessModifierTest {
	public int n1=45;
	protected int n2=46;
	int n3=47;
	private int n4=48;
	
	public void method1(){
		System.out.println("n1 "+n1);
		System.out.println("n2 "+n2);
		System.out.println("n3 "+n3);
		System.out.println("n4 "+n4);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifierTest test=new AccessModifierTest();
		
		test.method1();
		

	}

}
