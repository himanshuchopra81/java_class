
public class StringOperation {
	public static void main(String args[]) {
		String s = "Building Java Program";
		if(s.contains("Java")) {
			int i = s.indexOf("Java");
			int j = s.lastIndexOf(" ");
			String word = s.substring(i, j);
			System.out.println(word);
		}
	}

}
