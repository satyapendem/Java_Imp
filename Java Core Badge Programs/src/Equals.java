
public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=new String("Harsha");
		String name2=new String("Harsha");
		if(name==name2)
		{
			System.out.println(name+" is the same as "+name2);
		}
		else
		{
			System.out.println(name+" is not same as "+name2);
		}
		if(name.equals(name2))
		{
			System.out.println(name+" is the same as "+name2);
		}
		else
		{
			System.out.println(name+" is not same as "+name2);
		}
	}

}
