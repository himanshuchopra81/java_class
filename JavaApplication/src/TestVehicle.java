
public class TestVehicle extends VehicleClass{

	public static void main(String args[]) {
		TestVehicle Minivan = new TestVehicle();
		Minivan.setPassengers(7);
		Minivan.setFuel(60);
		Minivan.fuel_efficiency = 20;
		TestVehicle Sportscar = new TestVehicle();
		Sportscar.setPassengers(14);
		Sportscar.setFuel(55);
		Sportscar.fuel_efficiency = 10;
		System.out.println("TestMinivan can carry "+Minivan.getPassengers()+ " no. of passsengers");
		System.out.println("TestMinivan can travel as far as "+Minivan.range()+" no. of kms");
		System.out.println("TestSportsCar can carry "+Sportscar.getPassengers()+ " no. of passsengers");
		System.out.println("TestSportsCar can travel as far as "+Sportscar.range()+" no. of kms");
	}
}
