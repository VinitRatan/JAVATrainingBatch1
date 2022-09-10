package test.java.training.one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandlingTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		//FileInputStream fis=new FileInputStream("//path.txt"); 
		int i=4/0;
		
		
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{System.out.println(e);
		try{}
		catch(Exception e1){}
		
		}
		
		finally{
			
			System.out.println("closure code");
			
			try{}
			catch(Exception e){}
		}
				
		
		System.out.println("Code post try catch");

	}

}
