package StreamQues;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximumNumber {
	
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(1, 2, 3, 4, 5);
		
		int max= nums.stream().max(Comparator.naturalOrder()).get();
		System.out.println(max);
		
//		In max we use comparater - to compare all the value of list
//		naturalOrder- Is a static method that commpare in asc order
//		Max return optional go we use get
	}
}
