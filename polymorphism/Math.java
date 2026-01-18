package polymorphism;

public class Math {
	public static void add(int a,int b) {
		System.out.println("2 int parameters");
		System.out.println(a+b);
	}
	public static void add(int a,int b,int c) {
		System.out.println("3 int parameters");
		System.out.println(a+b+c);
	}
	public static void add(double a,double b) {
		System.out.println("2 double parameters");
		System.out.println(a+b);
	}
	public static void add(float a,float b) {
		System.out.println("2 float parameters");
		System.out.println(a+b);
	}
	public static int add(int a,int b,int c,int d) {
		return a+b+c+d;
	}
	public float add(int a,float b) {
		return a+b;
	}
	public static void main(String[] args) {
		add(2,3);
		add(1,6,3);
		add(3.0,4.0);
		add(3.2f,5.1f);
		System.out.println(add(1,2,3,4));
		Math m=new Math();
		System.out.println(m.add(1,2.2f));
	}
}

