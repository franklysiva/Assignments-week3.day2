package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {

	List<Integer> numbers = new ArrayList<>();
	Collections.addAll(numbers, 3,2,11,4,6,7);
	Collections.sort(numbers);
	System.out.println("List of numbers: "+numbers);
	System.out.println("The Second largest number is: "+numbers.get(4));
	}
}
