package PatikaProjeleri;
import java.util.Scanner;
import java.util.Arrays;
public class DizideMaxMinBulanProgram {

	public static void main(String[] args) {
		 int value, min, max = 0;
	     int[] arr = {15,12,788,1,-1,-778,2,0};

	     Arrays.sort(arr);
	     System.out.println("Sıralanmış Dizi: "+Arrays.toString(arr));
	     Scanner sc=new Scanner(System.in);

	     System.out.println("Bir sayı giriniz:");
	     value = sc.nextInt();

	        for (int i=0; i< arr.length; i++) 
	        {
	            if (value <= arr[i]) 
	            {
	            	System.out.println("Girilen sayıdan küçük en yakın sayı: " + arr[i-1]);
	            	System.out.println("Girilen sayıdan büyük en yakın sayı: " + arr[i]); 
	                break;
	            }
	        }
} 
}