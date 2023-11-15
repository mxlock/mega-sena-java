package vnb_t3;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class MegaSena {
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        int[] numerosEscolhidos = new int[7];

	        for (int i = 0; i < 7; i++) {
	            while (true) {
	                try {
	                    System.out.print("Digite o " + (i + 1) + "º número (de 0 a 100): ");
	                    numerosEscolhidos[i] = scanner.nextInt();

	                    if (numerosEscolhidos[i] < 0 || numerosEscolhidos[i] > 100) {
	                        System.out.println("Número fora do intervalo de 0 a 100. Tente novamente.");
	                        continue;
	                    }

	                    break;
	                } catch (Exception e) {
	                    System.out.println("Entrada inválida. Digite um número inteiro. Tente novamente.");
	                    scanner.next(); 
	                }
	            }
	        }

	        Random random = new Random();
	        int[] numerosSorteados = new int[7];

	        for (int i = 0; i < 7; i++) {
	            numerosSorteados[i] = random.nextInt(101);
	        }

	        System.out.println("Números sorteados: " + Arrays.toString(numerosSorteados));

	        int acertos = 0;
	        for (int escolhido : numerosEscolhidos) {
	            if (Arrays.binarySearch(numerosSorteados, escolhido) >= 0) {
	                acertos++;
	            }
	        }

	        System.out.println("Você acertou " + acertos + " número(s).");

	        switch (acertos) {
	            case 5:
	                System.out.println("Parabéns! Você ganhou 10 mil reais!");
	                break;
	            case 6:
	                System.out.println("Parabéns! Você ganhou 50 mil reais!");
	                break;
	            case 7:
	                System.out.println("Parabéns! Você ganhou 200 mil reais!");
	                break;
	            default:
	                System.out.println("Infelizmente, você não ganhou nenhum prêmio desta vez. Tente novamente!");
	        }

	        scanner.close();
	 }
}
