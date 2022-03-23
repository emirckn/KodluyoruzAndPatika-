package PatikaProjeleri;
import java.util.Scanner;
public class KombinasyonHesaplayanProgram {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,r,nrçıkarım,nfak=1,rfak=1,nrçıkarımfak=1,formül;
		System.out.println("n sayısını giriniz:");
		n=sc.nextInt();
		System.out.println("r sayısını giriniz:");
		r=sc.nextInt();
		nrçıkarım=n-r;
		
		for(int i=1;i<=n;i++)
		{
			nfak*=i;
		}
		
		for(int i=1;i<=r;i++)
		{
			rfak*=i;
		}
		
		for(int i=1;i<=nrçıkarım;i++)
		{
			nrçıkarımfak*=i;
		}
		
		formül=nfak/(rfak * (nrçıkarımfak));
		System.out.println(n+" in"+r+" li kombinasyonu:"+formül);
	}
}
