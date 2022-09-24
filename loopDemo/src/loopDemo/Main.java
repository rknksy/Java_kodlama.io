package loopDemo;

public class Main {
	public static void main(String[] args) {
//		FOR
		int a = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println(a = a - 1);
		}
		System.out.println("Döngü Bitti");
		
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(a += 2);
		}
		System.out.println("Döngü Bitti");
		
//		While
		
		int i = 2;
		while (i < 10) {
			System.out.println(i);
			i += 2;

		}
		System.out.println("While Dongusu Bitti");
		
//		Do-While
		int j=1;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("Do-While Dongusu Bitti");
		
		int j2=100;
		do {
			System.out.println(j2);
			j2 += 2;
		} while (j2 < 10);
		System.out.println("Do-While Dongusu Bitti");

		
	}
}