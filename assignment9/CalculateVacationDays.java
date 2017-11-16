package assignment9;

import javax.swing.event.CaretListener;

public class CalculateVacationDays {
	int[] vacationDays;
	int yearsOfService;
	public static void main(String args[]) {
		CalculateVacationDays cal = new CalculateVacationDays();
		cal.yearsOfService=1;
		System.out.println("Number of Vacation days for "+cal.yearsOfService + " are: "+cal.displayVacationDays(cal.yearsOfService));
		
//		cal.displayVacationDays(arg);
	}
	public CalculateVacationDays() {
		vacationDays = new  int[4];
		int count=10;
		for(int i = 0; i<4; i++ ) {
			vacationDays[i] = count;
			count+=5;
		}
	}
	public int displayVacationDays(int arg) {
		int i=0;
		switch(arg) {

			case 0:{
				i=vacationDays[0];
				break;
			}
			case 1:
			case 2:
			case 3:{
				i=vacationDays[1];
				break;
			}
			case 4:
			case 5:{
				i=vacationDays[2];
				break;
			}
			default:{
				i=vacationDays[3];
				break;
			}
					
		}
		return i;
	}
}
