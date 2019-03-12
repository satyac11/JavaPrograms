import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/**
 * 
 */

/**
 * @author satya
 *
 */
public class OptimizedBubbleSort {
	public static void bubbleSort(int[] elements) {
		boolean swapped = true;
		for (int i = 0; i < elements.length - 1; i++) {
			int temp = 0;

			for (int j = 0; j < elements.length - i - 1 && swapped; j++) {
				swapped = false;
				if (elements[j] > elements[j + 1]) {
					temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
					swapped = true;
				}
			}
			
			
		}
	}

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/mm/dd/ HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		int[] elements = { 5, 3, 2, 1, 4, 10, 15 };
		System.out.println(now);		
		System.out.println("Bofre Sorting: " + Arrays.toString(elements));
		bubbleSort(elements);
		System.out.println("After Sort: " + Arrays.toString(elements));
		System.out.println(now);
		
		int[]els = {1,2,3,4,5,6,7};
		System.out.println(now);		
		System.out.println("Bofre Sorting: " + Arrays.toString(els));
		bubbleSort(els);
		System.out.println("After Sort: " + Arrays.toString(els));
		System.out.println(now);
		
	}
}
