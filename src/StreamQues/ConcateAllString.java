package StreamQues;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcateAllString {
	public static void main(String[] args) {
		List<String> fruits=Arrays.asList("Cherry", "Banana", "Coconut", "Berry", "Cantaloupe");
		String concat=fruits.stream().collect(Collectors.joining());
		System.out.println(concat);
		
		//it is used to concatenate elements of a Stream into a single String

	}
	
}
