package InnerClass;

public class College {
	
	private String clgName="IEM,Kolkata";
	
	interface Staff{
		enum Gender{
			Male,Female
		}
		void showRole();
	}
	
	
	class Student{
		enum ModeofStudy{
			Online,Offline
		}
		private int id;
		private String name;
		private ModeofStudy mode;
		
		Student(int id,String name,ModeofStudy mode){
			this.id=id;
			this.name=name;
			this.mode=mode;
		}
		
		public void printStudent() {
			System.out.println("Student id:"+id);
			System.out.println("Student name:"+name);
			System.out.println("Mode of study:"+mode);
			System.out.println("College name:"+clgName);

		}
	}
	
	class Trainer implements Staff{
		private String name;
		private Gender gender;
		private String subject;
		
		Trainer(String name,Gender gender,String subject){
			this.name=name;
			this.gender=gender;
			this.subject=subject;
		}
		
		@Override
		public void showRole() {
			System.out.println("Trainer teaches "+subject);
		}
		
		public void printTrainer() {
			System.out.println("Trainer name:"+name);
			System.out.println("Gender:"+gender);
			System.out.println("Colege name:"+clgName);
		}
	}
	
	class Admin implements Staff{
		private String name;
        private Gender gender;
        
        Admin(String name,Gender gender){
        	this.name=name;
        	this.gender=gender;
        }
        
        
        public void printAdmin() {
        	System.out.println("Admin Name : " + name);
            System.out.println("Gender     : " + gender);
            System.out.println("College    : " + clgName);
        }


		@Override
		public void showRole() {
			System.out.println("Admin manages college operations");
		}
	}
	
	
	public static void main(String[] args) {
		College cg=new College();
		//Student s1=new Student(1,"ABC","Online"); //not possible to create object 
		//of inner class directly
		Student s1=cg.new Student(1,"ABC",Student.ModeofStudy.Online);
		s1.printStudent();
		System.out.println(s1.getClass());
		System.out.println("------------------------------");
		
		Trainer t1=cg.new Trainer("Dingi",Staff.Gender.Female,"Java");
		t1.printTrainer();
		t1.showRole();
		System.out.println(t1.getClass());
		System.out.println("------------------------------");
		
		Admin a1=cg.new Admin("Admin",Staff.Gender.Male);
		a1.printAdmin();
		a1.showRole();
		System.out.println(a1.getClass());		
	}
}
