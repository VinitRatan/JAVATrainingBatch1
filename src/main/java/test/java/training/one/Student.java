package test.java.training.one;

public class Student {
	String name="test data";
	int rollNo=121;
	
	Student(String name, int rollNo){
		//this(rollNo);
		this.name=name;
		this.rollNo=rollNo;
		
		System.out.println("name: "+this.name+" roll number:"+this.rollNo);
		
	}

	Student(){
		this(323);
		System.out.println("I am your default constructor");
		System.out.println("name: "+this.name+" roll number:"+this.rollNo);
	
	}
	
	Student(int rollNo){
		this("test",rollNo);
		System.out.println("this is the single parameter constructor");
	}
	
	public static void main(StringTest[] args) {
		// TODO Auto-generated method stub
		
		//Student practice1=new Student(453);
		
		Student practice2=new Student();

	}

	
	
}
