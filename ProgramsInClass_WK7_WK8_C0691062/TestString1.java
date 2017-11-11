package stringassignment;

public class TestString1 {
	 public void sayHello(String arg) {
		 System.out.println("Hello<"+arg+">");
		 
	 }
	public static void main(String args[]) {
		TestString1 ts = new TestString1();
		ts.sayHello("Himanshu");
		ts.sayHello("Himanshu"+"Chopra");
		
		
	} 
	 
}
