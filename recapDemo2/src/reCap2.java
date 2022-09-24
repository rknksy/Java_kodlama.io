
public class reCap2 {

//	public static void main(String[] args) {
//
////		double[] myList = new double[4];
//		double[] myList = { 1.2, 6.3, 4.3, 5.6 };
//		double total = 0;
//		double max = myList[0];
//
//		for (double number : myList) {
//			total = total + number;
//			System.out.println(number);
//
//			if (max < number) {
//				max = number;
//			}
//
//		}
//		System.out.println("Toplam = " + total);
//		System.out.println("En buyuk sayi = " + max);
//	}
//	public static void main(String[] args) {
//		
//		String[][] sehirler= new String[3][3];
//		
//		sehirler[0][0] = "istanbul";
//		sehirler[0][1] = "Bursa";
//		sehirler[0][2] = "Bilecik";
//		sehirler[1][0] = "Ankara";
//		sehirler[1][1] = "Konya";
//		sehirler[1][2] = "Kayseri";
//		sehirler[2][0] = "Diyarbakir";
//		sehirler[2][1] = "Sanliurfa";
//		sehirler[2][2] = "Gaziantep";
//		for(int i=0;i<=2; i++) {
//			System.out.println("---------------------");
//			for(int j=0;j<=2;j++) {
//				System.out.println(sehirler[i][j]);
//				
//			}		
//		}
//		
//		System.out.println(sehirler);
//	}
	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel";
		System.out.println(mesaj);

//		System.out.println("Eleman sayisi: " + mesaj.length());
//		System.out.println("5. eleman sayisi: " + mesaj.charAt(4));
//		System.out.println(mesaj.concat(" cok sicak aq"));
//		
//		System.out.println(mesaj.startsWith("A"));
//		System.out.println(mesaj.endsWith("l"));
//		
//		char[] karakterler = new char[5];
//		mesaj.getChars(0, 5, karakterler, 0);
//		System.out.println(karakterler);
//		System.out.println(mesaj.indexOf('a'));
//		System.out.println(mesaj.indexOf("co"));
//		System.out.println(mesaj.lastIndexOf('a'));
		
	
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);	
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		String mesaj2 = "      Bugun hava cok   guzel     ";
				
		System.out.println(mesaj2.trim());
				
		
		
	}
}
	
