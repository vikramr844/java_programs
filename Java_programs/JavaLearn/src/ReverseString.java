import java.util.Scanner;

class StringReverse {
   
	void reverseString(String words) {
		char rev = 0;
		for(int i=words.length();i<=0;i--) {
			 rev=words.charAt(i);
		}
		System.out.println(rev);
	}
}
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String letter = sc.nextLine();
        StringReverse obj=new StringReverse();
        obj.reverseString(letter);
        
     
    }
}