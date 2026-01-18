package abstraction;


//If child class doesn't want to override all the abstract methods 
//then the class should be made abstract like the Parent

public abstract class Deva extends Parent{

	@Override
	public void homeLoan() {
		System.out.println("Home loan paid by Deva");
		
	}

//	@Override
//	public void goldLoan() {
//		// TODO Auto-generated method stub
//		
//	}
	
}
