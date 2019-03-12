import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author satya
 *
 */
public class SparseArrayWithMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, Integer> map = new HashMap<String,Integer>();
		while(n>0) {
			String value = sc.next();
			if(map.get(value)==null) {
				map.put(value, 1);
			}
			else {
				int num = map.get(value);
				map.put(value, num+1);
			}
			n--;
		}
	int queries = sc.nextInt();
	for(int i=0;i<queries;i++) {
		String s = sc.next();
		if(map.get(s)==null) {
			System.out.println(0);
		}
		else
			System.out.println(map.get(s));
	}
	
	}

}
