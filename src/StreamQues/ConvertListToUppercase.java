package StreamQues;

import java.util.Arrays;
import java.util.List;

public class ConvertListToUppercase 
{
	public static void main(String[] args) {
		List<String> fruits=Arrays.asList("Cherray",  "Banana", "Coconut", "Berry", "Cantaloupe");
		fruits.stream().map(String::toUpperCase).forEach(System.out::println);
	}
}
