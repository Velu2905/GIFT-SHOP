package com.daoclass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.pojo.Admin;

public class AdminDao {
	

	public  Admin validateadmin(String email1, String pass) throws ClassNotFoundException, SQLException
	{
		System.out.println(email1);
		Connection con=com.connection.ConnectionUtil.gbconnection();
		String query1="select * from gadmin where email_id=? and password=?";

			PreparedStatement pst=con.prepareStatement(query1);
			pst.setString(1, email1);
			pst.setString(2, pass);
			ResultSet rs=pst.executeQuery();
			Admin admin=null;
			if(rs.next())
			{
//				System.out.println(rs.getString(2));
			admin=new Admin(rs.getString(1), rs.getString(2), rs.getString(3));
			}
			return admin;
		
	}
	
}
