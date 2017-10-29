
public class StringOperation2 {
	public static void main(String args[]) {
		String s = "Building Java Program";
		String s1 = "Today is Saturday";
		int i = s.indexOf(' ');
		String word = s.substring(0, i);
		System.out.println(word);
		i = s1.indexOf(' ');
		word = s1.substring(0, i);
		System.out.println(word);

	}
}
