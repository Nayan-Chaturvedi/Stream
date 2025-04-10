package StreamQues;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateElement
{
	public static void main(String[] args) {
		List<Integer> al=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1);
		al.stream().distinct().forEach(System.out::println);
	}
}
