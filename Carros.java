package dia0506;
import java.util.ArrayList;
import java.util.Scanner;

public class Carros {

	public static void main(String[] args) {
		ArrayList<String> carrosf1 = new ArrayList<>();
		Scanner ler = new Scanner (System.in);
		int num;

		carrosf1.add("Red Bull");
		carrosf1.add("Mercedes");
		carrosf1.add("Ferrari");
		carrosf1.add("Alpine");
		carrosf1.add("Haas");
		carrosf1.add("McLaren");
		carrosf1.add("Willians");
		carrosf1.add("Sauber");
		carrosf1.add("Racing Bulls");
		carrosf1.add("Aston Martin");

		System.out.println("Qual carro/time de  fórmula 1 você gostaria de ver de 0 a 9: ");
		num = ler.nextInt();

		System.out.println(carrosf1.get(num));

		ler.close();
	}

}
