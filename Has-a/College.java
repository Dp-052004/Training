package Has_A;

public class College {
	private String name;
	private String location;
	private Student s;
	private Trainer t;
	
	//GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Student getS() {
		return s;
	}
	public void setS(Student s) {
		this.s = s;
	}
	public Trainer getT() {
		return t;
	}
	public void setT(Trainer t) {
		this.t = t;
	}
	
	
	public static void main(String[] args) {
		College cg=new College();
		cg.setName("IEM");
		cg.setLocation("College more");
		Student st=new Student();
		st.setId(12);
		st.setName("Dinga");
		cg.s=st;
		System.out.println(cg.s.getId());
		System.out.println(cg.s.getName());
		
		
		
		
		
		
		Trainer t=new Trainer();
		t.setName("SSG");
		t.setSubj("DSA");
		cg.t=t;;
		System.out.println(cg.t.getName());
		System.out.println(cg.t.getSubj());
	}
}
