package ObjectQuestion;
class Demo1{
	public static int method1(int a,int b) {
		return a+b;
	}
	public static float method1(float c,float  d) {
		return c+d;
	}public static float method1(int p,float  q) {
		return p+q;
	}
}
public class MethodOverloadingDemo1 {

	public static void main(String[] args) {
//		
//Demo1 D1=new Demo1();
Demo1.method1(2.3, 3.5);
Demo1.method1(20, 4.5);



	}

}
