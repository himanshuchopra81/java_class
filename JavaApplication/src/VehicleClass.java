
public class VehicleClass {
	private int no_passengers=0;
	private double max_fuel=0;
	double fuel_efficiency=0;
	int id;
	double cost;
	protected double range() {
		return max_fuel * fuel_efficiency;
	}
	int getPassengers() {
		return no_passengers;
	}
	void setPassengers(int no) {
		no_passengers = no;
	}
	void setFuel(int max) {
		max_fuel = max;
	}
	VehicleClass() {}
	VehicleClass(int id, double cost) {
		
	}
	VehicleClass(int id) {
		this(id, 100.0);
	}
	VehicleClass(double cost) {
		this(999, cost);
	}
	public static void  main(String args[]) {
		VehicleClass Minivan = new VehicleClass();
		Minivan.no_passengers = 7;
		Minivan.max_fuel = 60;
		Minivan.fuel_efficiency = 20;
		VehicleClass Sportscar = new VehicleClass();
		Sportscar.no_passengers = 2;
		Sportscar.max_fuel = 50;
		Sportscar.fuel_efficiency = 10;
		System.out.println("Minivan can carry "+Minivan.getPassengers()+ " no. of passsengers");
		System.out.println("Minivan can travel as far as "+Minivan.range()+" no. of kms");
		System.out.println("SportsCar can carry "+Sportscar.getPassengers()+ " no. of passsengers");
		System.out.println("SportsCar can travel as far as "+Sportscar.range()+" no. of kms");
	}
	
}		
