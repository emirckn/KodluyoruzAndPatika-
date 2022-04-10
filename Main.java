package Employee;

public class Main {

	public static void main(String[] args) {
		Worker w1=new Worker("Kemal",2000.0,45,1985);
		w1.tax();
		w1.bonus();
		w1.raiseYear();
		w1.toInfo();
	}
}