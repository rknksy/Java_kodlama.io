package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;

		for (int i : sayilar) {
			if (i == aranacak) {
				System.out.println("Sayi var");
				return;
			}
		}
		System.out.println("Sayi yok");

		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Sayi mevcuttur.");
		} else {
			System.out.println("Sayi mevcut degildir.");
		}
		
		

	}

}
