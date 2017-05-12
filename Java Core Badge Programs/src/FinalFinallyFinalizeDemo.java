
public class FinalFinallyFinalizeDemo {
	public static void main(String args[]) {
		final int x=100,y=0,z;
		// x=200; this line throws an error as x is a final variable
		try{
			z=x/y;
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block always executes even a exception is thrown.");
		}
		FinalizeExample f1=new FinalizeExample();  
		FinalizeExample f2=new FinalizeExample();  
		f1=null;  
		f2=null;  
		System.gc();
	}
}
class FinalizeExample{  
	public void finalize()
	{
		System.out.println("finalize called");
	} 
}
