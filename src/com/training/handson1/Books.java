package com.training.handson1;

public class Books extends Media{

	private long ISBN_number;

	public Books(String title, String author, long volume_number, int rating, int lending_length, String subject, long ISBN_number) {
		super(title, author, volume_number, rating, lending_length, subject);
this.ISBN_number=ISBN_number;
	}
	
	public long getISBN_number() {
		return ISBN_number;
	}

	public void printMedia(){
System.out.println("Title : "+this.getTitle()+"\n"+"Author : "+this.getAuthor()+"\n"+"Volume : "+this.getVolume_number()+"\n"+"Rating : "+this.getRating()+"\n"+"Lending TIme : "+this.getLending_length()+"\n"+"Subject : "+this.getSubject()+"\n"+"ISDN Number : "+this.getISBN_number());		
	}
	
}


