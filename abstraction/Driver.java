package abstraction;

public class Driver {
	public static void main(String[] args) {
		Game g=new Cricket();
		g.start();
		g.end();
		g.play();
		
		System.out.println("--------------");
		Game g1=new Football();
		g1.start();
		g1.end();
		g1.play();
	}
}
