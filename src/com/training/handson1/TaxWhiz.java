package com.training.handson1;

public class TaxWhiz {
	private double taxRate;
	
public TaxWhiz() {
		super();
		taxRate = .12;
	}

public double calcTax(double purchase){
	return taxRate*purchase;
	}
}
