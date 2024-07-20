package rentalApp;

import java.util.ArrayList;
import java.util.List;

public class Owner {
	
	private String name;
	private List<Contract> contracts;
	private String email;

	public Owner(String name,String email) {
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public List<Contract> getContracts() { 
		return contracts;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
