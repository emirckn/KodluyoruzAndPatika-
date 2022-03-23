package PatikaProjeleri;
import java.util.Scanner;
public class GirilenSayıyaKadarSayılarınOrtalaması {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sayi1,toplam=0,sayac=0;
		System.out.println("Sayı giriniz:");
		sayi1=sc.nextInt();
		for(int i=1;i<sayi1;i++)
		{
			if(i%3==0 || i%4==0)
			{
				System.out.println(i);
				toplam+=i;
				sayac++;
			}
		}
		System.out.println("Sayıların toplamı:"+toplam);
		System.out.println("Sayıların adedi:"+sayac);
		System.out.println("Sayıların ortalaması:"+toplam/sayac);
	}
}
