package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class FindNumbersOccurances {
		public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 2,3,5,6,3,2,1,4,2,1,6,1);
		Map<Integer,Integer> numbersMap = new TreeMap<>();
		for(int i =0;i<list.size();i++) {
				if(numbersMap.containsKey(list.get(i))) {
					numbersMap.put(list.get(i), numbersMap.get(list.get(i))+1);	
				}
				else {
					numbersMap.put(list.get(i), 1);
				}
			}
			Set<Entry<Integer,Integer>> numbersSet = numbersMap.entrySet();
			for (Entry<Integer,Integer> entry : numbersSet) {
				System.out.println(entry.getKey()+" is occured "+entry.getValue() +" times");
			}
		}
	}

