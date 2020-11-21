package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao selerDao = DaoFactory.createSellerDao();
		
		Seller seller = selerDao.findbyId(3);
		
		System.out.println(seller);

	}
}
