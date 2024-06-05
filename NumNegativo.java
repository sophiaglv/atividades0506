package dia0506;
import java.util.ArrayList;
import java.util.Random;

public class NumNegativo {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		Random random = new Random ();
		int soma = 0;
		
		for (int i = 0; i < 5; i++) {
			int numCinco = random.nextInt();
			num.add(numCinco);
		}
		
		System.out.println("Os números escolhidos foi: " + num);
		
		for (int i : num) {
			if (i < 0) {
				soma += i;
			}
		}
		System.out.println("O resultado da soma dos números negativos é: " + soma);
	}

}
