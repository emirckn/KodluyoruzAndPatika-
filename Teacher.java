package StudentMarkSystem;

public class Teacher {
	
	String name;
	String telNo;
	String branch;
	
	Teacher(String name,String telNo,String branch){
		this.name=name;
		this.telNo=telNo;
		this.branch=branch;
	}
	
	void print(){
		System.out.println("Ad : " +this.name);
		System.out.println("Telefon Numarası :" +this.telNo);
		System.out.println("Bölümü : " +this.branch);
	}
	
}