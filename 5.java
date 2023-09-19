import java.util.Scanner;

public class Calculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite o símbolo da operação (+, -, *, / ou ^): ");
        char operacao = scanner.next().charAt(0);

        double resul = 0.0;

        switch (operacao) {
            case '+':
                resul = n1 + n2;
                break;
            case '-':
                resul = n1 - n2;
                break;
            case '*':
                resul = n1 * n2;
                break;
            case '/':
                if (n2 != 0) {
                    resul = n1 / n2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return;
                }
                break;
            case '^':
                resul = Math.pow(n1, n2);
                break;
            default:
                System.out.println("Erro: Símbolo da operação inválido.");
                return;
        }

        System.out.println("Resultado da operação: " + resul);

        scanner.close();
    }
}
