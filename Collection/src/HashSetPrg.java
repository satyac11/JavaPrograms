import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new LinkedHashSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("a");
		set.add("d");
		set.add(null);
		set.add(null);
		System.out.println(set);
		
	}

}
