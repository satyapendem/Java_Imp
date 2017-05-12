
public class BreakContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Break Demo");
		for(int i=1;i<=5;i++)
		{
			if(i==4)
			break;
			System.out.println(i);
		}
		System.out.println("Continue Demo");
		for(int i=1;i<=5;i++)
		{
			if(i==4)
			continue;
			System.out.println(i);
		}
	}

}
