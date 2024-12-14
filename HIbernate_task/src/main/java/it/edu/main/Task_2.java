package it.edu.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import inventory.entity.Product;
import inventory.entity.utilities.ProgrammaticConfiguration;

public class Task_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
			SessionFactory factory = ProgrammaticConfiguration.getSession();
			Session sessionObj = factory.openSession();
		){
			
			//Insertion
			
//			Product p = new Product("p2","Shoe","Nike",1200);
//			Transaction tx = sessionObj.beginTransaction();
//			sessionObj.persist(p);
//			tx.commit(); 
//			System.out.println("Product added successfully");
			
			//Updation
			
//			Product retrivedata = sessionObj.find(Product.class, "p2");
//			if(retrivedata!=null) {
//				Transaction tx = sessionObj.beginTransaction();
//				retrivedata.setName("New Name");
//				tx.commit();
//				System.out.println("Product updated");
//			}else {
//				System.out.println("Id not found");
//			}
			
			//Deletion
			Product retrivedata = sessionObj.find(Product.class, "p2");
			if(retrivedata!=null) {
				Transaction tx = sessionObj.beginTransaction();
				sessionObj.remove(retrivedata);
				tx.commit();
				System.out.println("Product Deleted");
			}else {
				System.out.println("Id not found");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
