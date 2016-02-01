package com.training.handson1;

public class DVD extends Media{
	private double running_time;
		
	public DVD(String title, String author, long volume_number, int rating, int lending_length, String subject, double running_time) {
		super(title, author, volume_number, rating, lending_length, subject);
		this.running_time=running_time;
	}

	public double getRunning_time() {
		return running_time;
	}

	public void printMedia(){
		System.out.println("Title : "+this.getTitle()+"\n"+"Author : "+this.getAuthor()+"\n"+"Volume :"+this.getVolume_number()+"\n"+"Rating : "+this.getRating()+"\n"+"Lending Length : "+this.getLending_length()+"\n"+"Subject : "+this.getSubject()+"\n"+"unning Time : "+this.getRunning_time());		
			}

}
