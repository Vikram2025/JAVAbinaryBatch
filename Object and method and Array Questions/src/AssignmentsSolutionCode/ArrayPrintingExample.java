package AssignmentsSolutionCode;

public class ArrayPrintingExample {
public static void arrayPrint(int [] numbers) {
	System.out.println("The Elements present in Array are");
	for(int num : numbers) {
		System.out.print(num+ " ");
	}
}
	public static void main(String[] args) {
		int[] numbers= {10,20,30,40,50,60};
		arrayPrint(numbers);
		

	}

}
