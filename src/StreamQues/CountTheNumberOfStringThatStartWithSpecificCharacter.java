package StreamQues;

import java.util.Arrays;
import java.util.List;

public class CountTheNumberOfStringThatStartWithSpecificCharacter 
{
	public static void main(String[] args) {
		List<String> fruits=Arrays.asList("Cherry", "Banana", "Coconut", "Berry", "Cantaloupe");
		long count=fruits.stream().filter(fruit->fruit.startsWith("C")).count();
		System.out.println(count); //3
	}
}

// Number start with 2
List<Integer> al=Arrays.asList(21, 3, 23, 45, 65, 1, 69, 54);
		al.stream().filter(num->num.toString().startsWith("2")).forEach(System.out::println);
