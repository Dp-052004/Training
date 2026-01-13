package assignment;

public class charChange {
	public static void main(String[] args) {
		char ch='a';
		if(ch>='A' && ch<='Z') {
			ch=(char)(ch+32);
		}
		else {
			ch=(char)(ch-32);
		}
		System.out.println(ch);
	}
}
