package abstraction;

public class Car {
	private Engine engine;  //strong relation Composition
	private Owner owner;    //weak relation Aggregation
	
	
	//For strong relation (COMPOSITION)
	public Car() {
		engine=new Engine();
	}
	
	//For weak relation (AGGREGATION)
	public Owner getOwner() {
		return owner;
	}
	
	public void setOwner(Owner owner) {
		this.owner=owner;
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.engine.start();

		car.setOwner(new Owner());
		car.getOwner().details();
	}
}

class Engine{
	public void start() {
		System.out.println("Engine started");
	}
}

class Owner{
	public void details() {
		System.out.println("Owner Dinga");
	}
}