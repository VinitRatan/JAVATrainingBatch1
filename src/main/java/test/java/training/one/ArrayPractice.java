package test.java.training.one;

import java.util.Arrays;

public class ArrayPractice {

	
	//int marks1[]=new int[5];
	//int[] marks3={20,30,35,45,60};
	
	public static void main(StringTest[] args) {
		// TODO Auto-generated method stub
		int[] marks=new int[5];
		marks[0]=20;
		marks[1]=30;
		marks[2]=35;
		marks[3]=45;
		marks[4]=60;
	
		
		int intialNo=40;
		System.out.println("length: "+marks.length);
//		for(int i=0;i<marks.length;i++){
//			marks[i]=intialNo;
//			intialNo=intialNo+5;
//		}
		System.out.println("---values of marks array----");
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
//		System.out.println(marks[3]);
//		System.out.println(marks[4]);
//		for(int i=0;i<marks.length;i++){
//			System.out.println(marks[i]);
//		}
		
		System.out.println(Arrays.toString(marks));
		
		int maxMarks=0;
		
		for(int i=0;i<marks.length;i++){
			if(marks[i]>maxMarks){
				maxMarks=marks[i];
			}
			
		}
		
		System.out.println("highest marks is: "+maxMarks);
		
	  int secondHighest=0;
	  for(int i=0;i<marks.length;i++){
		  if(marks[i]>secondHighest && marks[i]<maxMarks){
			  secondHighest=marks[i];
		  }
	  }
	  
	  System.out.println("Second highest marks is: "+secondHighest);

	}
	
	

}
