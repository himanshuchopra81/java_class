import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

class GradeCheckIf  {

	public static void main(String args[]) {
		GradeCheckIf obj = new GradeCheckIf();
		Scanner gradescan = new Scanner(System.in);	
		System.out.println("Enter grade");
		int gradeVal = gradescan.nextInt();

		System.out.println(obj.calculateGrade(gradeVal));
		
		
	}
	public String calculateGrade(int grade) {
		if(grade >= 90) {
			return "A";
		}
		if(grade >= 80) {
			return "B";
		}
		if(grade >= 70) {
			return "C";
		}
		if(grade >= 60) {
			return "D";
		}
		else {
			return "E";
		}
			
		
	}

}

