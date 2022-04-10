package PatikaProjeleri;

public class DiziOrtalamasıBulanPorgram {

	public static void main(String[] args) {
		int list[]= {1,2,3,4,5};
		double sum=0.0;
		
		for(int i=0;i<list.length;i++)
		{
			sum+=list[i];
		}
		System.out.println("Dizi Ortlaması: " +sum/list.length);	
	}
}