package PatikaProjeleri;
import java.util.Scanner;
public class BasamakSayılarıToplamı {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sayi,gecici,toplam=0;;
		System.out.println("Lütfen bir sayı giriniz:");
		sayi=sc.nextInt();
		gecici = sayi;
        
        while(gecici!=0)
        {
            toplam+= gecici%10;
            gecici/= 10;
        }
        System.out.print(toplam);
		
		
		
		
	}
}