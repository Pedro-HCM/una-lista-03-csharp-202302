import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double vCompra = scanner.nextDouble();

        System.out.print("Digite o valor pago: ");
        double vPago = scanner.nextDouble();

        double troco = vPago - vCompra;

        int nota100 = (int) (troco / 100);
        troco %= 100;

        int nota50 = (int) (troco / 50);
        troco %= 50;

        int nota20 = (int) (troco / 20);
        troco %= 20;

        int nota10 = (int) (troco / 10);
        troco %= 10;

        int nota5 = (int) (troco / 5);
        troco %= 5;

        int nota2 = (int) (troco / 2);
        troco %= 2;

        

        System.out.println("Troco a ser dado: " + vPago);
        System.out.println("Notas de R$ 100: " + nota100);
        System.out.println("Notas de R$ 50: " + nota50);
        System.out.println("Notas de R$ 20: " + nota20);
        System.out.println("Notas de R$ 10: " + nota10);
        System.out.println("Notas de R$ 5: " + nota5);
        System.out.println("Notas de R$ 2: " + nota2);
        

        scanner.close();
    }
}
