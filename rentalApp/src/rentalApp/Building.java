package rentalApp;

public abstract class Building {
      private String address;
      private double size;
      private String name;
    public Building() {
	}
    public Building(String name,String address,double size) {
    	this.name = name;
    	this.address = address;
    	this.size = size;
    }
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void buildingDetails();
      
}
