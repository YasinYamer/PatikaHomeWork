package ÜçgenAlanı;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int a,b,c;
		double u, alan;
		
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("1. Kenarı Giriniz: ");
		a = girdi.nextInt();
		
		System.out.println("2. Kenarı Giriniz: ");
		b= girdi.nextInt();
		
		System.out.println("3. Kenarı Giriniz: ");
		c=girdi.nextInt();
		
		u =(a+b+c)/2;
		System.out.println("Girdiğiniz üçgenin çevresi : "+ (2*u));
		
		 alan =Math.sqrt(u*(u-a)*(u-b)*(u-c)) ;
		System.out.println("Girdiğiniz üçgenin alanı: " + alan);
		
		
		
		

	}

}
