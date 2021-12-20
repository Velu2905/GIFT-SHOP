package com.products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.user.UserConnection;


public class DeleteDao {
	public static void delete(Product pr1 ) throws SQLException, ClassNotFoundException {
		 System.out.println("row deleted successfully");
			String Deletequery="delete from gproducts where product_id=?";
			Connection con=UserConnection.gbconnection();
			PreparedStatement pstmt = con.prepareStatement(Deletequery);
			pstmt.setInt(1,pr1.getProductId());
	         int i = pstmt.executeUpdate();
			System.out.println(i+"row deleted successfully");
	}

}
