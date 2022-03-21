package ÇinZodyağıHesaplama;
import java.util.Scanner;
public class ÇinZodyağıHesaplama {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int bDay,cYear;
		
		System.out.println("Doğum yılınızı giriniz:");
		bDay=sc.nextInt();
		cYear=bDay%12;
		
		if(cYear==0)
			System.out.print("Çin Zodyağı Burcunuz: Maymun");
		else if(cYear==1)
			System.out.print("Çin Zodyağı Burcunuz: Horoz");
		else if(cYear==2)
			System.out.print("Çin Zodyağı Burcunuz: Köpek");
		else if(cYear==3)
			System.out.print("Çin Zodyağı Burcunuz: Domuz");
		else if(cYear==4)
			System.out.print("Çin Zodyağı Burcunuz: Fare");
		else if(cYear==5)
			System.out.print("Çin Zodyağı Burcunuz: Öküz");
		else if(cYear==6)
			System.out.print("Çin Zodyağı Burcunuz: Kaplan");
		else if(cYear==7)
			System.out.print("Çin Zodyağı Burcunuz: Tavşan");
		else if(cYear==8)
			System.out.print("Çin Zodyağı Burcunuz: Ejderha");
		else if(cYear==9)
			System.out.print("Çin Zodyağı Burcunuz: Yılan");
		else if(cYear==10)
			System.out.print("Çin Zodyağı Burcunuz: At");
		else if(cYear==11)
			System.out.print("Çin Zodyağı Burcunuz: Koyun");
		
	}
}
