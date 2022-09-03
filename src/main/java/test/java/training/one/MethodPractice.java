package test.java.training.one;

public class MethodPractice {

	public static void main(StringTest[] args) {
		// TODO Auto-generated method stub
		
		addition();
		
		System.out.println("sum is: "+addition());
		
		
		
		MethodPractice practice1=new MethodPractice();
		int product=practice1.multiplication(4, 3, 6);
		
		System.out.println("product is: "+product);

	}
	
	public static int addition(){
		int number1=8, number2=20;
		
		
		int sum=number1+number2;
		
		return sum;
		
	}
	
  public int multiplication(int number1, int number2, int number3){
		
		int product=number1*number2*number3;
		
		return product;
		
	}

}
