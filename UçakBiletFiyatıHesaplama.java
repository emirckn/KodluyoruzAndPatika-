package UçakBiletFiyatıHesaplama;
import java.util.Scanner;
public class UçakBiletFiyatıHesaplama {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double distance,perKM=0.10,total=0;
		int age,isDualFlight;
		
		System.out.print("Lütfen mesafeyi KM cinsinden giriniz:");
		distance=sc.nextDouble();
		
		System.out.print("Lütfen yaşınızı giriniz:");
		age=sc.nextInt();
		
		System.out.println("Uçuş tipinizi seçiniz:\n1-Tek Uçuş\n2-Gidiş-Dönüş ");
		isDualFlight=sc.nextInt();
		
		total=distance*perKM;
		
		if(distance>0 && age>0 &&(isDualFlight==1 || isDualFlight==2))
		{
			
			System.out.println("Normal Tutar:"+total);
			if(age<12)
			{
				total/=2;
				System.out.println("Yaş İndirimli Tutar:"+total);
			}
			else if(age>=12 && age<=24)
			{
				total=total-(total*0.10);
				System.out.println("Yaş İndirimli Tutar:"+total);
			}
			else if(age>65)
			{
				total=total-(total*0.30);
				System.out.println("Yaş İndirimli Tutar:"+total);
			}
			else if(isDualFlight==2)
			{
				total=total-(total*0.20);
				System.out.println("Gidiş-Dönüş İndirimli Tutar:"+total);
			}	
		}
		else
		{
			System.out.println("Hatalı Veri Girdiniz!");
		}
	}
}
