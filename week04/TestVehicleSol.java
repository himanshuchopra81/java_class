
public class TestVehicleSol extends VehicleClass{

	public static void main(String args[]) {
		TestVehicle Minivan = new TestVehicle();
		Minivan.setPassengers(7);
		Minivan.setFuel(60);
		Minivan.fuel_efficiency = 20;
		TestVehicle Sportscar = new TestVehicle();
		Sportscar.setPassengers(14);
		Sportscar.setFuel(55);
		Sportscar.fuel_efficiency = 10;
		System.out.println("testMinivan can carry "+Minivan.getPassengers()+ " no. of passsengers");
		System.out.println("testMinivan can travel as far as "+Minivan.range()+" no. of kms");
		System.out.println("testSportsCar can carry "+Sportscar.getPassengers()+ " no. of passsengers");
		System.out.println("testSportsCar can travel as far as "+Sportscar.range()+" no. of kms");
	}
}
