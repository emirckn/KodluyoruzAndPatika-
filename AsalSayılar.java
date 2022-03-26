package PatikaProjeleri;
import java.util.Scanner;
public class AsalSayılar {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sayi,sayac=0;
        System.out.print("Bir sayi giriniz: ");
        sayi=sc.nextInt();
        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(sayi + " Asal bir sayidir.");
        }
        else {
            System.out.println(sayi + " Asal bir sayi degildir.");
        }
    }
}