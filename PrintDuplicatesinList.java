package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDuplicatesinList {
public static void main(String[] args) {
	List<Integer> numbers = new ArrayList<>();
	Collections.addAll(numbers, 14,12,13,11,15,14,18,16,17,19,18,17,20);
	int count, i, j;
	for(i=0; i<=numbers.size()-1; i++) {
		count = 0;
		for(j=i+1; j < numbers.size(); j++) {
			if(numbers.get(i) == numbers.get(j)) {
				count++;
			}
			if(count > 0) {
				System.out.println(numbers.get(i));
				break;
			}
		}
	}
	
}
}
