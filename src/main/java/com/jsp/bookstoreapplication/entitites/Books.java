package com.jsp.bookstoreapplication.entitites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Books {

	@Id
	private Integer bid;
	private String bname;
	private String author;
	private String price;
	private String nbooks;


	
	public Integer getBid() {
		return bid;
	}



	public void setBid(Integer bid) {
		this.bid = bid;
	}



	public String getBname() {
		return bname;
	}



	public void setBname(String bname) {
		this.bname = bname;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}



	public String getNbooks() {
		return nbooks;
	}



	public void setNbooks(String nbooks) {
		this.nbooks = nbooks;
	}


	@Override
	public String toString() {
	    return "<pre>" +
	           "------ Book Details ------\n" +
	           "Book ID       : " + bid + "\n" +
	           "Book Name     : " + bname + "\n" +
	           "Author        : " + author + "\n" +
	           "Price         : " + price + "\n" +
	           "No. of Books  : " + nbooks + "\n" +
	           "---------------------------" +
	           "</pre>";
	}

	
}
