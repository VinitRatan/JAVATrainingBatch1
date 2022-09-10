package test.java.training.one;

public class OverloadingPractice {
	
	public String add(int n1, String n2){
		return n1+n2;
	}
	
	public String add(String n1,int n2){
		return n1+n2;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingPractice newObj=new OverloadingPractice();
		System.out.println("addition of int and string "+newObj.add(4,"five"));
		System.out.println("addition of string and int  "+newObj.add("four",5));

	}

}
