package PatikaProjeleri;
import java.util.Scanner;
public class RecurisiveDesenOluşturma {
	   static void desenOlusturma(int sayi)
	    {
	        if(sayi<=0) 
	        {
	           System.out.print(" "+sayi);
	           return;
	        }
	        System.out.print(" "+sayi);
	        desenOlusturma(sayi-5);
	        System.out.print(" "+sayi);

	    }
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	        int a;
	        while (true) {
	            System.out.print("N sayısı : ");
	            a=sc.nextInt();
	            System.out.print("Çıktısı : ");
	            desenOlusturma(a);
	            System.out.println("\n");
	        }
	    }
}