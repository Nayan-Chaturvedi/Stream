package StreamQues;

import java.util.Arrays;
import java.util.List;

public class AverageOfListOfFloatingPointNumber 
{
	public static void main(String[] args) {
		List<Double> avgNum=Arrays.asList(1.1, 1.2, 1.3, 1.4, 1.5);
		double sumValue=avgNum.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
		System.out.println(sumValue);
	}
}
