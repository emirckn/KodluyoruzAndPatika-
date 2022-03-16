package NotOrtalamasi;
import java.util.Scanner;
public class Notortalamasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp = new Scanner(System.in);
		
		double mat,fizik,kimya,turkce,tarih,muzik;
		
		System.out.print("Lutfen matemaik notunuzu giriniz:");
		mat=inp.nextDouble();
		
		System.out.print("Lutfen fizik notunuzu giriniz:");
		fizik=inp.nextDouble();
		
		System.out.print("Lutfen kimya notunuzu giriniz:");
		kimya=inp.nextDouble();
		
		System.out.print("Turkce notunuzu giriniz:");
		turkce=inp.nextDouble();
		
		System.out.print("Lutfen tarih notunuzu giriniz:");
		tarih=inp.nextDouble();
		
		System.out.print("Lutfen muzik notunuzu giriniz:");
		muzik=inp.nextDouble();
		
		double ortalama=(mat+fizik+kimya+turkce+tarih+muzik);
		ortalama/= 6;
		
		System.out.println("Ortalamaniz:"+ortalama);
	}

}
