package polymorphism;

public class FindMax {
	public int max(int a,int b) {
		if(a>b) return a;
		else return b;
	}
	public int max(int a,int b,int c) {
		int res1=(a>b)?((a>c)?a:c):b;
		return res1;
	}
	public float max(int a,float b) {
		return ((a>b)?a:b);
	}
	public double max(double a,double b) {
		return ((a>b)?a:b);
	}
	
	public static void main(String[] args) {
		FindMax obj=new FindMax();
		System.out.println(obj.max(1, 2));
		System.out.println(obj.max(3,5,6));
		System.out.println(obj.max(3.2,5.6));
		System.out.println(obj.max(1, 3.4f));
	}
}
