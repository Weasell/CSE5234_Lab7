package edu.osu.cse5234.business.inventorymanagement;

public class Item {
	int id;
	String name;
	int availableQuantity;
	double price;
	String picURL;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getPicURL() {
		return picURL;
	}

	public void setPicURL(String picURL) {
		this.picURL = picURL;
	}
	
	public Item() {}
	
	public Item(int id, String name, int availQuan, double price, String picURL) {
		this.id = id;
		this.name = name;
		this.availableQuantity = availQuan;
		this.price = price;
		this.picURL = picURL;
	}
	
}
