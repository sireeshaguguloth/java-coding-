package siri.stringbasic.program;

public class Reverse {

	public static void main(String[] args) {
		String s = "java by james  bond 007";
	//print only vowels
		for(int i=0;i<s.length()-1;i++) {
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				System.out.print(c+" ");
		}		
		}
		System.out.println();
		//print only digit
		for(int i=0;i<s.length();i++) {
			char c1=s.charAt(i);
			if(c1=='0'||c1=='1'||c1=='2'||c1=='3'||c1=='4'||c1=='5'||c1=='6'||c1=='7') {
				System.out.print(c1+" ");
		    }		
		}
	     System.out.println();
		int total = 1;
	      
	      for (int i = 0; i < s.length(); i++) {
	     
	         if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
	            total++;  
	         }
	      }
	      System.out.print(total);
	     
	}

}
