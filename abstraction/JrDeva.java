package abstraction;

public class JrDeva extends Deva{

	@Override
	public void goldLoan() {
		System.out.println("Gold loan paid by Jr Deva");
	}
	
	public void bike() {
		System.out.println("BMW");
	}
	
	public static void main(String[] args) {
		JrDeva jd=new JrDeva();
		jd.homeLoan();
		jd.goldLoan();
		jd.bike();  //accessible because it is the method in JrDeva class
		
		Parent p=new JrDeva();  //UPCASTING and then both methods accessible 
		//as both methods have been overridden
		System.out.println("\n\nAFTER UPCASTING");
		p.homeLoan();
		p.goldLoan();
		//p.bike();  //COMPILE TIME ERROR
		
		System.out.println("\n\n");
		Deva d=new JrDeva();
		d.homeLoan();
		d.goldLoan();
		//d.bike();  //COMPILE TIME ERROR
	}
}
