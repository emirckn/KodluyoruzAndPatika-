package DaireDilimAlanı;
import java.util.Scanner;
public class DaireDilimAlanı {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	float pi=3.14f ,yariCap,merkezAci,alan;
	System.out.println("Lütfen dairenin yarıçapını giriniz:");
	yariCap=input.nextFloat();
	System.out.println("Lütfen merkez açının ölçüsünü giriniz:");
	merkezAci=input.nextFloat();
	alan=(pi * (yariCap * yariCap)* merkezAci) / 360;
	System.out.println("Daire diliminin alanı:"+alan);
	}
}