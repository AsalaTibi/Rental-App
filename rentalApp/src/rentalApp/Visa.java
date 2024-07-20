package rentalApp;

public class Visa extends Payment{
	
	private String cardNumber;
	private String cardType;
	
	public Visa(String cardNumber, String cardType) {
        this.cardNumber = cardNumber;
        this.cardType = cardType;
    }
	
	@Override
	public void pay(double amount){
		System.out.println("Paid"+amount+"using Visa");
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
}
