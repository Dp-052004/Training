package abstraction;

public class Redmi3 extends Redmi2{

	@Override
	public void smartCamera() {
		System.out.println("Smart camera");
		
	}
	
	public static void main(String[] args) {
		Redmi3 r3=new Redmi3();  //obj of Redmi3
		r3.camera();
		r3.battery();
		r3.smartCamera();
		
		Mobile mb=new Redmi3();  //upcasting
		mb.battery();
		mb.camera();
		//mb.smartCamera(); //COMPILE TIME ERROR
		
		Redmi2 r2=new Redmi3();  //upcasting
		r2.battery();
		r2.camera();
		r2.smartCamera();
	}
}
