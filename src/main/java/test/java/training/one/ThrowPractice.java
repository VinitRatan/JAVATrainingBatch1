package test.java.training.one;

public class ThrowPractice {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5, j=1;
     if(multiplication(i,j)<=10){
	throw new RuntimeException("Product is less than or equal to 10");
	
}
     else{
    	 
    	 System.out.println(multiplication(i,j));
     }
	}
	
	public static int multiplication(int n1, int n2){
		
		return n1*n2;
	}

}
