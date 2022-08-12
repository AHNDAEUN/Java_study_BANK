package com.iu.start.bankbook;

import java.util.Calendar;

public class BookDTO {

	
	private long booknum;
	private String bookname;
	private Double bookrate;
	private Integer booksale;
	public long getBooknum() {
		return booknum;
	}
	public void setBooknum(long booknum) {
		this.booknum = booknum;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Double getBookrate() {
		return bookrate;
	}
	public void setBookrate(Double bookrate) {
		this.bookrate = bookrate;
	}
	public Integer getBooksale() {
		return booksale;
	}
	public void setBooksale(Integer booksale) {
		this.booksale = booksale;
	}
	
	
	
}