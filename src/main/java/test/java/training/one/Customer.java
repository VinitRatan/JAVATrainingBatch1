package test.java.training.one;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationTest customerCopy=new EncapsulationTest();
		int currentBalance=customerCopy.getBalance("Anita", 24);
		
		System.out.println("Current Balance "+currentBalance);
		
		int depositedAmount=3000;
		
		System.out.println("Deposited Amount "+depositedAmount);
		customerCopy.setBalance("Amita", 25, depositedAmount);
		
		int updatedBalance=customerCopy.getBalance("Anita", 25);
	
		System.out.println("Updated Balance "+updatedBalance);
		
	
	
	}

}
