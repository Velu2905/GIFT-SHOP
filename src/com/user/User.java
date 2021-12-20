package com.user;

public class User {
	

private String Username;
private String Password;
private String email;
private String mobilenumber;
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(String mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public User(String username, String password, String email, String mobilenumber) {
	super();
	Username = username;
	Password = password;
	this.email = email;
	this.mobilenumber = mobilenumber;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
private int productId;
private String productName;
private String description;
private double standardCost;
private String category;
private int QuantityOnHand;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getStandardCost() {
	return standardCost;
}
public void setStandardCost(double standardCost) {
	this.standardCost = standardCost;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public int getQuantityOnHand() {
	return QuantityOnHand;
}
public void setQuantityOnHand(int quantityOnHand) {
	QuantityOnHand = quantityOnHand;
}
public User(int productId, String productName, String description, double standardCost, String category,
		int quantityOnHand) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.description = description;
	this.standardCost = standardCost;
	this.category = category;
	QuantityOnHand = quantityOnHand;
}


}