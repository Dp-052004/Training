package polymorphism;

public class Parent {
	public void home() {
		System.out.println("Blue");
	}
	
	public static void main(String[] args) {
		Parent p=new Parent();
		p.home();
		Child c=new Child();
		c.home();
		c.bike();
		Parent p2=new Child();  //UPCASTING
		p2.home();  //will print Red because overridden method is called
		//and it sees the object type to do the work.
	}
}

class Child extends Parent{
	@Override
	public void home() {
		System.out.println("Red");
	}
	public void bike() {
		System.out.println("BMW");
	}
}
