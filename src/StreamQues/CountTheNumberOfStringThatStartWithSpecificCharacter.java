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
