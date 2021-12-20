package com.user;

import java.sql.SQLException;
import java.util.Scanner;

import com.products.DeleteDao;
import com.products.Product;
import com.products.ProductDao;


public class UserMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome giftshop");
		System.out.println("\n1.Register\n2.Login");
		int choice = input.nextInt();
		input.nextLine();
		UserDao usdao = new UserDao();
//		switch(choice)
//		{
//		case 1:
//			System.out.println("Enter username,email,moile number,");
//		String s1=input.next();
//		User cu= new User(s1.split(",")[0],s1.split(",")[1],Long.parseLong(s1.split(",")[2]),s1.split(",")[3]);
//		ob.insert(cu);
//		break;
		// name

		String name;
		String password;
		String email;
		String mobno;

		// boolean flag=false;
		switch (choice) {
		case 1: {

			do {
				System.out.println("Enter user Name:");
				name = input.nextLine();
				if (name.isEmpty()) {
					System.out.println("name is empty");
				} else if (!name.matches("[A-Za-z]{3,}")) {
					System.out.println("invalid name");
				}
			} while (!name.matches("[A-Za-z]{3,}"));

			do {
				System.out.println("Enter password:");
				password = input.nextLine();
				if (password.isEmpty()) {
					System.out.println("Password is empty");
				} else if (!password.matches("[A-Za-z0-9]{8,10}")) {
					System.out.println("invalid password");
				}
			} while (!password.matches("[A-Za-z0-9@#$%!^&*]{8,10}"));

			do {
				System.out.println("Enter email ID:");
				email = input.nextLine();
				if (email.isEmpty()) {
					System.out.println("email is empty");
				} else if (!email.matches("[a-z0-9]+[@][a-z]+[.][a-z]+")) {
					System.out.println("invalid email id");
				}
			} while (!email.matches("[a-z0-9]+[@][a-z]+[.][a-z]+"));

			do {
				System.out.println("Enter Phone Number:");
				mobno = input.nextLine();
				if (mobno.isEmpty()) {
					System.out.println("Mobile number is empty");
				}
				if (!mobno.matches("[6-9][0-9]{9}")) {
					System.out.println("invalid mobile number");

				}
			} while (!mobno.matches("[6-9]{1}[0-9]{9}"));

			User obj = new User(name, password, email, mobno);

			usdao.insert(obj);

		}
			break;

		case 2:
			UserDao user1 = new UserDao();
//	System.out.println("login");
			System.out.println("Enter your mail");
			String Email = input.nextLine();
			System.out.println("Enter your password");
			String cpassword1 = input.nextLine();

			boolean flag1 = user1.validateuser(Email, cpassword1);
			if (flag1) {
				System.out.println("Login successfull");
				System.out.println("Show products");
				ProductDaoo proddao = new ProductDaoo();
				
			} else {
				System.out.println("Invalid username(or)password");
			}
		
		ProductDaoCls prod=new ProductDaoCls();
			
			
	}
}}