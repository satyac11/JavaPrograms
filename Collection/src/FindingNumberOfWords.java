import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindingNumberOfWords {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<String,Integer>();
		FileReader freader = new FileReader("Data.txt");
		BufferedReader br = new BufferedReader(freader);
		
		String data = br.readLine();
		String []words = data.split("\\s");
		System.out.println(Arrays.toString(words));
		
		for(int i=0;i<words.length;i++) {
			String word = words[i].toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}
			else {
				map.put(word, 1);
			}
		}
		System.out.println("Total Number of words are: "+words.length);
		for(Map.Entry word : map.entrySet()) {
			System.out.println(word.getKey()+"====="+word.getValue());
		}
		freader.close();
		br.close();

	}

}
