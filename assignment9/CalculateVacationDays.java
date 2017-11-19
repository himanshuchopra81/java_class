import java.util.Random;

public class CalculateVacationDays {
	static int[] vacationDays;
	public static void main(String args[]){
		CalculateVacationDays ad = new CalculateVacationDays();
		//int[] vacationDays = null;
		Random rand = new Random();
		int yearsOfService = rand.nextInt(10-1) + 1;
		int res = ad.displayVacationDays(yearsOfService);
		System.out.print("Vacation Days are for " +res+ " of employment: "+vacationDays[res]);
	}
	public CalculateVacationDays() {
		vacationDays = new int[7];
		vacationDays[0] = 10;
		vacationDays[1] = 15;
		vacationDays[2] = 15;
		vacationDays[3] = 15;
		vacationDays[4] = 20;
		vacationDays[5] = 20;
		vacationDays[6] = 25;
	}
	public int displayVacationDays(int num) {
		return num>0 && num<6 ? num : 6;
		
	}
}
