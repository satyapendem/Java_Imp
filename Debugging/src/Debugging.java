
public class Debugging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Debug debug = new Debug();
		debug.methodTwo();
		debug.methodOne();
		debug.methodThree();
	}

}
class Debug
{
	void methodOne()
	{
		System.out.println(1);
	}
	void methodTwo()
	{
		System.out.println(2);
	}
	void methodThree()
	{
		System.out.println(3);
	}
}