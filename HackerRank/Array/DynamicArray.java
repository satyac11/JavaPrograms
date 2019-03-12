import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		List<Integer> []sequenceList = new List[N];	
		for(int i=0;i<N;i++) {
			sequenceList[i] = new ArrayList();
		}
		int lastAnswer = 0;
		
		
		int queries = sc.nextInt();
		for(int i=0;i<queries;i++) {
			int queryType = sc.nextInt();
			int x= sc.nextInt();
			int y= sc.nextInt();
			int index = (x^lastAnswer)%N;
			if(queryType == 1) {				
				sequenceList[index].add(y);
			}
			else if(queryType == 2) {
				lastAnswer = sequenceList[index].get(y%sequenceList[index].size());
				System.out.println(lastAnswer);
			}
			
		}*/
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int q = in.nextInt();
	        List<Integer>[] sequences = new List[n];
	        for (int n_i = 0; n_i < n; n_i++) {
	            sequences[n_i] = new ArrayList<>();
	        }
	        int lastans = 0;
	        for (int i = 0; i < q; i++) {
	            int t = in.nextInt();
	            int x = in.nextInt();
	            int y = in.nextInt();
	            List<Integer> sequence = sequences[(x^lastans)%n];
	            switch (t) {
	                case 1:
	                    sequence.add(y);
	                    break;
	                case 2:
	                    lastans = sequence.get(y%sequence.size());
	                    System.out.println(lastans);
	                    break;
	            }
	        }
	}

}
