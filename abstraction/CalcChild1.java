package abstraction;

public class CalcChild1 extends Calculator{

	@Override
	public int add(int a, int b) {
		return a+b;
	}
	
	@Override
	public int mul(int a, int b) {
		return a*b;
	}
	
	public void m1() {
		System.out.println("Child method");
	}
	public static void main(String[] args) {
		//Calculator c=new Calculator();  //error because we can't create 
		//obj of abstract class
		Calculator c1=new CalcChild1();   //Upcasting
		System.out.println(c1.add(2, 6));  //add method called and result is 8 
		//because this method is overridden in child class and for non static method
		//object reference is seen 
		
		System.out.println(c1.mul(2, 6)); 
		System.out.println(c1.sub(2, 6)); 
		//c1.m1();  // cannot access child methods after upcasting 
	}

}
