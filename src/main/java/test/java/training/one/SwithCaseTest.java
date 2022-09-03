package test.java.training.one;

public class SwithCaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greetingRobot("Italian","Urghh");
	}
	
	
	
	
	
	public static void greetingRobot(String languagePreferred,String userInput){
		
	switch (languagePreferred){
		case "English":
			System.out.println("Welcome");
			switch(userInput){
			case "Hello":
				System.out.println("Hello my friend");
				break;
			case "Bye":
				System.out.println("See you tomorrow");
				break;
				
			default:
				System.out.println("you seem to be in bad mood");
			}
			break;
		case "French":
			System.out.println("Bonjour");
			switch(userInput){
			case "Hello":
				System.out.println("Hello my friend");
				break;
			case "Bye":
				System.out.println("See you tomorrow");
				break;
				
			default:
				System.out.println("you seem to be in bad mood");
			}
			break;
		case "Italian":
			System.out.println("Ciao");
			switch(userInput){
			case "Hello":
				System.out.println("Hello my friend");
				break;
			case "Bye":
				System.out.println("See you tomorrow");
				break;
				
//		default:
//				System.out.println("you seem to be in bad mood");
			}
			
			break;
			
		case "Hindi":
			System.out.println("Namaskar");
			switch(userInput){
			case "Hello":
				System.out.println("Hello my friend");
				break;
			case "Bye":
				System.out.println("See you tomorrow");
				break;
				
			default:
				System.out.println("you seem to be in bad mood");
			}
			break;
			
	    default:
	    	System.out.println("Sorry I still am learning your preferred language");
			break;
		
		
		}
		
	}


}
