package siri.stringbasic.program;
public class StringRev {

	public static void main(String[] args) {
		String str="java is simple";
		String [] words =str.split("\\s");
		String reverseString="";
		for(String w: words) {
			String reverseword="";
			for(int i=w.length()-1;i>=0;i--) {
				reverseword=reverseword+w.charAt(i);
			}
			reverseString=reverseString+reverseword+" ";
		}
		System.out.println(reverseString);
		//second pproach
		
		String st="java is simple and easy";
		String [] word =st.split("\\s");
		String reverse="";
		for(String s:word) {
			StringBuilder sb=new StringBuilder(s);
			sb.reverse();
			reverse=reverse+sb.toString()+" ";
		}
		System.out.println(reverse);

	}

}
