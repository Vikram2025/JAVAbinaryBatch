package in.vikram.pattern.solution;

public class TrianglePatternExample {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n*2;j++) {
				if((i+j==(n-1))||(j-i==(n-1))||(i==(n-1)&&j<(n*2-1))) {//j<(5*2-1)  j<9 j==8
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		
	}

}
