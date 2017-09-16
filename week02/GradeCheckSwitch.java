import java.util.Scanner;
class GradeCheckSwitch  {

	public static void main(String args[]) {
		GradeCheckSwitch f = new GradeCheckSwitch();
		Scanner gradescan = new Scanner(System.in);	
		System.out.println("Enter grade");
		int gradeVal = gradescan.nextInt();

		System.out.println("Grade is: "+f.calculateGrade(gradeVal));
		
		
	}
	public String calculateGrade(int grade) {
//		String gradeValue="";
		switch(grade/10) {
		case 6: {
			return "D";
		}
		case 7: {
			return "C";
		}
		case 8: {
			return "B";
		}
		case 9: {
			return "A";
		}
		case 10: {
			return "A";
		}
		
			
		default: return "F";
		}
		
		
	}

}

