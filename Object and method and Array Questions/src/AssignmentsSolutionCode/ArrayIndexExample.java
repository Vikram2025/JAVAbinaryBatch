package AssignmentsSolutionCode;

public class ArrayIndexExample {
public static int ArrayIndex(int []numbers,int target) {
	for(int i=0;i<numbers.length;i++) {
		if(target==numbers[i]) {
          return i;
	}
	}
	return -1;
}
	public static void main(String[] args) {
		int [] numbers= {12,44,55,33,47};
		int target=50;
             int index=ArrayIndex(numbers,target);
             if(index >=0)
             System.out.println("The target is present in the index "+ index);
             else
            	 System.out.println("the target is not present in the Array");
	}

}
