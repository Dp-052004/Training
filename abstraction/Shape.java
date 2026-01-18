package abstraction;

public abstract class Shape {
	public abstract void area();
	public void display() {
		area();
	}
	static {  //static block 
		
	}
	
	{
		 //non static block
	}
}
