import java.util.Scanner;

public class Raio{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código da operação 1: perímetro 2: área 3: volume: ");
        int codigoOperacao = scanner.nextInt();

        System.out.print("Digite o raio: ");
        double raio = scanner.nextDouble();

        double resul = 0.0;

        if (codigoOperacao == 1) {
            resul = 2 * Math.PI * raio; 
            System.out.println("Perímetro do círculo: " + resul);
        } else if (codigoOperacao == 2) {
            resul = Math.PI * Math.pow(raio, 2); 
            System.out.println("Área do círculo: " + resul);
        } else if (codigoOperacao == 3) {
            resul = (4.0 / 3) * Math.PI * Math.pow(raio, 3); 
            System.out.println("Volume da esfera: " + resul);
        } else {
            System.out.println("Código da operação inválido.");
        }

        scanner.close();
    }
}
