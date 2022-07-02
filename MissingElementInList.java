package week3.day2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class MissingElementInList {
public static void main(String[] args) {
	int i;
	List<Integer> numbers = new ArrayList<>();
	Collections.addAll(numbers, 1,2,3,4,7,6,8);
	Collections.sort(numbers);
	for(i = numbers.get(0); i <= numbers.size(); i++) {
		if (i != numbers.get(i-1)) {
			System.out.println("Missing Number: "+i);
			break;
		}
	}
	
}	
}
