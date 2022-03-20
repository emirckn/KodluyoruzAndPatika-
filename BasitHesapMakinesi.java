package BasitHesapMakinesi;
import java.util.Scanner;
public class BasitHesapMakinesi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num1,num2;
		int select;
		System.out.println("İlk sayıyı giriniz:");
		num1=sc.nextDouble();
		System.out.println("İkinci sayıyı giriniz:");
		num2=sc.nextDouble();
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Mod Alma\nYapacağınız işlemi seçiniz:");
		select=sc.nextInt();
			if(select==1 || select==2 || select==3 || select==4 || select==5)
			{
				switch(select)
				{
				case 1:
					System.out.println("Toplama sonucu:"+(num1+num2));
					break;
				case 2:
					System.out.println("Çıkarma sonucu:"+(num1-num2));
					break;
				case 3:
					System.out.println("Çarpma sonucu:"+(num1*num2));
					break;
				case 4:
					System.out.println("Bölme sonucu:"+(num1/num2));
					break;
				case 5:
					System.out.println("Mod alma sonucu:"+(num1%num2));
					break;
				}
				
			}
			else 
			{
				System.out.println("Geçerli bir seçenek seçiniz!");
			}
	}
}