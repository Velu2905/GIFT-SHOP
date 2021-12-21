package com.pojo;

public class Suppliers {
	private int productid;
	private int suppliersid;
	private String suppliersname;
	private Long suppliersmobno;
	private String companyname;
	private String companyemail;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getSuppliersid() {
		return suppliersid;
	}
	public void setSuppliersid(int suppliersid) {
		this.suppliersid = suppliersid;
	}
	public String getSuppliersname() {
		return suppliersname;
	}
	public void setSuppliersname(String suppliersname) {
		this.suppliersname = suppliersname;
	}
	public Long getSuppliersmobno() {
		return suppliersmobno;
	}
	public void setSuppliersmobno(Long suppliersmobno) {
		this.suppliersmobno = suppliersmobno;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getCompanyemail() {
		return companyemail;
	}
	public void setCompanyemail(String companyemail) {
		this.companyemail = companyemail;
	}
	public Suppliers(int productid, int suppliersid, String suppliersname, Long suppliersmobno, String companyname,
			String companyemail) {
		super();
		this.productid = productid;
		this.suppliersid = suppliersid;
		this.suppliersname = suppliersname;
		this.suppliersmobno = suppliersmobno;
		this.companyname = companyname;
		this.companyemail = companyemail;
	}
	

	
	
	
	
	

}
