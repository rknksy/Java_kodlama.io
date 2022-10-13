package staticDemo;

public class ProductManager {
	public void add(Product product) {

//		ProductValidator validator = new ProductValidator(); // 	new'lemeden kullanabilmek için
//		if (validator.isValid(product)) { // static kullandıldı mı bellekten atılmaz. Yardımcı araçlar static yapılır.
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		} else {
			System.out.println("Urun bilgisi gecersizdir.");
		}

		ProductValidator productValidator = new ProductValidator();
		productValidator.birsey();

	}

	

}
