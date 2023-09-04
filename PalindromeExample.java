package StringSolutions;

public class PalindromeExample {

	public static boolean isPalindrome(String str) {
		int n = str.length();
		for(int i=0;i<(n/2);i++) {
			if(str.charAt(i) != str.charAt(n-1-i)) {
				return false;
			}
			
		}
		return true;
	}
	
	public static void main(String[] args) {
	   String str ="12345321";
	   boolean result= isPalindrome(str);
	   
	   if(result==true) {
		   System.out.println("The given String is a Palindrome ");
	   }else
		   System.out.println("The give String is not a Palindrome");

	}

}
