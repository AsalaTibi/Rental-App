package rentalApp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Owner owner = new Owner("Ahmad Ali", "ahmad.ali@example.com");
        Customer customer = new Customer("Khaled taha", "khaled.taha@example.com");

        Building apartment = new Apartment("123 Nablus St", "Apt 101", 1000);
        Building house = new House("456 Heteen St", "House A",2000);
        Building shop = new Shop("789 Boulevard St", "Shop 1", 1500);

        Payment payPal = new PayPal();
        
        Payment visa = new Visa("1234-5678-9876-5432", "Visa");
        
        Contract contract1 = new Contract(customer, owner, apartment, 1, 1200.00,payPal);
        Contract contract2 = new Contract(customer, owner, house, 3 , 2000.00,visa);
        
        customer.addContract(contract1);
        customer.addContract(contract2);
        
        for (Contract contract : customer.getContracts()) {
            contract.contractDetails();
        }

	}

}
