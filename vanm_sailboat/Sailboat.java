package vanm_sailboat;

import java.text.NumberFormat;

public class Sailboat {

	private String boatName;
	private String ownerName;
	private int numberOfSails = 0;
	private double price = 0;
	
	//default constructor method
	public Sailboat()
	{
		setBoatName("Boat");
		setOwnerName("Owner");
		setNumberOfSails(42);
		setPrice(0.0);
	}

	//parameterized constructor method
	public Sailboat(String boatName, String ownerName, int numberOfSails, double price)
	{
		setBoatName(boatName);
		setOwnerName(ownerName);
		setNumberOfSails(numberOfSails);
		setPrice(price);
	}
		
	public String getBoatName() {
		return boatName;
	}
	public void setBoatName(String aboatName) {
		boatName = aboatName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getNumberOfSails() {
		return numberOfSails;
	}
	public void setNumberOfSails(int numberOfSails) {
		this.numberOfSails = numberOfSails;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getFormattedPrice()
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(getPrice());
	}
	
	public String toString()
	{
		String rValue = "Boat Name: " + getBoatName() + ", "
				+ "Owner Name: " + getOwnerName() + ", "
				+ "Number of Sails: " + getNumberOfSails() + ", "
				+ "Price: " + getFormattedPrice();
		return rValue;
	}

}
