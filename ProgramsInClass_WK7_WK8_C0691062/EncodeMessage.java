package stringassignment;

import java.util.Scanner;
// this program is to encode the message by adding the key to the char element of string
public class EncodeMessage {
	public static void main(String args[]) {
		System.out.println("Enter a string");
		Scanner scan = new Scanner(System.in);
		String text  = scan.nextLine();
		int key = scan.nextInt();
		text = text.toLowerCase();
		for(int i =0; i<text.length(); i++)
		{
			//to check if  the char is y or not
			if(text.charAt(i)<='z')
				System.out.print((char) (text.charAt(i) + key));
			// if it is y then we start the loop from z after adding 1 to it
			else {
				int min = text.indexOf(text.charAt(i));
				min = 26-min;
				System.out.print((char) ('a' + key-min-1));
			}
		}
		
	}
}
