package ManavKasaProgramı;
import java.util.Scanner;
public class ManavKasaProgramı {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	double pear=2.14,apple=3.67,tomato=1.11,banana=0.95,aubergine=5.00,amount;
	double pearK,appleK,tomatoK,bananaK,aubergineK;
	
	System.out.println("How many kilos of pears did you buy,please enter:");
	pearK=input.nextDouble();
	
	System.out.println("How many kilos of apples did you buy,please enter:");
	appleK=input.nextDouble();
	
	System.out.println("How many kilos of tomatoes did you buy,please enter:");
	tomatoK=input.nextDouble();
	
	System.out.println("How many kilos of bananas did you buy,please enter:");
	bananaK=input.nextDouble();
	
	System.out.println("How many kilos of eggplant did you buy,please enter:");
	aubergineK=input.nextDouble();
	
	amount=((pearK*pear)+(appleK*apple)+(tomatoK*tomato)+(bananaK*banana)+(aubergineK*aubergine));
	System.out.println("Amount:"+amount);
	}
}