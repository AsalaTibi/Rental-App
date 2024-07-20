package rentalApp;

public class House extends Building{

	public House(String name, String address, double size) {
		super(name, address, size);
	}
	
	@Override
	public void buildingDetails() {
		System.out.println("House Details: " + getName() + ", " + getAddress() + ", Size: " + getSize());
	}
   
}
