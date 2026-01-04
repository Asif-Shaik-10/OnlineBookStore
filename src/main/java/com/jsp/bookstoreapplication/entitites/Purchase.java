package com.jsp.bookstoreapplication.entitites;
import com.jsp.bookstoreapplication.entitites.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Purchase {
	
	@Id
	int pid;
	@Override
	public String toString() {
		return "Purchase [pid=" + pid + ", cid=" + cid + ", bid=" + bid + ", date=" + date + ", noofbooks=" + noofbooks
				+ "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNoofbooks() {
		return noofbooks;
	}
	public void setNoofbooks(String noofbooks) {
		this.noofbooks = noofbooks;
	}
	int cid;
	int bid;
	String date;
	String noofbooks;
	
	
	
	
	
	 
	
	
	

}
