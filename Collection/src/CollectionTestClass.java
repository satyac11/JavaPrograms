import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		/*List<String> list = new CopyOnWriteArrayList<>();
		list.add("a");
		list.add("b");
		list.add("a");*/
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		ArrayList<String> al = new ArrayList<>();
		
		//list.remove("a");
		
		Iterator iterator = list.iterator();
		Spliterator sit = list.spliterator();
		
		sit.forEachRemaining(element ->{
			System.out.println(element);
		});
		
		/*while(iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
			System.out.println(list);
			list.add("c");
		}*/
		
		/*for(String element : list) {
			//list.add("b");
			System.out.println(list);
		}*/
		
		/*for(int i=0 ;i<list.size();i++) {
			if(i == list.size()-1) {
				list.add("b");
				System.out.println(list);
				break;
			}
		}*/
		
		
		
		

	}

}
