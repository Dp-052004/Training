package abstraction;

public class ShapeDriver {
	public static void main(String[] args) {
		Shape s=new Circle();
		s.area();
//		s.display();
		
		System.out.println("--------------");
		Shape s1=new Rectangle();
		s1.area();
//		s1.display();
		
	}
}
