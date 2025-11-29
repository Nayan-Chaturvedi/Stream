package StreamQues;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximumNumber {
	
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(1, 2, 3, 4, 5);
		
		List<Integer> list = List.of(10,20,5,40);
		int max = list.stream().max(Integer::compare).orElseThrow();
		System.out.println(max);

	}
}

// Minimum Number Finder

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Comparator;

class MinimumNumber {
    public static void main(String[] args) {
        List<Integer> al=Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(al.stream().min(Integer::compare).orElseThrow());
    }
}

// Sort List Using Stream
List<Integer> sorted = list.stream().sorted().toList();
