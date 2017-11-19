
public class CompareArrayMethod1 {
	
	
	public static void main(String[] args) {
		CompareArrayMethod1 cam = new CompareArrayMethod1();
		int[] arg = {12, 65, 12, 35};
		int[] arg1 = {12, 65, 12, 35};
		boolean flag = false;
		if(arg.length == arg1.length) { 
			for(int i=0; i<arg.length; i++) {
				if(arg[i]==arg1[i]) {	
					flag = true;
				}
				else {
					flag = false;
					break;
				}
			}
		}
		else {
			flag = false;
		}
		if(flag) {
			System.out.println("Arrays are the same");
		}
		else {
			System.out.println("Arrays are not the same");
		}
		
	}
}
