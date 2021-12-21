package com.daoclass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.ConnectionUtil;
import com.pojo.Product;


public class ProductDao1 {

	public void insert(Product pr) throws ClassNotFoundException, SQLException {

		String insertQuery = "insert into gproducts (product_id,product_name,description,standard_cost,category,quantity_onhand)values(?,?,?,?,?,?)";
		Connection con = ConnectionUtil.gbconnection();
		PreparedStatement pstmt = con.prepareStatement(insertQuery);
		// ProductDao prodao=new ProductDao();

		pstmt.setInt(1, pr.getProductId());
		pstmt.setString(2, pr.getProductName());
		pstmt.setString(3, pr.getDescription());
		pstmt.setDouble(4, pr.getStandardCost());
		pstmt.setString(5, pr.getCategory());
		pstmt.setInt(6, pr.getQuantityonhand());

		int i = pstmt.executeUpdate();
		System.out.println(i + "product inserted");
		pstmt.close();
		con.close();
	}

	public void update(Product pr1) throws SQLException, ClassNotFoundException {
		String UpdateQuery = "update gproducts set category=? where Product_id=?";
		Connection con = ConnectionUtil.gbconnection();
		PreparedStatement pstmt = con.prepareStatement(UpdateQuery);
		pstmt.setString(1, pr1.getProductName());
		pstmt.setInt(2, pr1.getProductId());
		int i = pstmt.executeUpdate();
		System.out.println(i + "Row updated");
		con.close();
		pstmt.close();

	}
	
		
	
	public void admin_showproduct() {
		String prod = "select*from gproducts";
		Connection con;
		try {
			con = ConnectionUtil.gbconnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(prod);
			while (rs.next()) {
				System.out.format("%-15s%-15s%-25s%-25s%-15s%-5s",rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5),rs.getInt(6));
				System.out.println();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void showproduct() {
		String prod = "select*from gproducts";
		Connection con;
		try {
			con = ConnectionUtil.gbconnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(prod);
			while (rs.next()) {
				System.out.format("%-15s%-25s%-25s%-15s",rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5));
				System.out.println();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void mens() {
		String prod = "select * from gproducts where category='mens'";
		Connection con;
		try {
			con = ConnectionUtil.gbconnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(prod);
//			rs.next();
//			System.out.format("%-15s%-25s%-25s%-15s",rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5));
			while (rs.next()) {
				System.out.format("%-15s%-25s%-25s%-15s",rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5));
				System.out.println();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void womens() {
		String prod = "select * from gproducts where category='womens'";
		Connection con;
		try {
			con = ConnectionUtil.gbconnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(prod);
//			rs.next();
//			System.out.format("%-15s%-25s%-25s%-15s",rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5));
			while (rs.next()) {
				System.out.format("%-15s%-25s%-25s%-15s",rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5));
				System.out.println();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void kids() {
		String prod = "select * from gproducts where category='kids'";
		Connection con;
		try {
			con = ConnectionUtil.gbconnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(prod);
//			rs.next();
//			System.out.format("%-15s%-25s%-25s%-15s",rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5));
			while (rs.next()) {
				System.out.format("%-15s%-25s%-25s%-15s",rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5));
				System.out.println();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public class DeleteDao {
		public static void delete(Product pr1 ) throws SQLException, ClassNotFoundException {
			 System.out.println("row deleted successfully");
				String Deletequery="delete from gproducts where product_id=? and product_name=?";
				Connection con=ConnectionUtil.gbconnection();
				PreparedStatement pstmt = con.prepareStatement(Deletequery);
				pstmt.setInt(1,pr1.getProductId());
				pstmt.setString(2, pr1.getProductName());
		         int i = pstmt.executeUpdate();
				System.out.println(i+"row deleted successfully");
		}
}

//DELETE PRODUCT
//	 class DeleteDao {
//		public static void delete(Product pr1) throws SQLException, ClassNotFoundException {
//			System.out.println("row deleted successfully");
//			String Deletequery = "delete from gproducts where product_id=?";
//			Connection con = com.connection.ConnectionUtil.gbconnection();
//			PreparedStatement pstmt = con.prepareStatement(Deletequery);
//			pstmt.setInt(1, pr1.getProductId());
//			int i = pstmt.executeUpdate();
//			System.out.println(i + "row deleted successfully");
//		}





	}


