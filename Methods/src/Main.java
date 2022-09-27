
public class Main {
	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}

		}
		if (varMi) {
//			mesajVer(aranacak);
			mesajVer("Sayi mevcuttur: "+aranacak);
		} else {
			mesajVer("Sayi mevcuttur: "+aranacak);
		}

	}

//	public static void mesajVer(int aranacak) {
	public static void mesajVer(String mesaj) {
//		System.out.println("Sayi mevcuttur: "+aranacak);
		System.out.println(mesaj);
	}
}
