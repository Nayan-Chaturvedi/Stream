package StreamQues;

import java.util.Arrays;
import java.util.List;

public class SumAllElement 
{
	public static void main(String[] args)
	{
		List<Integer> nums=Arrays.asList(1, 2, 3, 4, 5);
		int sum=nums.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
//		Sum always happen to primitive int so MpToInt is intermideate operation to convert
//		Integer to int 
		
	}
}
