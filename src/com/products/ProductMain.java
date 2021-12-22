package com.products;

import java.sql.SQLException;
import java.util.Scanner;

import com.daoclass.ProductDao1;

public class ProductMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Enter your choice press \n1.Inset \n2.Update \n3.Delete");
//		int num=input.nextInt();
		int num=Integer.parseInt(input.nextLine());
		
		ProductDao1 ob=new ProductDao1();
		switch(num) 
		{
		case 1:
			System.out.println("Enter insert details:");
			System.out.println("Enter product id");
			int s1=Integer.parseInt(input.next());
		System.out.println("Enter product name");
		String s3=input.next();
		System.out.println("Enter product Description");
		String s4=input.next();
		System.out.println("Enter product Standard cost");
		double  s5=Double.parseDouble(input.next());
		System.out.println("Enter product category");  
		String s6=input.next();
		System.out.println("Enter stock quantity");
		int s7=Integer.parseInt(input.next());
//		Product pr= new Product(Integer.parseInt(s1.split(",")[0]),s1.split(",")[1],s1.split(",")[2],
//				Double.parseDouble(s1.split(",")[3]),s1.split(",")[4]);
//		ob.insert(pr);
		Product pr=new Product(s1,s3, s4, s5, s6, s7);
//		ob.insert(pr);
	//	ob.insert(pr);
		break;
		case 2:
		System.out.println("Enter your update details-first product name,next Product id ");
		String s2=input.next();
		Product pr1=new Product(s2.split(",")[0], Integer.parseUnsignedInt(s2.split(",")[1]));
//		ob.update(pr1);
		break;
//		case 3:
//			System.out.println("Enter product_id to delete ");
//			int s=input.nextInt();
//			Product Pr=new Product(s);
//			DeleteDao.delete(Pr);
//	
//			break;
		}
		
	}  
	}


