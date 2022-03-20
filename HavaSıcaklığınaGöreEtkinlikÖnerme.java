package HavaSıcaklığınaGöreEtkinlikÖnerme;
import java.util.Scanner;
public class HavaSıcaklığınaGöreEtkinlikÖnerme {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sıcaklık;
		System.out.println("Hava sıcaklığını giriniz:");
		sıcaklık=sc.nextInt();
		if(sıcaklık<5)
		{
			System.out.println("Kayak yapabilirsiniz");
		}
		else if(sıcaklık>=5 && sıcaklık<=15)
		{
			System.out.println("Sinemaya gidebilirsiniz");
		}
		else if(sıcaklık>=15 && sıcaklık<=25)
		{
			System.out.println("Pikniğe gidebilirsiniz");
		}
		else
		{
			System.out.println("ÇOK SICAK! Yüzmeye gidebilirsiniz");
		}
	}
}
