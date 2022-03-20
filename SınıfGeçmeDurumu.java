package SınıfGeçmeDurumu;
import java.util.Scanner;
public class SınıfGeçmeDurumu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double mat,fizik,turkce,kimya,muzik,ortalama=0;
		int sayac=0;
		System.out.print("Lütfen matematik notunuzu giriniz:");
		mat=sc.nextDouble();
			if(mat>=0 || mat<=100)
				{
				ortalama += mat;
				sayac++;
				}
		
		System.out.print("Lütfen fizik notunuzu giriniz:");
		fizik=sc.nextDouble();
			if(fizik>=0 || fizik<=100)
				{
				ortalama += fizik;
				sayac++;
				}
		
		System.out.print("Lütfen turkce notunuzu giriniz:");
		turkce=sc.nextDouble();
			if(turkce>=0 || turkce<=100)
				{
				ortalama += turkce;
				sayac++;
				}

		System.out.print("Lütfen kimya notunuzu giriniz:");
		kimya=sc.nextDouble();
			if(kimya>=0 || kimya<=100)
				{
				ortalama += kimya;
				sayac++;
				}
		
		System.out.print("Lütfen müzik notunuzu giriniz:");
		muzik=sc.nextDouble();
			if(muzik>=0 || muzik<=100)
				{
				ortalama += muzik;
				sayac++;
				}
		
		ortalama/=sayac;
			
		if(ortalama>=55)
		{
			System.out.println("Sınıfı geçtiniz!");
		}
		else
		{
			System.out.println("Sınıfı geçemediniz!");
		}
		System.out.println("Ortalamanız:"+ortalama);
	}
}
