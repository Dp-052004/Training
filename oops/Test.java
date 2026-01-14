package oops;

public class Test {
	private int roll;
	private double marks;
	private int pin;
	
	public int getRoll() {
		return roll;
	}
	public double getMarks(int pin) {
		if(this.pin==pin) {
			return marks;
		}
		System.out.println("Incorrect pin");
		return -1;
	}
	public int getPin() {
		return pin;
	}
	
	
	//SETTERS
	public void setRoll(int roll) {
		this.roll=roll;
	}
	public void setMarks(double marks) {
		if(marks>=0 && marks<=100) {
			this.marks=marks;
		} else {
			System.out.println("Invalid marks");
		}
	}
	public void setPin(int pin) {
		this.pin=pin;
	}
	
	public static void main(String[] args) {
		System.out.println("TEST DETAILS\n");
		Test ts=new Test();
		ts.setRoll(1);
		ts.setPin(1234);
		ts.setMarks(90);
		
		System.out.println("Roll No: " + ts.getRoll());
        System.out.println("Marks (correct PIN): " + ts.getMarks(1234));
        System.out.println("Marks (wrong PIN): " + ts.getMarks(12));
	}
}
