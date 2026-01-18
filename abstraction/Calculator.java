package abstraction;

public abstract class Calculator {
	public abstract int add(int a,int b);
	public abstract int mul(int a,int b);
	
	public int sub(int a,int b) {  //concrete method
		return a-b;
	}
}
