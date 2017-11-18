package assignment9;

public class ReverseArray {
	public static void main(String args[]) {
		int[] firstArray = new int[7];
		int[] secondArray = new int[7];
		Random rand = new Random();
		//int rand_array = rand.nextInt(100-1) + 1;
		
		for(int i =0; i<firstArray.length;i++) {
			firstArray[i] = rand.nextInt(100) ;
		}
		
		secondArray = reverseArray(firstArray);
		System.out.print("first array: ");
		
		for(int i : firstArray) {
			System.out.print(i+", ");}
		
		System.out.println();
		System.out.print("second array: ");
		
		for(int i : secondArray) {
			System.out.print(i+", ");}
	}
	public static int[] reverseArray(int i[]) {
		int y[] = new int[i.length];
		int count=0;
		for(int j =y.length-1; j>= 0; j--) {
			y[j] = i[count++];
		}
		return y;
	}
}
