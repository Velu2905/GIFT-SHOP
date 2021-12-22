//package com.products;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class ProductDao {
//
//	public void insert(Product pr) throws ClassNotFoundException, SQLException {
//
//		String insertQuery = "insert into gproducts values(?,?,?,?,?)";
//		Connection con = ProductConnection.gbConnection();
//		PreparedStatement pstmt = con.prepareStatement(insertQuery);
//		ProductDao prodao=new ProductDao();
//
//		pstmt.setInt(1, pr.getProductId());
//		pstmt.setString(2, pr.getProductName());
//		pstmt.setString(3, pr.getDescription());
//		pstmt.setDouble(4, pr.getStandardCost());
//		pstmt.setString(5, pr.getCategory());
//
//		int i = pstmt.executeUpdate();
//		System.out.println(i + "product inserted");
//		pstmt.close();
//		con.close();
//	}
//
//	public void update(Product pr1) throws SQLException, ClassNotFoundException {
//		String UpdateQuery = "update gproducts set Product_name=? where Product_id=?";
//		Connection con = ProductConnection.gbConnection();
//		PreparedStatement pstmt = con.prepareStatement(UpdateQuery);
//		pstmt.setString(1, pr1.getProductName());
//		pstmt.setInt(2, pr1.getProductId());
//		int i = pstmt.executeUpdate();
//		System.out.println(i + "Row updated");
//		con.close();
//		pstmt.close();
//	
//}
//	
////DELETE PRODUCT
//public class DeleteDao {
//	public static void delete(Product pr1 ) throws SQLException, ClassNotFoundException {
//		 System.out.println("row deleted successfully");
//			String Deletequery="delete from gproducts where product_id=?";
//			Connection con=com.connection.ConnectionUtil.gbconnection();
//			PreparedStatement pstmt = con.prepareStatement(Deletequery);
//			pstmt.setInt(1,pr1.getProductId());
//	         int i = pstmt.executeUpdate();
//			System.out.println(i+"row deleted successfully");
//	}
//}
//}
//
