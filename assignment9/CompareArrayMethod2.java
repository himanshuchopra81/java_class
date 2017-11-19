
public class CompareArrayMethod2 {
boolean flag = false;
	
	public static void main(String[] args) {
		CompareArrayMethod2 cam = new CompareArrayMethod2();
		int[] arg = {12, 65, 12, 35};
		int[] arg1 = {12, 615, 12, 35};
		if(cam.checkArray(arg, arg1)) {
			System.out.println("Arrays are the same");
		}
		else {
			System.out.println("Arrays are not the same");
		}
		
	}
	//compare arrays
	public boolean checkArray(int[]a, int[] b) {
		if(a.length == b.length) {
			for(int i=0; i<a.length; i++) {
				if(a[i]==b[i]) {	
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
		return flag;
	}
}
