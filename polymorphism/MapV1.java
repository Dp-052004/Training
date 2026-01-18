package polymorphism;

public class MapV1 {
	public void route() {
		System.out.println("Showing Directions");
	}
	
	public static void main(String[] args) {
		System.out.println("Version 1");
		MapV1 v1=new MapV1();
		v1.route();
		
		System.out.println("Version 2");
		MapV2 v2=new MapV2();
		v2.route();
		
		System.out.println("Version 3");
		MapV3 v3=new MapV3();
		v3.bookCab();
		v3.route();
		System.out.println("Upcasting");
		MapV1 v=new MapV3();   //UPCASTING
		v.route();
		
		System.out.println("Downcasting");
		MapV3 vv=(MapV3) v;  //DOWNCASTING
		vv.bookCab();
		vv.route();
	}
}

class MapV2 extends MapV1{
	@Override
	public void route() {
		System.out.println("Showing Directions");
		System.out.println("Showing Duration");
	}
}

class MapV3 extends MapV2{
	public void bookCab() {
		System.out.println("Cab booking");
	}
}