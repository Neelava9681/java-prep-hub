package com.jspider.arrayobjects;

public class TextBook {
	int id;
	String bookName;
	String autherName;
	int pageNo;
	double price;
	public TextBook(int id, String bookName, String autherName, int pageNo, double price) {
//		super();
		this.id = id;
		this.bookName = bookName;
		this.autherName = autherName;
		this.pageNo = pageNo;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return this.id+","+this.bookName+","+this.autherName+","+this.pageNo+","+this.price;
	}
	
	
}
