package switchDemo;

public class Main {
	public static void main(String[] args) {
		char grade = 'A';
		switch (grade) {
		case 'A':
			System.out.println("Notunuz " + grade+ " Mukemmel : Gectiniz");
			break;
		case 'B':
			System.out.println("Notunuz " + grade+" Cok guzel : Gectiniz");
			break;
		case 'C':
			System.out.println("Notunuz " + grade+" Iyi gectiniz");
			break;
		case 'D':
			System.out.println("Notunuz " + grade+" Fena degil : Gectiniz");
			break;
		case 'F':
			System.out.println("Notunuz " + grade+" Malesef kaldınız");
			break;
		default:
			System.out.println("Gecerli not giriniz");
		}

	}
}
