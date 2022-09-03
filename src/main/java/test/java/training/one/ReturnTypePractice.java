package test.java.training.one;

public class ReturnTypePractice {

	public static void main(StringTest[] args) {
		// TODO Auto-generated method stub
int storeReturnedValue=returnInteger();
//int sum=storeReturnedValue+10;

System.out.println(returnString());

	}
	
	public static int returnInteger(){
		int testVar=20;
		testVar=testVar+10;
		return testVar;
		
	}
	
	public static String returnString(){
		String testVar="twenty";
		testVar=testVar+10;
		//testVar=testVar.concat("35");
		
		//twenty10
		return testVar;
		
	}
	
	public  ReturnTypePractice returnClass(){
		
		return this;
	}
	
public  ReturnTypePractice returnClass2(){
	ReturnTypePractice newObject=new ReturnTypePractice();
		return newObject;
	}

}
