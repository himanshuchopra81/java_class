package stringassignment;

public class StringPlay {
	public static void main(String args[]) {
		String message1="Building Java Programs";
		//print java if the string contains it
		if(message1.contains("Java")) {
			int i = message1.indexOf("Java");
			int j = message1.lastIndexOf(" ");
			String word = message1.substring(i, j);
			System.out.println(word);
		}
		
		String message2 = "Building Java Program";
		//String s1 = "Today is Saturday";
		int i = message2.indexOf(' ');
		String word1 = message2.substring(0, i);
		System.out.println(word1);
		//to replace d with f
		String message3 = "If You do not know where "
				+ "You want to go You will not know which "
				+ "way to go";
		message3 = message3.replace("d", "f");
		System.out.println(message3);
		//changing the string to lower case
		//then replacing all YOU with WE word
		message3  = message3.toLowerCase();
		message3 = message3.replaceAll("you", "we");
		System.out.println(message3);
		
		//if statements to check if str1 and str2 starts with blue
		String str1 = "Lavender is also my favorite color.";
		String str2 = "Blue is favorite color";
		if(str1.startsWith("Blue")) {
			System.out.println(str1);
		}
		if(str2.startsWith("Blue")) {
			System.out.println(str2);
		}
		
		
	}
}
