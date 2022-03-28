package PatikaProjeleri;
import java.util.Scanner;
public class RecurisiveAsalSayı {
    
	static void asalSayiKontrol (int sayi,int sayac)
    {
        if (sayi == sayac) 
        {
            System.out.println(sayi+" asaldır");
            return;
        }
        else if (sayi%sayac==0 || sayi<= 1) 
        {
            System.out.println(sayi+" asal değildir");
            return;
        }
        asalSayiKontrol(sayi, sayac+1);
    }
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);

	        while (true) 
	        {
	            System.out.println("Kontrol edilecek sayıyı giriniz: ");
	            asalSayiKontrol(sc.nextInt(),2);
	        }
}
}