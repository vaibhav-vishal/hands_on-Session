package com.training.handson1;

public class Fan extends ChennaiRentalsItem{

	public Fan(long serialNumber, long price, String item_name,long days,int quantity) {
		super(serialNumber, price, item_name, days,quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void productInfo() {
		System.out.println("Serial No :"+this.getSerialNumber());
		System.out.println("Name :"+this.getItem_name());
		System.out.println("Quantity :"+this.getquantity());
		System.out.println("Rent duration :"+this.getDays());
		System.out.println("Price :"+this.getPrice()+"\n");
		}

//	@Override
//	public void totalPrice() {
//		System.out.println("Total price :"+this.getPrice()*this.getDays()*this.getquantity());
		
//	}
	

}
