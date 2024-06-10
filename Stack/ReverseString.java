import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
	public static void reverse(String s) {
		Stack<Character> st=new Stack<>();
		System.out.println("Given String:"+ s);
		String reversedString="";
		for(int i=0;i<s.length();i++) {
			st.push(s.charAt(i));
		}
		for(int i=0;i<s.length();i++) {
			reversedString+=st.pop();
		}
		System.out.println("Reverse String: "+reversedString);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		reverse(s);
	}
}

Enter a string:
Bharti Rana
Given String:Bharti Rana
Reverse String: anaR itrahB
