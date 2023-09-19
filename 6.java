import java.util.Scanner;
import java.util.Random;

public class Sorteio{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = scanner.nextInt();

       
        int menor = Math.min(n1, n2);
        int maior = Math.max(n1, n2);

       
        int nSorteado =   random.nextInt(maior - menor + 1) + menor;

        System.out.println("Número sorteado: " + nSorteado);

        if (nSorteado % 2 == 0) {
            System.out.println("É um número par.");
        } else {
            System.out.println("É um número ímpar.");
        }

        scanner.close();
    }
}
