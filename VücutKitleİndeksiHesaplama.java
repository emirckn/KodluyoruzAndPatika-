package VücutKitleİndeksiHesaplama;
import java.util.Scanner;
public class VücutKitleİndeksiHesaplama {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	double  kg,m,index;
	
	System.out.println("Kilonuzu giriniz:");
	kg=input.nextDouble();
	System.out.println("Boyunuzu giriniz(metre cinsinden ör:1.75):");
	m=input.nextDouble();
	index=(kg/(m*m));
	System.out.println("Vücut kitle indeksiniz:"+index);
	}
}