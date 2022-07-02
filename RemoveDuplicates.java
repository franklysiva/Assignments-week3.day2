package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
	List<String> strList = new ArrayList<>();
	Collections.addAll(strList, "We", "learn", "java", "basic", "as", "part", "of", "java", "sessions", "in", "java", "week1");
	System.out.println("Original String: " +strList);
	Set<String> strSet = new LinkedHashSet<>();
	strSet.addAll(strList);
	System.out.println("Removed Duplicates String: "+strSet);
	}
}
