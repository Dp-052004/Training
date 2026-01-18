package inheritance;

public class Child1 extends Parent1{
	public void m2() {
		System.out.println("Child");
	}
	public static void main(String[] args) {
		Child1 c=new Child1();
		Parent1 p=c;  //UPCASTING
		p.m1();
		//p.m2();  //Compile Time Error
		
		//DOWNCASTING
		Child1 c2=(Child1)p;
		c2.m1();
		c2.m2();
	}
}
