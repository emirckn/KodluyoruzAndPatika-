package KullanıcıGiriş;
import java.util.Scanner;
public class KullanıcıGiriş {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String userName,password;
		System.out.print("Kullanıcı adınızı giriniz:");
		userName=sc.nextLine();
		System.out.print("Şifrenizi giriniz:");
		password=sc.nextLine();
		if(userName.equals("emirckn") && password.equals("emir123"))
		{
			System.out.println("Başarılı giriş!");
		}
		else 
		{
		System.out.println("Hatalı giriş!");
		}
	}

}
