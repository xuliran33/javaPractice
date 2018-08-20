package com.mingrisoft;

public class Book1 {
	private String title;
	private String author;
	private double price;
	private static int counter = 0;
	private String shop;
	
	public Book1(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book1(String title) {
		System.out.println("售出图书: " + title);
		counter++;
	}
	
	public static int getCounter() {
		return counter;
	}
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}

	public String getShop() {
		return shop;
	}

	public void setShop(String shop) {
		this.shop = shop;
	}
}
