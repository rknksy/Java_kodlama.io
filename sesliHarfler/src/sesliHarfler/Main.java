package sesliHarfler;

public class Main {

	public static void main(String[] args) {

		char harf = 'E';
		char[] kalinHarfler = { 'A', 'O', 'U', 'I', 'a', 'o', 'u', 'ı' };
		boolean ses = true;

		for (char i : kalinHarfler) {
			if (harf == i) {
				ses = false;
			}
		}
		if (ses == false) {
			System.out.println("Kalin unlu harf");
		} else {
			System.out.println("Ince unlu harf");
		}

		switch (harf) {
		case 'A':
		case 'I':
		case 'U':
		case 'O':
			System.out.println("Kalin sesli harf");
			break;
		default:
			System.out.println("Ince sesli harf");
		}

	}

}
