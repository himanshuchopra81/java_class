import java.util.Random;

public class ArrayOperations {
	public static void main(String[] arg) {
		ArrayOperations ao = new ArrayOperations();
		Random  rand = new Random();
		//random array between 1-10
		int[] p = new int[10]; 
		for(int i = 0; i <10; i++ ) {
			p[i] = rand.nextInt(10)+1;
			System.out.print(p[i] + ", ");
		}
		System.out.println();
		System.out.println("Highest number among array: "+ao.findHighest(p));
		System.out.println("Lowest number among array: "+ao.findLowest(p));
		System.out.println("Sum of array: "+ao.sumOfArray(p));
		System.out.println("Average of array: "+ao.averageOfArray(p));
	}
	public int findHighest(int arg[]) {
		int temp=arg[0];
		for(int i=1; i<arg.length; i++) {
			if(temp<arg[i]) {
				temp  = arg[i];
			}
		}
		return temp;
	}
	public int findLowest(int arg[]) {
		int temp=arg[0];
		for(int i=1; i<arg.length; i++) {
			if(temp>arg[i]) {
				temp  = arg[i];
			}
		}
		return temp;
	}
	public int sumOfArray(int arg[]) {
		int temp=0;
		for(int i : arg) {
			temp+=i;
		}
		return temp;
	}
	public int averageOfArray(int arg[]) {
		int temp=0, avg;
		for(int i : arg) {
			temp+=i;
		}
		avg = temp/arg.length;
		return avg;
	}
	
}
