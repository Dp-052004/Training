package DSAssgn;

public class Binary {
	public static boolean isBinaryString(String s) {
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch!='0' && ch!='1') {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
        String s = "1010101";

        if (isBinaryString(s))
            System.out.println("Binary String");
        else
            System.out.println("Not a Binary String");
    }
}
