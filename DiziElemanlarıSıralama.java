package PatikaProjeleri;
import java.util.Scanner;
import java.util.Arrays;
public class DiziElemanlarıSıralama {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Lütfen dizinin eleman sayısını giriniz: ");
		int[] numbers=new int[sc.nextInt()];
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print("Dizinin "+i+". elemanını giriniz: ");
			numbers[i]=sc.nextInt();
		}
		System.out.println("Girmiş olduğunuz dizi : "+Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.print("Dizinin sıralanmış hali: "+Arrays.toString(numbers));
	}
}