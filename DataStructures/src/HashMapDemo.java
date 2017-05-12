import java.util.HashMap;
import java.util.Map;
public class HashMapDemo {

	public static void main(String[] args)
	{
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(14, "Harsha");
		hashMap.put(51, "Aarthi");
		hashMap.put(55, "Sangeetha");
		hashMap.put(69, "Venkatesh");
		hashMap.put(83, "Srimathi");
		hashMap.put(53, "Priyanka");
		
		System.out.println(hashMap.get(14));
		
		for(Map.Entry<Integer, String> hashMap1 : hashMap.entrySet())
		{
			System.out.println(hashMap1.getKey()+ " : " + hashMap1.getValue());
		}
	}
}
