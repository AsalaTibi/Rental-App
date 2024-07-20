package rentalApp;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private List<Contract> contracts;
   
    public Customer(String name,String email) {
    	this.name = name;
    	this.email = email;
    	this.contracts = new ArrayList<>();
    }
	public List<Contract> getContracts() {
		return contracts;
	}
	public void addContract(Contract contract) {
		this.contracts.add(contract);
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
