package PatikaProjeleri;
import java.util.Scanner;
public class GirilenSayıyaKadarKuvvetBulma {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sayi;
		System.out.println("Sınır sayıyı giriniz:");
		sayi=sc.nextInt();
		System.out.println("4'ün katları:");
		for(int i=1;i<sayi;i*=4)
		{
			System.out.println(i);
		}
		System.out.println("5'in katları:");
		for(int i=1;i<sayi;i*=5)
		{
			System.out.println(i);
		}
	}
}
