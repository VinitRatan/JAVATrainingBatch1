package test.java.training.one;

public class ChildClass extends ParentClass{

	String groom="Vivek";
	
	public void groom(){
		System.out.println("I want to marry "+groom);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj=new ChildClass();
		obj.groom();
		obj.property();
		
		obj.storyBook();
		
  
	}

}
