
public class TestVehicle extends VehicleClass{
//	private int no_passengers=0;
//	private double max_fuel=0;
	public static void main(String args[]) {
		TestVehicle Minivan = new TestVehicle();
		Minivan.no_passengers = 7;
		Minivan.max_fuel = 60;
		Minivan.fuel_efficiency = 20;
		TestVehicle Sportscar = new TestVehicle();
		Sportscar.no_passengers = 2;
		Sportscar.max_fuel = 50;
		Sportscar.fuel_efficiency = 10;
		System.out.println("Minivan can carry "+Minivan.getPassengers()+ " no. of passsengers");
		System.out.println("Minivan can travel as far as "+Minivan.range()+"no. of kms");
		System.out.println("SportsCar can carry "+Sportscar.getPassengers()+ " no. of passsengers");
		System.out.println("SportsCar can travel as far as "+Sportscar.range()+"no. of kms");
	}
}
