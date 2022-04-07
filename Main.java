package StudentMarkSystem;

public class Main {

	public static void main(String[] args) {
		
		Teacher t1=new Teacher("Emir Hoca","xxxyyyzzz","TRH");
		Teacher t2=new Teacher("Burak Hoca","xxxyyyzzz","FLS");
		Teacher t3=new Teacher("Ege Hoca","xxxyyyzzz","KIM");
		
		Course c1=new Course("Tarih","100","TRH");
		Course c2=new Course("Felsefe","101","FLS");
		Course c3=new Course("Kimya","102","KIM");
		
		c1.addTeacher(t1);
		c2.addTeacher(t2);
		c3.addTeacher(t3);
		
		Student s1=new Student("Huseyin","111","2",tarih,tarihVerbal,felsefe,felsefeVerbal,kimya,kimyaVerbal);
		s1.addBulkNotes(100, 100, 100, 100, 100, 100);
		s1.isPass();
	}
}