package AssignmentsSolutionCode;
class Demo1{
	public int M1(int a,int b ) {
		return a+b;
	}
	public double M1(double c,double d ) {
		return c+d;
	}
	public int M1(int p,int q,int r ) {
		return p+q+r;
	}
}
public class MethodOverLoadingExample {

	public static void main(String[] args) {
		Demo1 D1=new Demo1();
		int Result1=D1.M1(3, 10);
		double Result2=D1.M1(3.5, 4.5);
		int Result3=D1.M1(10, 20, 30);

		System.out.println(Result1);
		System.out.println(Result2);
		System.out.println(Result3);
	}

}
