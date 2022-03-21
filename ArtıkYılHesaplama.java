package ArtıkYılHesaplama;
import java.util.Scanner;
public class ArtıkYılHesaplama {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int yil;
		
		System.out.println("Lütfen yil giriniz:");
		yil=sc.nextInt();
		
		if(yil%100!=0 && yil%4==0)
			System.out.println(yil+" artik yildir");
		
		else if(yil%100==0 && yil%400==0)
			System.out.println(yil+ " artik yildir");
		
		else 
			System.out.println(yil+" artik yil degildir");
		
	}
}