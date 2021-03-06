import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;

public class MapExample {

    public static void main(String[] args) {

        Map<Object,String> mp=new HashMap<Object, String>();
        ArrayList<String> javaInterns = new ArrayList<String>();
        // adding or set elements in Map by put method key and value pair
        mp.put(new Integer(2), "Two");
        mp.put(new Integer(1), "One");
        mp.put(new Integer(3), "Three");
        mp.put(new Integer(4), "Four");

        Map<Object,String> mp2=new HashMap<Object, String>();
        mp2.put(new Integer(2), "Two2");
        mp2.put(new Integer(1), "One2");
        mp2.put(new Integer(3), "Three2");
        mp2.put(new Integer(4), "Four2");

        Map<String, Object> mpMaps=new HashMap<String, Object>();

        mpMaps.put("Map1",mp);
        mpMaps.put("Map2",mp2);

        System.out.println("This is a map of Maps:   " + mpMaps); 

        for (int i=0;i<mpMaps.size();i++){
                     ArrayList<Object> a = new ArrayList<Object>(mpMaps.keySet());
                     Object o=a.get(i);
                     System.out.println("all together: " + mpMaps.size() + "each element is:  " + o + " value: " + mpMaps.get(o));
        }
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