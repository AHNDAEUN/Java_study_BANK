package com.iu.start.bankAccount;

import java.sql.Date;

public class AccountDTO {
		//멤버 변수명
	private Long  accountNum; // 두글자인경우 accountNum으로 자성
	private String userName;
	private Integer bookNum;
	private Date accountDate;
	
	
	public Long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(Long accountNum) {
		this.accountNum = accountNum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getBookNum() {
		return bookNum;
	}
	public void setBookNum(Integer bookNum) {
		this.bookNum = bookNum;
	}
	public Date getAccountDate() {
		return accountDate;
	}
	public void setAccountDate(Date accountDate) {
		this.accountDate = accountDate;
	}
	
	

	


}
