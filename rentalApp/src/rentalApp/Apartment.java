package rentalApp;

public class Apartment extends Building {

	public Apartment(String name, String address, double size) {
		super(name, address, size);
	}
	
	@Override
	public void buildingDetails() {
		System.out.println("Apartment Details: " + getName() + ", " + getAddress() + ", Size: " + getSize());
	}

}
