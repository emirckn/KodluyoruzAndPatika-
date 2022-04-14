package PatikaProjeleri;
import java.util.Scanner;
public class SayiTahminOyunu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rastgeleSayi=(int)(Math.random()*100);
		int tahminSayi;
		int denemeSayisi=0;
	
		while(denemeSayisi<5) {
			denemeSayisi++;
			System.out.println("Lütfen 0-100 arası tahmininizi giriniz :");
			tahminSayi=sc.nextInt();
			if(tahminSayi<0 || tahminSayi>100) {
				System.out.println("Lütfen 0-100 aralığında tahmin yapınız");
			}
			if(tahminSayi==rastgeleSayi) {
				System.out.println(tahminSayi+ " Doğru Tahmin! ");
			}
			else {
				System.out.println(tahminSayi+ " Yanlış tahmin! ");
			}
		}	
	}
}