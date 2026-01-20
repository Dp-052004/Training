package abstraction;

public class Phone {
	private Battery battery;  // strong relation
	private Sim sim;          // weak relation

	// aggregation
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}

	// composition
	public Phone() {
		battery = new Battery();
	}

	public static void main(String[] args) {
		Phone mobile = new Phone();
		mobile.battery.charge();

		mobile.setSim(new Sim());
		mobile.getSim().network();
	}
}

//composition class
class Battery {
	public void charge() {
		System.out.println("Battery charging");
	}
}

//aggregation class
class Sim {
	public void network() {
		System.out.println("Network: Jio");
	}
}
