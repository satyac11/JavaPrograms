import java.util.Scanner;

public class PhoneNumberFormater {
	static String getFormatedString(String data) {
		if (data.length() > 0) {
			StringBuilder formData = new StringBuilder();
			for (int i = 0; i < data.length() && data.length() >= i + 3; i = i + 3) {	
				int remainValues = data.length()-i;
				formData.append(data.substring(i, i + 3));
				formData.append("-");
			}
			if (formData.charAt(formData.length() - 1) == '-')
				formData.deleteCharAt(formData.length() - 1);
			return formData.toString();
		} else
			return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String:");
		 String data = sc.next();
		 //System.out.println(getFormatedString(data));
		 System.out.println(String.format("%2s-", data));
		//System.out.println("00-44 48 5555 8361".replaceAll("[^0-9]", ""));
		//System.out.println(getFormatedString("00-44 48 5555 8361".replaceAll("[^0-9]", "")));
	}
}
