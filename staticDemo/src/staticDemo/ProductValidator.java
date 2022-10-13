package staticDemo;

public class ProductValidator {
	
	static {System.out.println("Static yapici blok calisti.");}
	
	public ProductValidator() {
		System.out.println("Yapici blok calisti.");
	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void birsey() {System.out.println("Birsey calisti");}
	
//	inner class
	public static class BaskaBirClass{
		public static void sil() {
			System.out.println("Sil calisti.");
		}
	}

}
