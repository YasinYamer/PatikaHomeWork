package NotOrtalamasıHesaplama;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int mat , eng , hist , phys; 
		Boolean  geçtiMi = false;
		
		Scanner grade = new Scanner(System.in);
		
		System.out.println("Lütfen Matematik Notunuzu Giriniz : ");
		mat = grade.nextInt();
		
		System.out.println("Lütfen İngilizce Notunuzu Giriniz : ");
		eng = grade.nextInt();
		
		System.out.println("Lütfen Tarih Notunuzu Giriniz : ");
		hist = grade.nextInt();
		
		System.out.println("Lütfen Fizik Notunuzu Giriniz : ");
		phys = grade.nextInt();
		
		int toplam = (mat + eng + hist + phys);
		double sonuç= toplam / 4 ;
		
		System.out.println(sonuç > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı" );
		
	}

}
