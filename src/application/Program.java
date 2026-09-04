package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
import model.impl.SellerDaoJDBC;

import java.util.Date;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");

		Seller seller = new Seller(20, "Flávia", "flimamenezes@gmail.com", new Date(), 4500.0, obj);

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println(seller);
	}
}
