package abstraction;

public class Football extends Game{

	@Override
	public void start() {
		System.out.println("Football starts");
	}

	@Override
	public void end() {
		System.out.println("Football ends");
	}
}
