package test.java.training.one;

public class LoopPractice {

	public static void main(StringTest[] args) {
		// TODO Auto-generated method stub
		//int varibleName;
		//varibleName=varibleName+1;
		
//		for(int varibleName=1;varibleName<=10;varibleName++){
//			
//			System.out.print(varibleName+" ");
//		}
		
//		int i=1;
//		while(i<=10){
//			System.out.print(i+" ");
//			i++;
//			
//		}
		
//		int i=-1;
//		do{
//			System.out.print(i+" ");
//			i--;
//			
//		}while(i>=10);
		
		//factorial(5);
		isPrime();
//			
	}
	
	public static void factorial(int num){
		
		int fact=1;
       // int i=5;
		for(int i=5;i<=5;i--){
			fact=fact*i;
		}
		
		System.out.println(fact);
		
	}
	
	
	//prime 1 and no itself
	
	//5 num/2
	
	//33 33/2= 16 
	
//	33%2!=0; prime
//	33%3=0; non prime 
	
	public static void isPrime(){
		
		boolean isPrime=false;
	for(int num=1;num<=100;num++){
		if(num==1){
			isPrime=false;
		}
		if(num==2){
			isPrime=true;
		}
		
		for(int j=2;j<=num/2;j++){
			if(num%j==0){
				isPrime=false;
				break;
			}
			else{isPrime=true;}
			
		}
		
		if(isPrime){
			System.out.println(num+" isPrime");
		}
		else{
			System.out.println(num+" is not Prime");
		}
		
	}
	}
	
	
	
	
	
	
}
