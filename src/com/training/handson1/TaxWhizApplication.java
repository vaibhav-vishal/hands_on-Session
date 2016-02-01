package com.training.handson1;

import java.util.Scanner;

public class TaxWhizApplication {

	public static void main(String[] args) {
		
		TaxWhiz taxWhix = new TaxWhiz();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount: ");
		 double purchase = sc.nextDouble();
		System.out.println("The sales tax for the purchase is "+taxWhix.calcTax(purchase));
	sc.close();	
	}

}
