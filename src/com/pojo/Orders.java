package com.pojo;

import java.util.Date;

public class Orders {
private int productid;
private int orderid;
private int userid;
private Date orderdate;
private String status;
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public int getOrderid() {
	return orderid;
}
public void setOrderid(int orderid) {
	this.orderid = orderid;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public Date getOrderdate() {
	return orderdate;
}
public void setOrderdate(Date orderdate) {
	this.orderdate = orderdate;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Orders(int productid, int orderid, int userid, Date orderdate, String status) {
	super();
	this.productid = productid;
	this.orderid = orderid;
	this.userid = userid;
	this.orderdate = orderdate;
	this.status = status;
}


}
