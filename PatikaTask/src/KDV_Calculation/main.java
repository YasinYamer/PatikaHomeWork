package KDV_Calculation;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int a;
		double kdvTuatrı, kdvliFiyat;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen KDV hesaplanacak değeri girniz: ");
		a = input.nextInt();
		
		System.out.println("KDV'siz Değer: " + a);
		
		if (a < 0 ) {
			System.out.println("Lütfen Geçerli Bir Değer Giriniz: " + a +" ve sıfırdan büyük değer giriniz" );
		}
		else if (0 < a && a <= 1000) {
			kdvTuatrı = a * 0.18;
			System.out.println("KDV Tutarı: "+kdvTuatrı);
			
			kdvliFiyat = a + kdvTuatrı;
			System.out.println("KDV'li Fiyat: " + kdvliFiyat);
		}
		else {
			kdvTuatrı = a * 0.08;
			System.out.println("KDV Tutarı: "+kdvTuatrı);
			
			kdvliFiyat = a + kdvTuatrı;
			System.out.println("KDV'li Fiyat: " + kdvliFiyat);
		}
		
	}
	

}
