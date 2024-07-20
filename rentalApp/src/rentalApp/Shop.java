package rentalApp;

public class Shop extends Building{
	
	public Shop(String name, String address, double size) {
		super(name, address, size);
	}
	
	@Override
	public void buildingDetails() {
		System.out.println("Shop Details: " + getName() + ", " + getAddress() + ", Size: " + getSize());
	}
}
