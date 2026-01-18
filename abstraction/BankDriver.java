package abstraction;

public class BankDriver {
	public static void main(String[] args) {
		Bank b=new SBI();
		b.getInterestRate();
		
		System.out.println("--------------");
		Bank b1=new HDFC();
		b1.getInterestRate();
	}
}
