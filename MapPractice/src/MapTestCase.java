import java.util.HashMap;
import java.util.Map;

public class MapTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "apple");
		map.put(2, "bananna");
		map.put(3, "citrus");
		map.put(4, "dry fruite");
		map.put(5, "citrus");
		System.out.println(map);
		for(Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("apple"));
			
	}

}
