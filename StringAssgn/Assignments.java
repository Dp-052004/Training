package String_asgn;

public class Assignments {
	public static void findCommon(String s1,String s2) {
		System.out.print("Common characters:");
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			
			for(int j=0;j<s2.length();j++) {
				if(c==s2.charAt(j)) {
					System.out.print(c+" ");
					break;
				}
			}
		}
	}
	
	public static boolean isIsogram(String s) {
		s=s.toLowerCase();
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isBalanced(String s) {
		int cnt=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') cnt++;
			else if(s.charAt(i)==')') cnt--;
			
			if(cnt<0) {
				return false;
			}
		}
		return cnt==0;
	}
	
	public static void maxVowelCount(String s) {
		String[] words=s.split(" ");
		String res="";
		int max=0;
		String vowels="aeiouAEIOU";
		for(String word:words) {
			int cnt=0;
			for(int i=0;i<word.length();i++) {
				char c=word.charAt(i);
				if(vowels.indexOf(c)!=-1) cnt++;
			}
			if(cnt>max) {
				max=cnt;
				res=word;
			}
		}
		System.out.println("Maximum vowels word:"+res);
	}
	
	public static void compress(String s) {
		for(int i=0;i<s.length();i++) {
			int cnt=1;
			while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)) {
				cnt++;
				i++;
			}
			System.out.print(s.charAt(i)+""+cnt);
		}
	}
	
	public static void findSpecial(String s) {
        int count = 0;
        System.out.print("Special symbols: ");

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!Character.isLetterOrDigit(c) && c != ' ') {
                System.out.print(c + " ");
                count++;
            }
        }
        System.out.println("\nTotal count: " + count);
    }
	
	public static String removeDigits(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
			if(!Character.isDigit(s.charAt(i))) {
				res+=s.charAt(i);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		String s="abc def ghi";
		String s1="abc def fss";
		findCommon(s,s1);
		System.out.println();
		System.out.println("Isograms:");
		System.out.println(isIsogram("machine"));
		System.out.println(isIsogram("program"));
		System.out.println("Balanced parenthesis:");
		System.out.println(isBalanced("()()"));
		System.out.println(isBalanced("((())"));
		maxVowelCount("Java programming is awesome");
		System.out.println("Compressed string:");
		compress("aaabbbcc");
		System.out.println();
		System.out.println("Remove digits");
		System.out.println(removeDigits("abc123xyz9"));
		System.out.println("Special character count");
		findSpecial("Hello@123#World!");





	}
}
