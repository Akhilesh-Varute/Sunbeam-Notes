package com.sunbeam;

import java.util.Objects;

public class Product implements Comparable<Product> {
	private int id;
	private String name;
	private double price;
	public Product() {
	}
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	public int hashCode() {
		int hash = Objects.hash(this.id);
		return hash;
	}
	
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(obj instanceof Product) {
			Product other = (Product) obj;
			if(this.id == other.id)
				return true;
		}
		return false;
	}
	
	public int compareTo(Product other) {
		int diff = this.id - other.id;
		return diff;
	}
}
