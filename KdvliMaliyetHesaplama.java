
package KdvliMaliyetHeaplama;
import java.util.Scanner;
public class KdvliMaliyetHesaplama {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		double maliyet,kdvmaliyeti,kdvlimaliyet;
		
		System.out.print("Lutfen urunun maliyetini giriniz:");
		maliyet=input.nextDouble();
		
		kdvmaliyeti=maliyet*0.18;
		System.out.println("Kdv:" +kdvmaliyeti);
		
		kdvlimaliyet=maliyet+kdvmaliyeti;
		System.out.println("Son Maliyet:"+kdvlimaliyet);
		
	}

}
