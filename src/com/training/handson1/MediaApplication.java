package com.training.handson1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MediaApplication {

	public static void main(String[] args) {
		Media[] book = new Media[2];
		book[0]= new Books("Wings of fire", "APJ Abdul Kalam", 1001, 5, 10, "General", 9012723);
		book[1]=new Books("Maths 101", "RD Sharma", 10002, 3, 8, "Maths", 2093182);
	
		Media[] dvd= new Media[2];
		dvd[0] = new DVD("Fight Club", "David Fincher", 101, 5, 8, "Action", 2);
		dvd[1] = new DVD("Dark Knight", "Christopher Nolan", 2, 5, 4, "Action-Fantasy", 1.5);
		
		Media[] periodicals = new Media[2];
		periodicals[0] = new Periodicals("Cosmopolitan", "Time magine", 10, 3, 7, "Business", 4);
		periodicals[1] = new Periodicals("Forbes", "Forbes Magine", 18, 4, 12, "Business", 22);
		
		Scanner sc= new Scanner(System.in);
		
		int flag=1;
		try{
			do{System.out.println("Choose media type: \n 1.Books 2.DVD 3.Periodicals");
		int type = sc.nextInt();
		switch(type){
		case 1: for (Media book1:book){
			book1.printMedia();
			System.out.println("");
			}
			break;
		case 2: for(Media dvd1:dvd){
			dvd1.printMedia();
			System.out.println("");
			}
			break;
		case 3: for(Media p1:periodicals){
			p1.printMedia();
			System.out.println("");}
		break;
		default: System.out.println("Invalid choice");
		System.exit(0);
			}
		}while(flag==1);
		}catch(InputMismatchException e){
			System.out.println("Not a Number  "+ e);
		}
	}

}
