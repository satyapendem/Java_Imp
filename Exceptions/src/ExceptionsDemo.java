import java.io.IOException;
import java.util.*;
class Exceptions{
	Scanner input=new Scanner(System.in);
	public void method1() 
	{
		String s="Harsha";
		s=s.concat("full");
		System.out.println(s);
		int n1,n2,result,x=1;
		do{
			try{
				System.out.println("Enter Number1");
				n1=input.nextInt();
				
				System.out.println("Enter Number2");
				n2=input.nextInt();
		
				result=n1/n2;
				System.out.println("result is " + result);
				x=2;
			}
			catch(Exception e)
			{
				System.out.println("Arithmetic Exception");
			}
		}while(x==1);
	}
	public void method2()
	{
		String languages[] = { "C", "C++", "Java", "Perl", "Python" };
		 
		  try {
		    for (int c = 1; c <= 5; c++) {
		      System.out.println(languages[c]);
		    }
		  }
		  catch (Exception e) {
		    System.out.println(e);
		  }
	}
	public void method3()
	{
		String str="Harsha";
		try{
			int i=Integer.parseInt(str);
		}
		catch(Exception e)
		{
			System.out.println("Number Format Exception");
		}
		
	}
	public void method4()
	{
		try{
			String s=null;  
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("Null Pointer Exception");
		}
		finally{
			System.out.println("Finally Blocks executes Anytime");
		}
	}
	public void method5() 
	{
		System.out.println("device operation performed");
	}
}
public class ExceptionsDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Exceptions exception = new Exceptions();
		exception.method1();
		exception.method2();
		exception.method3();
		exception.method4();
		exception.method5();
	}

}