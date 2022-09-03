package test.java.training.one;

public class StringTest {
  
	
	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
//		String var1="var";
//		String var2="var";
//		
//		String var3=new String("var");
//		String var4=new String("var");
//		
//		System.out.println(var3==var4);
//		
//		String str1= "Test";
//		String str2="Me";
//		
//		String concat1=str1+str2;
//		String concat2=str1.concat(str2);
//		System.out.println("concat1: "+concat1);
//		System.out.println("concat2: ".concat(concat2));
//	
//	 System.out.println(itemName("Oil"));
//	 System.out.println(itemName("Shampoo"));
		
//		StringBuffer sf=new StringBuffer("test");
//		sf.append("abc");
//		
//		System.out.println(sf);
//		
//		String str=new String("test");
//	    str.concat("abc");
//		System.out.println(str);
		
	 String item1= "PuffinTestMuffin";
	 String item2="Soos";
	 //item2=item2.toLowerCase();
	 String reverse="";
//	 System.out.println(item1.equals(item2));
//	 System.out.println(item1.compareTo(item2));
	
//	 System.out.println(item1.substring(6, 10));
//	 
//	 System.out.println(item1.length());
	 	for(int i=item2.length()-1;i>=0;i--){
	 		reverse=reverse+item2.charAt(i);
	 	}
	 	
	 	//"Muffin"
	 	//niffuM
	 	
	 	System.out.println(reverse);
	 	if(reverse.equals(item2)){
	 		System.out.println("is pallindrome");
	 	}
	 	else{
	 		System.out.println("is not pallindrome");
	 	}
	}
	
	public static  StringBuffer itemName(String item){
		
		StringBuffer brandName= new StringBuffer("Himalya");
		brandName.append(item);
		return brandName;
		
	}
	
	
	
	

}
