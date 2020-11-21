package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao selerDao = DaoFactory.createSellerDao();
		
		System.out.println("==== TEST 01: seller find ById ====");
		Seller seller = selerDao.findbyId(3);
		System.out.println(seller);
		
		System.out.println("\n==== TEST 02: seller findByDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = selerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}
}
