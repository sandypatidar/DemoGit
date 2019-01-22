import java.util.*;
public class B {
	public static void main(String[] args) {
		String s = "hello world hello hello world";
		String []word = s.split(" ");
		int j=0;
		String []wrd = new String[word.length];
		for(int i=0;i<word.length;i++) {
			if(word[i]==word[i+1
			
			
			]) {
				wrd[j++] = word[i] ;
			}
			word[i]=wrd[j];
			
			if(word[i]=="0") {
				System.out.println(word[i] + " "+ j);
			}
		}
		
	}
}