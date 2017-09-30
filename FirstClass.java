class Test{
	private int x;
	void setX(int a ){
		x =a;
	}
	int getX() {
		return x;
	}
}

public class FirstClass{
	public static void main(String args[]){
		int myNumber = 7;
		Test onj = new Test();
		System.out.println("Default value of Instance variable x is" + onj.getX());
		onj.setX(myNumber);
		System.out.println("New value of Instance variable x is" + onj.getX());
		
	}
}