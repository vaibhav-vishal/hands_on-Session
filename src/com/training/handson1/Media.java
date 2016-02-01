package com.training.handson1;

public class Media {
	private String title;
	private String author;
	private  long volume_number;
	private int rating;
	private int lending_length;
	private String subject;
	public Media(String title, String author, long volume_number, int rating, int lending_length, String subject) {
		super();
		this.title = title;
		this.author = author;
		this.volume_number = volume_number;
		this.rating = rating;
		this.lending_length = lending_length;
		this.subject = subject;
	}
	

public String getTitle() {
		return title;
	}


	public String getAuthor() {
		return author;
	}


	public long getVolume_number() {
		return volume_number;
	}


	public int getRating() {
		return rating;
	}


	public int getLending_length() {
		return lending_length;
	}


	public String getSubject() {
		return subject;
	}
public void printMedia(){}
}
