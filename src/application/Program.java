package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");

		Seller seller = new Seller(20, "Flávia", "flimamenezes@gmail.com", new Date(), 4500.0, obj);

		System.out.println(seller);
	}
}
