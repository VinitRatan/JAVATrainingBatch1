package test.java.training.one;

public class ConditionalStatement_IfElse {

	public static void main(StringTest[] args) {
		// TODO Auto-generated method stub
		//checkContion1(21);
		
		//CheckEven(23);
		
		nestedFizzBuzz(30);
	}
	
	public static void checkContion1(int age){
		
		if(age>=21){
			
			System.out.println("candidate is eligible for voting");
		 System.out.println("test");}
		
		else
			System.out.println("candidate is not eligible for voting");
			
		
		
	} 
	
	public static void CheckEven(int a){
		//a=4;
		if ( a % 2 == 0 )
	        System.out.println(a+" is even");
	     else
	        System.out.println(a+" is odd");
		
		}
	
	//FizzBuzz
	
	public static void fizzBuzz(int number){
		if(number%3==0 && number%5==0 ){
			System.out.println("FIZZBUZZ");
			
		}
		
		else if(number%3==0){
			System.out.println("FIZZ");
		}
		
		else if(number%5==0){
			System.out.println("BUZZ");
		}
		
		else{
			
			System.out.println(number+" does not fit the FIZZBUZZ criteria");
		}
		
		
	}
	
	public static void nestedFizzBuzz(int number){
		
		if(number%3==0){
			
			if(number%5==0){
				
				System.out.println("FIZZBUZZ");
			}
			
			else{
				System.out.println("FIZZ");
				
			}
		
		}
		
		else if(number%5==0){
			
             if(number%3==0){
				
				System.out.println("FIZZBUZZ");
			}
			
			else{
				System.out.println("BUZZ");
				
			}
		}
		
		else{
			
			System.out.println(number+" does not fit the FIZZBUZZ criteria");
		}
		
	}
	
	public void Greeting(String language){
		
		//language=language.toLowerCase();
		if (language.equalsIgnoreCase(("English"))){
			System.out.println("Hello !");
		
		}
		else if (language=="French"){
			System.out.println("Bonjo !");
			
		}
		else if(language=="Hindi"){
			System.out.println("Namaste !");
		}
		else if(language=="Spanish"){
			System.out.println("Hola !");
}
		else if(language=="Italian"){
			System.out.println("Ciao !");
		}
		else{
			System.out.println("wrong input");
		}
	}

}
