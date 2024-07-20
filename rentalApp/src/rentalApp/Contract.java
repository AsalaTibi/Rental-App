package rentalApp;

public class Contract {
   private Customer customer;
   private Owner owner;
   private Building building;
   private Payment payment;
   private double rentalPeriod;
   private double price;
   
   public Contract(Customer customer,Owner owner,Building building, double rentalPeriod,double price,Payment payment) {
	   this.customer = customer;
	   this.owner = owner;
	   this.building = building;
	   this.rentalPeriod = rentalPeriod;
	   this.price = price;
	   this.payment = payment;
   }
   public void contractDetails() {
	   System.out.println("Contract Details:");
	   System.out.println("Owner Name: " + owner.getName());
	   System.out.println("Customer Name: " + customer.getName());
       System.out.println("Building: " + building.getName());
       System.out.println("Rental Period: " + rentalPeriod + " months");
       System.out.println("Price: $" + price + " per month");
       System.out.println("Paid using: " + payment.getClass().getSimpleName());
       System.out.println();
   }
}
