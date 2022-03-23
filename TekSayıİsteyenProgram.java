package PatikaProjeleri;
import java.util.Scanner;
public class TekSayıİsteyenProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sayi;
		boolean kontrol=true;
		System.out.println("Lütfen tek sayı giriniz:");
		do{
			sayi=sc.nextInt();
			if(sayi%2==1 || sayi==1)
			{
				System.out.println("Tek sayı girdiniz! =>"+" "+sayi);
				kontrol=false;
			}
			else if(sayi%2==0 || sayi%4==0)
			{
				System.out.println("Tek değil çift sayı girdiniz!! => "+sayi);
			}
		}while(kontrol);
	}
}