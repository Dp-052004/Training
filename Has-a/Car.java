package Has_A;

public class Car {
	private int id;
	private String color;
	private String brand;
	private Engine e;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	
	
	public static void main(String[] args) {
		Car c=new Car();
		c.setId(2);
		Engine e=new Engine();
		e.setCc(14);
		e.setType("XYZ");
		c.setE(e);    //ETA LIKHTEI HOBE   OR c.e=e;
		System.out.println(c.e.getCc());
		System.out.println(c.e.getType());
	}
}
