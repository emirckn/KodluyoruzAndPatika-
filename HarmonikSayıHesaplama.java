package PatikaProjeleri;
import java.util.Scanner;
public class HarmonikSayıHesaplama {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("N sayısını giriniz:");
		int N=sc.nextInt();
		double toplam=0.0;
		for(double i=1;i<=N;i++)
		{
			toplam+=(1/i);
		}
		System.out.println("Sonuç: "+toplam);
	}
}