package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {

		Set<Integer> numbers1 = new HashSet<Integer>();
		Collections.addAll(numbers1, 3,2,11,4,6,7);

		Set<Integer> numbers2 = new HashSet<Integer>();
		Collections.addAll(numbers2, 1,2,8,4,9,7);

		ArrayList<Integer> i = new ArrayList<Integer>();
		for (Integer j : numbers1) {
			if (numbers2.contains(j)) {
				i.add(j);
			}
		}
		System.out.println("Intersections: " + i);
	}
}
