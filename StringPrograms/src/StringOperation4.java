import java.util.Random;

public class StringOperation4 {
	public static void main(String args[]) {
		int sum=0, count=-1;
		
		Random rand = new Random();
		  do {
			  int i = rand.nextInt(6)+1;
			  int j = rand.nextInt(6)+1;
			  sum = i + j;
			  count++;
			  System.out.println(i + " + " + j + " = " + sum);
		  }
		  while(sum!=12);
		  System.out.println("You Won after"+ count+" tries");
		  
	}
}
