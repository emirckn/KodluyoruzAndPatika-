package HipotenüsHesaplama;
import java.util.Scanner;
public class HipotenüsHesaplama {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
		
	double a,b,c;
	
	System.out.println("Lutfen ucgenin birinci kenarini giriniz:");
	a=input.nextInt();
	
	System.out.println("Lutfen ucgenin ikinci kenarini giriniz:");
	b=input.nextInt();
	
	c=Math.sqrt((a*a)+(b*b));
	System.out.println("Hipotenus:"+c);
	
	
	}

}
