package stringassignment;

import java.util.Scanner;

public class ParseString {
	public static void main(String args[]) {
	ParseString ps = new ParseString();
	System.out.println("Enter a string");
	Scanner scan = new Scanner(System.in);
	String text  = scan.nextLine();
	System.out.println(ps.CountVowels(text));
	
	}
	public int CountVowels(String arg) {
		int count=0;
	
		for (int i = 0; i < arg.length(); ++i) {
		    switch(arg.charAt(i)) {
		        case 'a':
		        case 'e':
		        case 'i':
		        case 'o':
		        case 'u':
		        case 'A':
		        case 'E':
		        case 'I':
		        case 'O':
		        case 'U':
		            count++;
		            break;
		        default:
		            // do nothing
		    }
		}
		return count;
		
	}
}
