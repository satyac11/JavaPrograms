
public class CalculateMaxValue {
	public static int getMaxValue(String data) {
		int res = data.charAt(0)-'0';
		for(int i=1;i<data.length();i++) {
			if(data.charAt(i)=='0' ||data.charAt(i)=='1'||res<2)
				res +=data.charAt(i)-'0';
			else
				res *=data.charAt(i)-'0';
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMaxValue("01231"));
	}

}
