package dia0506;
import java.util.ArrayList;
import java.util.Random;

public class ListaFrutas {

	public static void main(String[] args) {
		ArrayList<String> frutas = new ArrayList<>();
		Random random = new Random ();
	
		frutas.add("Uva");
		frutas.add("Banana");
		frutas.add("Lichia");
		frutas.add("Melancia");
		frutas.add("Morango");
		frutas.add("Melão");
		frutas.add("Maçã");
		frutas.add("Laranja");
		frutas.add("Pitaya");
		frutas.add("Kiwi");
		
		System.out.println("A lista é: " + frutas);
		
		for (int i = 0; i < 5; i++) {
			int num = random.nextInt(10);
			frutas.remove(num);
		}
		System.out.println("A lista atual é: " + frutas);
		System.out.println(frutas.size());
	}

}
