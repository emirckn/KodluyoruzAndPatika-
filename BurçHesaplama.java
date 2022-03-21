package BurçHesaplama;
import java.util.Scanner;
public class BurçHesaplama {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int month,day;
		
		System.out.println("1-Ocak\n2-Şubat\n3-Mart\n4-Nisan\n5-Mayıs\n6-Haziran\n7-Temmuz\n8-Ağustos\n9-Eylül\n10-Ekim\n11-Kasım\n12-Aralık\nDoğduğunuz ayı seçiniz:");
		month=sc.nextInt();
		
		if(month>=1 && month<=12)
		{
			if(month==1)
			{
				System.out.println("Doğduğunuz günü giriniz:");
				day=sc.nextInt();
				if((day>=1) && (day<=31))
				{
					if((day>=1) && day<=21)
					{
						System.out.println("Oğlak burcusunuz");
					}
					else
					{
						System.out.println("Kova burcusunuz");
					}
				}
				else
				{
					System.out.println("Hatalı gün girdiniz!");
				}
			}
			else if(month==2)
			{
				System.out.println("Doğduğunuz günü giriniz:");
				day=sc.nextInt();
				if((day>=1) && (day<=28))
				{
					if((day>=1) && day<=19)
					{
						System.out.println("Kova burcusunuz");
					}
					else
					{
						System.out.println("Balık burcusunuz");
					}
				}
				else
				{
					System.out.println("Hatalı gün girdiniz!");
				}
			}
			else if(month==3)
			{
				System.out.println("Doğduğunuz günü giriniz:");
				day=sc.nextInt();
				if((day>=1) && (day<=31))
				{
					if((day>=1) && day<=20)
					{
						System.out.println("Balık burcusunuz");
					}
					else
					{
						System.out.println("Koç burcusunuz");
					}
				}
				else
				{
					System.out.println("Hatalı gün girdiniz!");
				}
			}
			else if(month==4)
			{
				System.out.println("Doğduğunuz günü giriniz:");
				day=sc.nextInt();
				if((day>=1) && (day<=30))
				{
					if((day>=1) && day<=20)
					{
						System.out.println("Koç burcusunuz");
					}
					else
					{
						System.out.println("Boğa burcusunuz");
					}
				}
				else
				{
					System.out.println("Hatalı gün girdiniz!");
				}	
			}
			else if(month==5)
			{
				System.out.println("Doğduğunuz günü giriniz:");
				day=sc.nextInt();
				if((day>=1) && (day<=31))
				{
					if((day>=1) && day<=21)
					{
						System.out.println("Boğa burcusunuz");
					}
					else
					{
						System.out.println("İkizler burcusunuz");
					}
				}
				else
				{
					System.out.println("Hatalı gün girdiniz!");
				}
			}
			else if(month==6)
			{
				System.out.println("Doğduğunuz günü giriniz:");
				day=sc.nextInt();
				if((day>=1) && (day<=30))
				{
					if((day>=1) && day<=22)
					{
						System.out.println("İkizler burcusunuz");
					}
					else
					{
						System.out.println("Yengeç burcusunuz");
					}
				}
				else
				{
					System.out.println("Hatalı gün girdiniz!");
				}
			}
			else if(month==7)
			{
				System.out.println("Doğduğunuz günü giriniz:");
				day=sc.nextInt();
				if((day>=1) && (day<=31))
				{
					if((day>=1) && day<=22)
					{
						System.out.println("Yengeç burcusunuz");
					}
					else
					{
						System.out.println("Aslan burcusunuz");
					}
				}
				else
				{
					System.out.println("Hatalı gün girdiniz!");
				}
			}
			else if(month==8)
			{
				System.out.println("Doğduğunuz günü giriniz:");
				day=sc.nextInt();
				if((day>=1) && (day<=31))
				{
					if((day>=1) && day<=22)
					{
						System.out.println("Aslan burcusunuz");
					}
					else
					{
						System.out.println("Başak burcusunuz");
					}
				}
				else
				{
					System.out.println("Hatalı gün girdiniz!");
				}
			}
			else if(month==9)
			{
				System.out.println("Doğduğunuz günü giriniz:");
				day=sc.nextInt();
				if((day>=1) && (day<=30))
				{
					if((day>=1) && day<=22)
					{
						System.out.println("Başak burcusunuz");
					}
					else
					{
						System.out.println("Terazi burcusunuz");
					}
				}
				else
				{
					System.out.println("Hatalı gün girdiniz!");
				}
			}
			else if(month==10)
			{
				System.out.println("Doğduğunuz günü giriniz:");
				day=sc.nextInt();
				if((day>=1) && (day<=31))
				{
					if((day>=1) && day<=22)
					{
						System.out.println("Terazi burcusunuz");
					}
					else
					{
						System.out.println("Akrep burcusunuz");
					}
				}
				else
				{
					System.out.println("Hatalı gün girdiniz!");
				}
			}
			else if(month==11)
			{
				System.out.println("Doğduğunuz günü giriniz:");
				day=sc.nextInt();
				if((day>=1) && (day<=30))
				{
					if((day>=1) && day<=21)
					{
						System.out.println("Akrep burcusunuz");
					}
					else
					{
						System.out.println("Yay burcusunuz");
					}
				}
				else
				{
					System.out.println("Hatalı gün girdiniz!");
				}
			}
			else if(month==12)
			{
				System.out.println("Doğduğunuz günü giriniz:");
				day=sc.nextInt();
				if((day>=1) && (day<=31))
				{
					if((day>=1) && day<=21)
					{
						System.out.println("Yay burcusunuz");
					}
					else
					{
						System.out.println("Oğlak burcusunuz");
					}
				}
				else
				{
					System.out.println("Hatalı gün girdiniz!");
				}
			}
		}
		else
		{
			System.out.println("Hatalı ay girdiniz!");
		}
	}

}
