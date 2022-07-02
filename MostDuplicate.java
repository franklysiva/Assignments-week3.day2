package week3.day2;
import java.util.HashMap;
import java.util.Map;
public class MostDuplicate {
	
	public static void main(String[] args) {
		String str = "abbaba"; int Count = 1;
		Map<Character,Integer> strMap= new HashMap<>();
		char[] array = str.toCharArray();
		char mostDuplicate = 0;
		for(int i = 0;i<array.length;i++) {
			if(strMap.containsKey(array[i])) {
				strMap.put(array[i], strMap.get(array[i])+1);
			}
			else {
				strMap.put(array[i], 1);
			}		
		int Counts = strMap.get(array[i]);
		if(Counts>Count) {
			Count = Counts;
			mostDuplicate = array[i];
			}
		}
		System.out.println(mostDuplicate);
	}
}
