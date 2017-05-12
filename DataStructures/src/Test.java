
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
	/*	System.out.println(i+1);
		System.out.println(i+2);
		System.out.println(i+3);*/
		System.out.println("i:"+ i++ +"i:"+ i +"i:"+ ++i);
		
		String str= "Harsha";
		str=str.concat(new String("Harika"));
		System.out.println(str);
		
		StringBuffer str1= new StringBuffer("Hello");
		System.out.println(str1.append("Harsha"));
		
		StringBuilder demo2= new StringBuilder("Hello");
		// The above object too is stored in the heap and its value can be modified
		demo2=new StringBuilder("Bye"); 
		System.out.println(demo2);
	}

}
