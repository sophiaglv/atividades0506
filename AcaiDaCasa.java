package dia0506;
import java.util.ArrayList;
import java.util.Scanner;

public class AcaiDaCasa {

	public static void main(String[] args) {
		ArrayList<String> acai = new ArrayList<>();
		Scanner ler = new Scanner (System.in);
		int comando;
		
		acai.add("Açaí");
		acai.add("Leite em pó");
		acai.add("Mel");
		acai.add("Banana");
		acai.add("Leite Condensado");
		acai.add("Granola");
		acai.add("Morango");
		
		System.out.println("Ingredientes: ");
		
		for (String ingredientes : acai) {
			System.out.println(ingredientes);
		}
		System.out.println();
		System.out.println("Digite 1 para adicionar, 2 para remover ou 3 caso não queira modificar nada.");
		comando = ler.nextInt();
		
		if (comando == 1) {
			System.out.println("Digite o ingrediente que quer adiocionar: ");
			acai.add(ler.next());
			System.out.println("A lista de ingrediente atual é: ");
			System.out.print(acai);
		}
		else if (comando == 2) {
			System.out.println ("Digite a posição do ingrediente de 0 a 6 que deseja remover: ");
			acai.remove(ler.nextInt());
			System.out.println("A lista de ingrediente atual é: ");
			System.out.print(acai);
		}
		else {
			System.out.println("A lista de ingrediente atual é: ");
			System.out.print(acai);
		}
		ler.close();
	}

}
