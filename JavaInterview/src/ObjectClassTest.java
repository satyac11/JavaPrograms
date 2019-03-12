import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class ObjectClassTest {

	@Test
	void test() {
		 int i=1;
		 int j=i;
		 j=10;
		final List<String> list = new ArrayList<>(20);
		assertEquals(0,list.size());
		list.add("Hello");
		assertEquals(1,list.size());
		//assertEquals(i,j);
		final List<String> list1 =list;
		list1.add("Hi");
		assertEquals(list,list1);
		System.out.println(list);
		System.out.println(list1);
		
	}

}
