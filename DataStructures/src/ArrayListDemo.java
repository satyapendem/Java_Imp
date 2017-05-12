
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo
{
	public static void main(String args[])
	{
		ArrayList<String> javaInterns = new ArrayList<String>();
		javaInterns.add("Harsha");
		javaInterns.add("Aarthi");
		javaInterns.add("Venkatsh");
		javaInterns.add("Sangeetha");
		javaInterns.add("Priyanka");
		javaInterns.add("Srimathi");
		
		javaInterns.add(2,"GajaLakshmi");
		
		javaInterns.set(4,"Hema");

		javaInterns.remove("Priyanka");

		for(int i=0;i<javaInterns.size();i++)
		{
			System.out.println(javaInterns.get(i));
		}

		Iterator indivItems = javaInterns.iterator();
		while(indivItems.hasNext())
		{
			System.out.println(indivItems.next());
		}
		
		ArrayList internsCopy = new ArrayList();
		
		internsCopy.addAll(javaInterns);

		if(javaInterns.contains("Harsha"))
		{
			System.out.println("Harsha is here.");
		}

		if(javaInterns.containsAll(internsCopy))
		{
			System.out.println("Yes everything is here.");
		}
		
		if(internsCopy.containsAll(javaInterns))
		{
			System.out.println("Yes everything is here.");
		}
		else
		{
			System.out.println("No everything is not here.");
		}
	}
}
