package stringassignment;

import java.util.Scanner;

public class TestString2 {
	public static void main(String args[]) {
		System.out.println("What is your name?");
		Scanner scan = new Scanner(System.in);
		String name  = scan.nextLine();
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		
		
	}
}
