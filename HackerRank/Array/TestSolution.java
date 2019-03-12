import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * 
 */

/**
 * @author satya
 *
 */
public class TestSolution {

	/**
	 * @param args
	 */
	public static void reversePrint(Node head) {
		  if(head == null)
		      return; 
		    Node pointer = head;
		    Stack<Integer> stack = new Stack<Integer>();
		  while(pointer.next != null){
		      stack.push(pointer.data);
		      pointer = pointer.next;
		  }
		    while(!stack.isEmpty()){
		        System.out.println(stack.pop());
		    }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i=0;i<testCases;i++){
           LinkedList<Integer> list = new LinkedList();
           int listSize = sc.nextInt();
           for(int j=0;j<listSize;j++) {
        	   list.add(sc.nextInt());
           }
           //reversePrint(list);
        }

	}

}
