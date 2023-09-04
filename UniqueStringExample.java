package StringSolutions;

public class UniqueStringExample {

	public static boolean isUniqueString(String str) {
	
		boolean []seen = new boolean[256];
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(seen[c]) {
				return false;
			}
				else {
					seen[c]=true;
				}
				
			}
		
		
		
	return true;
		
		
	}
	public static void main(String[] args) {
		String str= "abcde";
		
		boolean result=isUniqueString(str);
		
		if(result==true) {
			System.out.println("The String is Unique ");
		}else {
			System.out.println("The String is not  Unique ");
		}

	}

}
