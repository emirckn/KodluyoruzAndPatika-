package StudentMarkSystem;

public class Course {
	
	Teacher teacher;
	String name;
	String code;
	String prefix;
	int examNote;
	int verbalNote;
	Course(String name,String code,String prefix){
		this.name=name;
		this.code=code;
		this.prefix=prefix;
		examNote=0;
		verbalNote=0;
	}
	
	void addTeacher(Teacher teacher){
		if(this.prefix.equals(teacher.branch))
			{
			this.teacher=teacher;
			System.out.println("Akademisyen derse atanmıştır");
			}
		else
			{
			System.out.println("Akademisyenin bu dersi veremez!");
			}
	}
	
	void printTeacher(){
		if(teacher!=null)
		{
			System.out.println(this.name + " dersini " + teacher.name +" verecektir");
		}
		else
		{
			System.out.println("Derse akademisyen atanmamıştır!");
		}
	}
}