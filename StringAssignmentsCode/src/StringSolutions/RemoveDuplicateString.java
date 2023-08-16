package StringSolutions;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		String str = "My name";
		String str1=str.toUpperCase();
		String Result = removeDuplicate(str1);
		System.out.println(Result);
	}

	public static String removeDuplicate(String str1) {
		StringBuffer SB = new StringBuffer();
		boolean[] charSet = new boolean[256];

		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			if (!charSet[c]) { // if(charSet[c]==false);
				SB.append(c); // SB.append(c) SB=H=false e=false l=false 
				charSet[c] = true;//SB=H=true e=true l=true l=true
			}
		}

		return SB.toString();
	}

}
