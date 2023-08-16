package StringSolutions;

public class PrintDuplictaeChar {

	public static void main(String[] args) {
		String str= "Hello World";
		printDuplicate(str);

	}
	public static void printDuplicate(String str) {
		int [] count=new int [256];
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			count[c]++;
		}
		System.out.println("The Duplicate Char present in your String is ");
	for(int i=0;i<count.length;i++) {
		
		if(count[i]>1) {
			System.out.println((char)i+ " ");
		}
	}
		
	}

}
