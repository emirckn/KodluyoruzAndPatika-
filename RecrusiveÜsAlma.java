package PatikaProjeleri;
import java.util.Scanner;
public class RecrusiveÜsAlma {

	static int usAlma(int taban,int us) 
	{
		if(us==0) 
		{
			return 1;
		} 
		else 
		{
			return taban*usAlma(taban,us-1);
		}
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Taban sayısını girin: ");
		int taban = sc.nextInt();

		System.out.print("Us sayısını girin:");
		int us = sc.nextInt();

		System.out.println("Sonuc: " + usAlma(taban,us));
	}
}