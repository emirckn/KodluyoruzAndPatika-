package StudentMarkSystem;

public class Student {
	
	Course tarih;
	Course felsefe;
	Course kimya;
	Course tarihVerbal;
	Course felsefeVerbal;
	Course kimyaVerbal;
	String name;
	String studentNo;
	String classes;
	int avarage=0;
	boolean isPassCheck;
	
	Student(String name,String studentNo,String classes,Course tarih,Course tarihVerbal,Course felsefe,Course felsefeVerbal,Course kimya,Course kimyaVerbal){
		this.name=name;
		this.studentNo=studentNo;
		this.classes=classes;
		this.tarih=tarih;
		this.felsefe=felsefe;
		this.kimya=kimya;
		this.tarihVerbal=tarihVerbal;
		this.felsefeVerbal=felsefeVerbal;
		this.kimyaVerbal=kimyaVerbal;
		
	}
	
	void addBulkNotes(int tarih,int felsefe,int kimya,int tarihVerbal,int felsefeVerbal,int kimyaVerbal) {
		if(tarih>=0 && tarih<=100)
			this.tarih.examNote=tarih;
		if(felsefe>=0 && felsefe<=100)
			this.felsefe.examNote=felsefe;
		if(kimya>=0 && kimya<=100)
			this.kimya.examNote=kimya;
		if(tarihVerbal>=0 && tarihVerbal<=100)
			this.tarihVerbal.verbalNote=tarihVerbal;
		if(felsefeVerbal>=0 && felsefeVerbal<=100)
			this.felsefeVerbal.verbalNote=felsefeVerbal;
		if(kimyaVerbal>=0 && kimyaVerbal<=100)
			this.kimyaVerbal.verbalNote=felsefeVerbal;
	}
	
	void calcAvarage(){
		this.avarage= ((this.tarih * 0.80) + (this.tarihVerbal * 0.20)) + ((this.felsefe * 0.80) + (this.felsefeVerbal * 0.20)) + ((this.kimya * 0.80) + (this.kimyaVerbal * 0.20)) / 3;
	}
	
	boolean isPassCheck(){
		calcAvarage();
		return this.avarage>=50;
	}
	
    public void isPass() {
        if (this.tarih.examNote == 0 || this.felsefe.examNote == 0 || this.kimya.examNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPassCheck = isPassCheck();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPassCheck) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Tarih Sınav Notu : " + this.tarih.examNote);
        System.out.println("Tarih Sözlü Notu : " + this.tarih.verbalNote);
        System.out.println("Felsefe Sınav Notu : " + this.felsefe.examNote);
        System.out.println("Felsefe Sözlü Notu : " + this.felsefe.verbalNote);
        System.out.println("Kimya Sınav Notu : " + this.kimya.examNote);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.verbalNote);
    }
}