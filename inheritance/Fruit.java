package inheritance;

public class Fruit {
	String color;
	String name;
	
	public Fruit() {
		
	}
	
	public Fruit(String color,String name) {
		this.color=color;
		this.name=name;
	}
	
	public static void main(String[] args) {
		Apple a=new Apple("red","kashmiri apple",200);
		System.out.println(a.color);
		System.out.println(a.name);
		System.out.println(a.price);
		
		Fruit f=new Fruit("Green","Indian");
		System.out.println(f.color);
		System.out.println(f.name);
		//System.out.println(f.price);  //COMPILE TIME ERROR
		
	}
}

class Apple extends Fruit{
	double price;
	Apple(String color,String name,double price){
		this.color=color;
		this.name=name;
		this.price=price;
	}
}
