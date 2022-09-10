package test.java.training.one;

public class EncapsulationTest {
	
	private int balance=4000;
	
	
	//getter and setter methods
	
	public int getBalance(String name, int age){
		if(name.equalsIgnoreCase("Anita")&&age==25){
			
			return balance;
		}
		else{
			
			return 0;
		}
	}
	
	public void setBalance(String name, int age, int depositedAmount)
	{
		
       if(name.equalsIgnoreCase("Anita")&&age==25){
			this.balance=balance+depositedAmount;
			
		}
		else{
			
			this.balance=balance;
		}
		
		
	}	
	
	

}
