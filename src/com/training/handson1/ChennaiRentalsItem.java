package com.training.handson1;

public abstract class ChennaiRentalsItem {

	private long serialNumber;
	private long price;
	private String item_name;
	private long days;
	private int quantity;
	


	public ChennaiRentalsItem(long serialNumber, long price, String item_name, long days,int quantity) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.item_name = item_name;
		this.days = days;
		this.quantity=quantity;
	}



	public long getSerialNumber() {
		return serialNumber;
	}



	public long getPrice() {
		return price;
	}



	public String getItem_name() {
		return item_name;
	}



	public long getDays() {
		return days;
	}
	
	public int getquantity(){
		return quantity;
	}



	public abstract void productInfo();
	//public abstract void totalPrice();
	
	
	
}
