import java.util.*;
public class C {
		public static String revers(String s) {
			String result = "";
			for(int i=s.length()-1;i>=0;i--) {
				result =  result + s.charAt(i);
			}
			return result;
		}
	public static void main(String[] args) {
		String str = "sandeep patidar from hanumantiya thats true";
		String ans = "";
		int x=0,y=-1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' '||i==(str.length()-1)) {
				if(i==(str.length()-1)) {
					y++;
				}
				String temp = str.substring(x,y+1);
				x= y+1;
				y = y+1;
				ans = ans +" "+ revers(temp);
			} else  {
				y++;
			}
		}
		System.out.println(str);
		System.out.println(ans);
	}
	
}