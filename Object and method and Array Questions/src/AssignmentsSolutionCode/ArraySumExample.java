package AssignmentsSolutionCode;

public class ArraySumExample {
public static int ArraySum(int []numbers) {
	int sum=0;
	for(int num : numbers) {
		sum+=num;
	}
	return sum;
}
	public static void main(String[] args) {
	int [] numbers= {10,22,33,25,38};
	int Total=ArraySum(numbers);
	System.out.println(Total);
	}
}
