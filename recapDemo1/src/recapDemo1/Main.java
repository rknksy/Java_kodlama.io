package recapDemo1;

public class Main {
	public static void main(String[] args) {
		int sayi1 = 25;
		int sayi2 = 20;
		int sayi3 = 32;
		int biggest = sayi1;
		
		if (biggest < sayi2) {
			biggest = sayi2;
			
		} 
		
		if((biggest < sayi3)) {
			biggest = sayi3;
		}
		System.out.println(biggest);

	}
}
