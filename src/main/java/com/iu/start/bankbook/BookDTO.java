package com.iu.start.bankbook;

import java.util.Calendar;

public class BookDTO {

	
	private long BookNum;
	private String BookName;
	private Double BookRate;
	private Integer BookSale;
	public long getBookNum() {
		return BookNum;
	}
	public void setBookNum(long bookNum) {
		BookNum = bookNum;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public Double getBookRate() {
		return BookRate;
	}
	public void setBookRate(Double bookRate) {
		BookRate = bookRate;
	}
	public Integer getBookSale() {
		return BookSale;
	}
	public void setBookSale(Integer bookSale) {
		BookSale = bookSale;
	}
	
	
}
