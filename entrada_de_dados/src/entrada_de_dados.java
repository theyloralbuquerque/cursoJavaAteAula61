import java.util.Locale;
import java.util.Scanner;

public class entrada_de_dados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
	
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextFloat();
		
		//Teste
		System.out.println("Valores digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		//Commitando um porjeto clonado
		System.out.println("Test");
		sc.close();
	}
	//Teste Branch
}
