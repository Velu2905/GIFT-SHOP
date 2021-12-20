package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDao {
	
//	REGISTRATION
public void insert (User ob2) throws ClassNotFoundException, SQLException {
		String insertQuery="insert into user_gift(user_name,email,mobile_number,user_Password) values(?,?,?,?)";
		Connection con=UserConnection.gbconnection();
		PreparedStatement pstmt=con.prepareStatement(insertQuery);
		pstmt.setString(1,ob2.getUsername());
		pstmt.setString(2,ob2.getEmail());
		pstmt.setString(3,ob2.getMobilenumber());
		pstmt.setString(4,ob2.getPassword());	
	int i = pstmt.executeUpdate();
	System.out.println("Registration successful");	
    pstmt.close();
	con.close();
	}

//LOGIN VALIDATION
public  boolean validateuser(String Email,String cpassword1  ) throws ClassNotFoundException, SQLException {
	String  validate="select * from user_gift where email = ? and user_password = ?";
	Connection con=UserConnection.gbconnection();
    PreparedStatement Pstmt1 = con.prepareStatement(validate);
    Pstmt1.setString(1, Email);
    Pstmt1.setString(2, cpassword1);
	ResultSet rs = Pstmt1.executeQuery();
	if(rs.next()) {
		return true;
	}
	return false;
}
}