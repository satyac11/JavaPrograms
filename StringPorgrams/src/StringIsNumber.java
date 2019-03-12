import java.util.Scanner;

public class StringIsNumber {
	
	static boolean isNumber(String value) {
		char []arr = value.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(((int)arr[i]>=(int)'0' && (int)arr[i]<=(int)'9')||arr[i]=='.')
				continue;
			else
				return false;
				
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String value = sc.next();
		System.out.println(value+" Is a Number: "+isNumber(value));
		//System.out.println((int)'a'+" "+(int)'A'+" "+(int)'0');
	}

}
