package PatikaProjeleri;
import java.util.Scanner;
public class MaxMinBulma {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sayi,sayiAdedi,max1=0,min1=0,max2=0,min2=0;
		System.out.println("Kaç adet sayı gireceksiniz:");
		sayiAdedi=sc.nextInt();
		for(int i=1;i<=sayiAdedi;i++)
		{
			System.out.println("Lütfen "+i+". sayıyı giriniz:");
			sayi=sc.nextInt();
			if(sayi>min1)
			{	
				min1=sayi;
				max1=sayi;
			}
		
		}
		System.out.println(max1);
	}
}