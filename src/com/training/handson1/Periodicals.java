package com.training.handson1;

public class Periodicals extends Media{
private double period;
	public Periodicals(String title, String author, long volume_number, int rating, int lending_length,
			String subject,double period) {
		super(title, author, volume_number, rating, lending_length, subject);
		this.period=period;
	}
	public double getPeriod() {
		return period;
	}
	public void printMedia(){
		System.out.println("Title : "+this.getTitle()+"\n"+"Author : "+this.getAuthor()+"\n"+"Volume :"+this.getVolume_number()+"\n"+"Rating : "+this.getRating()+"\n"+"Lending Length : "+this.getLending_length()+"\n"+"Subject : "+this.getSubject()+"\n"+"Period : "+this.getPeriod());		
			}


}
