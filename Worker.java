package Employee;

public class Worker {
	String name;
	double salary;
	int workHours;
	int hireYear;
	double tax;
	double bonus;
	double riseYear;
	double lastSalary;
	int extraWorkHours;
	
	Worker(String name,double salary,int workHours,int hireYear){
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	
	void tax(){
		if(this.salary>1000)
		{
			this.tax=this.salary * 0.03;
			this.lastSalary=this.salary-this.tax;
		}
	}
		
	void bonus()
	{
		if(this.workHours>40)
		{
			extraWorkHours=this.workHours-40;
			this.bonus=this.extraWorkHours * 30;
			this.lastSalary+=this.bonus;
		}
	}
	
	void raiseYear(){
		if(2021-hireYear<10)
		{
			this.riseYear=this.salary * 0.05;
			this.lastSalary+=this.riseYear;
		}
		else if(2021-hireYear>=10 && 2021-hireYear<=19)
		{
			this.riseYear=this.salary * 0.1;
			this.lastSalary+=this.riseYear;
		}
		else if(2021-hireYear>20)
		{
			this.riseYear=this.salary * 0.15;
			this.lastSalary+=this.riseYear;
		}
	}
	
	void toInfo(){
		System.out.println("Adı :" + this.name);
		System.out.println("Maaşı :" +this.salary);
		System.out.println("Çalışma Saati :" +this.workHours);
		System.out.println("Başlangıç Yılı :" +this.hireYear);
		System.out.println("Vergi :" +this.tax);
		System.out.println("Bonus :" +this.bonus);
		System.out.println("Maaş Artışı :" +this.riseYear);
		System.out.println("Net Maaş :" +this.lastSalary);
	}
}