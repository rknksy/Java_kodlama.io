package oop1;

public class Main {
	public static void main(String[] args) {
		String mesaj = "Vade Oranı";

//		Product product1 = new Product();
//		set value
//		product1.name = "Delonghi Kahve Makinesi";
//		product1.unitPrice = 7500;
//		product1.discount = 7;
//		product1.unitStock = 3;
//		product1.imageUrl = "bilmem_ne.jpg";

//		get
//		System.out.println(product1.name);

//		Product product2 = new Product();
//		product2.name = "Smeg Kahve Makinesi";
//		product2.unitPrice = 6500;
//		product2.discount = 8;
//		product2.unitStock = 2;
//		product2.imageUrl = "bilmem_ne_2.jpg";

//		Product product3 = new Product();
//		product3.name = "Kitchen Aid Kahve Makinesi";
//		product3.unitPrice = 4500;
//		product3.discount = 9;
//		product3.unitStock = 4;
//		product3.imageUrl = "bilmem_ne_3.jpg";
		
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitStock(4);
		product1.setImageUrl("img1.jpg");
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setDiscount(7);
		product2.setUnitStock(4);
		product1.setImageUrl("img2.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setDiscount(7);
		product3.setUnitStock(4);
		product1.setImageUrl("img3.jpg");

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+product.getName()+"</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("52222222");
		individualCustomer.setCusomerNumber("125543");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroğ");
		
		CooporateCustomer cooporateCustomer = new CooporateCustomer(); 
		
		cooporateCustomer.setId(2);
		cooporateCustomer.setPhone("53333333");
		cooporateCustomer.setCusomerNumber("54321"); 
		cooporateCustomer.setCompanyName("Kodlama.io");
		cooporateCustomer.setTaxNumber("111111111");
		
		Customer[] customers = {cooporateCustomer, individualCustomer }; 
		
		

	}

}
