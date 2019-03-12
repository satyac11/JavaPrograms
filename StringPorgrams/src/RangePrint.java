import java.util.Scanner;

public class RangePrint {
	
	static void getRange(String word) {
		String []boundaries = word.split("-");
		int lower = Integer.valueOf(boundaries[0]);
		int higher = Integer.valueOf(boundaries[1]);
		for(int i=lower;i<=higher ;i++) {
			System.out.printf("%d ",i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String []words = sc.nextLine().split(",");
		for(String word :words) {
			if(word.contains("-")) {
				getRange(word);
			}
			else
				System.out.printf("%s ",word);
		}
	}

}
