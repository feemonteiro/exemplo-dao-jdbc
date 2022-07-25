package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import models.entities.Department;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		/*
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: seller findAll ===");

		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: seller insert ===");

		Seller newSeller = new Seller(null, "Greg", "gre@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: seller update ===");

		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 6: seller insert ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();		
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		*/
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
		
		
		System.out.println("\n=== TEST 2: seller findAll ===");

		List<Department> list = departmentDao.findAll();
		
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		
		System.out.println("\n=== TEST 3: seller insert ===");

		Department newDep = new Department(null, "Food");
		departmentDao.insert(newDep);
		System.out.println("Inserted! New id = " + newDep.getId());
		
		
		System.out.println("\n=== TEST 5: seller update ===");

		dep = departmentDao.findById(1);
		dep.setName("Informatics");
		departmentDao.update(dep);
		
		System.out.println("Update completed");
		
		
		System.out.println("\n=== TEST 6: department delete ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();		
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		
		sc.close();
		
	}

}
