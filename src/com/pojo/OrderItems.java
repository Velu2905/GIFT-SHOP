package com.pojo;

public class OrderItems {
private int orderid;
private String username;
private String productname;
private int quantityordered;
private int totalprice;
public int getOrderid() {
	return orderid;
}
public void setOrderid(int orderid) {
	this.orderid = orderid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public int getQuantityordered() {
	return quantityordered;
}
public void setQuantityordered(int quantityordered) {
	this.quantityordered = quantityordered;
}
public int getTotalprice() {
	return totalprice;
}
public void setTotalprice(int totalprice) {
	this.totalprice = totalprice;
}
public OrderItems(int orderid, String username, String productname, int quantityordered, int totalprice) {
	super();
	this.orderid = orderid;
	this.username = username;
	this.productname = productname;
	this.quantityordered = quantityordered;
	this.totalprice = totalprice;
}

}
