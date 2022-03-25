package PatikaProjeleri;
import java.util.Scanner;
public class ÜslüSayıHesaplama {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int taban,us,sonuc=1;
		System.out.println("Lütfen taban sayıyı giriniz:");
		taban=sc.nextInt();
		System.out.println("Lütfen üs sayıyı giriniz:");
		us=sc.nextInt();
		for(int i=1;i<=us;i++)
		{
			sonuc*=taban;
		}
		System.out.println("Sonuç: "+sonuc);
	}
}