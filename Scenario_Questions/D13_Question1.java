package Scenario_Questions;

public class D13_Question1 {
	public static void main(String[] args) {
		try {
	         BankAccount sa = new SavingsAccount();
	         sa.setAccNo(101);
	         sa.setName("Rahul");
	         sa.setBalance(5000);

	         sa.deposit(2000, "Cash");
	         sa.withdraw(3000, "ATM");

	         System.out.println("Savings Balance: " + sa.getBalance());

	         System.out.println();

	         BankAccount ca = new CurrentAccount();
	         ca.setAccNo(201);
	         ca.setName("Sneha");
	         ca.setBalance(10000);

	         ca.deposit(5000);
	         ca.withdraw(12000);

	         System.out.println("Current Balance: " + ca.getBalance());

	     } catch (InsufficientBalanceException e) {
	         System.out.println("Balance Error: " + e.getMessage());
	     } catch (InvalidAmountException e) {
	         System.out.println("Amount Error: " + e.getMessage());
	     }
	} 
}


abstract class BankAccount{
	private int accNo;
	private String name;
	private double balance;
	
	//getters
	public int getAccNo() {
		return accNo;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	
	//setters
	public void setAccNo(int accNo) {
		this.accNo=accNo;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setBalance(double balance) throws InsufficientBalanceException{
		if(balance<=0) {
			throw new InsufficientBalanceException("Balance should not be negative or zero");
		}
		this.balance=balance;
	}
	
	abstract void withdraw(double amt) throws InsufficientBalanceException;
	//overloaded abstract method
	abstract void withdraw(double amt,String note) throws InsufficientBalanceException;
	
	abstract void deposit(double amt);
	//overloaded abstract method
	abstract void deposit(double amt,String source);
}

class SavingsAccount extends BankAccount{

	@Override
	void withdraw(double amt) throws InsufficientBalanceException {
		if(amt>getBalance()) {
			throw new InsufficientBalanceException("Insufficient money in account");
		}
		setBalance(getBalance()-amt);
		System.out.println("Savings Withdrawn: " + amt);
	}

	@Override
	void withdraw(double amt, String note) throws InsufficientBalanceException {
		withdraw(amt);
        System.out.println("Reason: " + note);
	}

	@Override
	void deposit(double amt) {
		if(amt<=0) {
			throw new InvalidAmountException("Invalid deposit amount");
		}
		try {
			setBalance(getBalance()+amt);
		}catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Deposited money:"+amt);
	}

	@Override
	void deposit(double amt, String source) {
		deposit(amt);
		System.out.println("Source:"+source);
	}
	
}

class CurrentAccount extends BankAccount {

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > getBalance()) {
            throw new InsufficientBalanceException("Insufficient balance in Current Account");
        }
        setBalance(getBalance() - amount);
        System.out.println("Current Withdrawn: " + amount);
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid deposit amount");
        }
        try {
            setBalance(getBalance() + amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Current Deposited: " + amount);
    }

    // Overloaded
    @Override
    public void withdraw(double amount, String note) throws InsufficientBalanceException {
        withdraw(amount);
        System.out.println("Reason: " + note);
    }

    @Override
    public void deposit(double amount, String source) {
        deposit(amount);
        System.out.println("Source: " + source);
    }
}


class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class InvalidAmountException extends RuntimeException{
	public InvalidAmountException(String msg) {
		super(msg);
	}
}