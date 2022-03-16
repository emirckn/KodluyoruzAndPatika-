package TaksimetreUcretiHesaplama;
import java.util.Scanner;
public class TaksimetreUcretiHesaplama {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	double tutar=10,alinanYol,kmBasinaUcret=2.20;
	System.out.println("Lutfen gidilen kilometreyi giriniz:");
	alinanYol=input.nextDouble();
	tutar+=alinanYol*kmBasinaUcret;
	tutar=(tutar<20) ? 20 : tutar;
	System.out.println("Tutar:"+tutar);
		
		
	
		
		
		
		
		
	}
}
