package com.mainproject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.daoclass.AdminDao;
import com.daoclass.ProductDao1;
import com.daoclass.UserDao;
import com.pojo.Admin;
import com.pojo.Product;
import com.pojo.User;

public class UserMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome giftshop");
		System.out.println("\n1.Register\n2.User login\n3.admin login");
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
				System.out.println("\n1.All collections\n2.Show categories\n3.your orders\n4.order items");
			int choice2=Integer.parseUnsignedInt(input.nextLine());
			switch (choice2) {
			case 1:
				ProductDao1 proddao=new ProductDao1();
				proddao.showproduct();
				break;
			case 2:
				System.out.println("\n1.Mens\n2.Womens\n3.Kids\n4.Occasions");
				int choice3=Integer.parseUnsignedInt(input.nextLine());
				switch (choice3) {
				case 1:
					//mens
					ProductDao1 proddao1=new ProductDao1();
					proddao1.mens();
					break;
				case 2:
					ProductDao1 proddao2=new ProductDao1();
					proddao2.womens();
					break;
				case 3 :
					ProductDao1 proddao3=new ProductDao1();
					proddao3.kids();
					break;
					
				}
			}
				
			} else {
				System.out.println("Invalid username(or)password");
			}
			break;
			
		case 3:
			AdminDao admin1 = null;
			Admin admin11 = null;

			do {
				AdminDao admin = new AdminDao();
				System.out.println("\nenter the register email id");
				String email1 = input.nextLine();
				System.out.println("\nenter the  password");
				String pass = input.nextLine();
				admin11 = new Admin(null, email1, pass);
				admin1 = new AdminDao();
				admin11 = admin.validateadmin(email1, pass);
				System.out.println(admin11.getName());
				if (admin11 != null) {
					System.out.println("login successed " + admin11.getName());
					System.out.println("\n1.Insert product\n2.update product\n3.delete product\n4.show product");
					int select = Integer.parseInt(input.nextLine());
					switch (select) {
					case 1:
						System.out.println("Enter insert details:");
						System.out.println("Enter product id");
						int s1 = Integer.parseInt(input.next());
						System.out.println("Enter product name");
						String s3 = input.next();
						System.out.println("Enter product Description");
						String s4 = input.next();
						System.out.println("Enter product Standard cost");
						double s5 = Double.parseDouble(input.next());
						System.out.println("Enter product category");
						String s6 = input.next();
						System.out.println("Enter stock quantity");
						int s7 = Integer.parseInt(input.next());
						Product pr = new Product(s1, s3, s4, s5, s6, s7);
						ProductDao1 prodao = new ProductDao1();
						prodao.insert(pr);
						break;
					case 2:
						System.out.println("Enter your update details-first product name,next Product id ");
						String s2 = input.next();
						Product pr1 = new Product(s2.split(",")[0], Integer.parseUnsignedInt(s2.split(",")[1]));
						ProductDao1 prodao1 = new ProductDao1();
						prodao1.update(pr1);
						break;
					case 3:
//						ProductDao1 proddao1=new ProductDao1();
//						proddao1.admin_showproduct();
					
				case 4:
					ProductDao1 proddao1=new ProductDao1();
					proddao1.admin_showproduct();
				}

				}
				else {
					System.out.println("Invalid username or password ");
				}

			} while (admin11 == null);

		}

	}
}
