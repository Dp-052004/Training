package inheritance;


//HAS A RELATIONSHIP
public class Person {
	String name;
	PanCard card;
	
	public static void main(String[] args) {
		Person  p=new Person();
		p.name="Dinga";
		PanCard card=new PanCard();
		card.panId="ABC123";
		card.dob="14/04/2001";
		
		p.card=card;
		System.out.println(p.name);
		System.out.println(p.card.panId);
		System.out.println(p.card.dob);
	}
}
