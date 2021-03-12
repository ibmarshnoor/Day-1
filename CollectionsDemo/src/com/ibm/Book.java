package com.ibm;
public class Book {
     private String title;
     private float price;
     private int PublisherYear;
      public int getPublisherYear() {
		return PublisherYear;
	}

	public void setPublisherYear(int publisherYear) {
		PublisherYear = publisherYear;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Book(String title) {
    	 this.title=title;
     }
     
	 public String getTitle() {
		return title;
	 }

	 public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return "{price=}"+this.price+", title="+this.title+", publishYear="+this.PublisherYear+"}";
	}
}
