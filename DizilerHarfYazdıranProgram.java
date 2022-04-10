package PatikaProjeleri;

public class DizilerHarfYazdıranProgram {

	public static void main(String[] args) {
		String[][] arr=new String[6][4];
		for(int i=0;i<arr.length;i++)
			for(int j=0;i<arr[i].length;j++)
			{
				if(i==0 || i==2 || i==5)
					arr[i][j]="*";
				else if(j==0 || j==3)
					arr[i][j]="*";
				else
					arr[i][j]=" ";
			}
		for(int i=0;i<arr.length;i++)
			for(int j=0;i<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
		
		

	}

}
