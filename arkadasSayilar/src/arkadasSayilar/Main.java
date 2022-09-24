package arkadasSayilar;

public class Main {
	public static void main(String[] args) {
		int number1 = 220;
		int number2 = 284;
		int num = 0;
		int num2 = 0;
		
		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				num = num + i;
			}
		}
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				num2 = num2 + i;
			}
		}
		if (num2 == number1) {
			System.out.println(number1+" ve "+number2+" arkadas sayilardir");
		} else {
			System.out.println(number1+" ve "+number2+" arkadas sayi degildir");
		}
		if(number1==num2 && number2==num) {
			System.out.println(number1+" ve "+number2+" arkadas sayilardir");
		}
//		|| ---> or / && ---> and
	}

}
