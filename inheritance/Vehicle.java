package inheritance;

public class Vehicle {
	String brand;
	String color;
	double price;
	public void printAll() {
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
	}
	
	public static void main(String[] args) {
		Bike1 b=new Bike1("BMW","black",150);
		b.printAll();
		//System.out.println(b.brand);
		
		Vehicle v=new Vehicle();
		v.brand="Honda";
		v.color="Blue";
		v.price=100000;
		
		v.printAll();
	}
}

class Bike1 extends Vehicle{
	Bike1(String brand,String color,double price){
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
}

