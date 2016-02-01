package com.training.handson1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChennaiRentals_application {
static int sno=100;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{	int days,quantity,price;
		int flag = 1;
		do{System.out.println("What item do you want to rent\n 1.Fan 2.Furniture 3.Ac 4.Vessels 5.Exit");
	int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1: Fan[] fan={};
				price = 100;
				System.out.println("Choose number of days : ");
		  		days = sc.nextInt();
				System.out.println("Choose number of fans : ");
				quantity = sc.nextInt();
				fan = new Fan[quantity];
					for(int j=0;j<quantity;j++){	
						fan[j]=new Fan(sno, price, "Fan", days, quantity);
						sno++;
						fan[j].productInfo();
						if(j==quantity-1)System.out.println("Total Price :"+price*days*quantity);
				
					}
				
				
				break;
				
		case 2:	Furniture[] fur={};
				price = 50;
				System.out.println("Choose number of days : ");
  				days = sc.nextInt();
  				System.out.println("Choose number of Furnitures : ");
  				quantity = sc.nextInt();
  				fur = new Furniture[quantity];
  					for(int j=0;j<quantity;j++){	
  						fur[j]=new Furniture(sno, price, "Furniture", days, quantity);
  						fur[j].productInfo();
  						sno++;
  						if(j==quantity-1)System.out.println("Total Price :"+price*days*quantity);
  					
  					}
			break;
			
		case 3: Ac[] ac={};
				price = 200;
				System.out.println("Choose number of days : ");
				days = sc.nextInt();
				System.out.println("Choose number of Ac : ");
				quantity = sc.nextInt();
				ac = new Ac[quantity];
					for(int j=0;j<quantity;j++){	
						ac[j] = new Ac(sno, price, "AC", days, quantity);
						ac[j].productInfo();
						sno++;
						if(j==quantity-1)System.out.println("Total Price :"+price*days*quantity);

					}
			break;
			
		case 4: Vessles[] ves={};
				price = 30;
				System.out.println("Choose number of days : ");
				days = sc.nextInt();
				System.out.println("Choose number of Vessels : ");
				quantity = sc.nextInt();
				ves = new Vessles[quantity];
					for(int j=0;j<quantity;j++){	
						ves[j]=new Vessles(sno, price, "Vessle", days, quantity);
						ves[j].productInfo();
						sno++;
						if(j==quantity-1)System.out.println("Total Price :"+price*days*quantity);
					
					}
			break;
		
		case 5:System.out.println("Thank you.\n Visit again.");
			System.exit(0);
		default: System.out.println("Invalid input");
		System.exit(0);
		}
		}while(flag ==1);
		}catch(InputMismatchException e){
			System.out.println("Invalid choice "+e);
		}
		sc.close();
	}

}
