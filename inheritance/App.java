package inheritance;

public class App {
	int size;
	String name;
	
	public App() {
		
	}
	
	public App(int size,String name) {
		this.size=size;
		this.name=name;
	}
	
	public static void main(String[] args) {
		WP a=new WP(200,"Whatsapp",5);
		System.out.println(a.size);
		System.out.println(a.name);
		System.out.println(a.rating);
		
		App p=new App(1000,"XYZ");
		System.out.println(p.size);
		System.out.println(p.name);
		//System.out.println(f.price);  //COMPILE TIME ERROR
	}
}

class WP extends App{
	int rating;
	WP(int size,String name,int rating){
		this.size=size;
		this.name=name;
		//super(size,name);
		this.rating=rating;
	}
}
