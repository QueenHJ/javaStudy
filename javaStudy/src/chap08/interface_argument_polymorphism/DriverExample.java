package chap08.interface_argument_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.drive(new Bus());	// Vehicle = Bus
		driver.drive(new Taxi());
	}

}
