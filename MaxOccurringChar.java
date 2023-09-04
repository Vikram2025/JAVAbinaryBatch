package StringSolutions;

public class MaxOccurringChar {
 public static char maxchar(String str) {
	 int [] count = new int[256];
	 int maxCount=0;
	 char maxChar=' ';
	
	 for(int i=0;i<str.length();i++) {
		 int c = str.charAt(i);
		 System.out.println(c);
		 count[c]++;
		 
		 if(count[c]>maxCount) {
			 maxCount=count[c];
			 maxChar=(char)c;
			 }
		 
	 }
	 return maxChar;
 }
	
	 
	public static void main(String[] args) {
	 String str="hello world";
	 char result=maxchar(str);
	 System.out.println("The max Character in the given String is "+ result);

	}

}
