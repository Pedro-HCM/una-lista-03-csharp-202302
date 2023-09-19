import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double vCompra = scanner.nextDouble();

        System.out.print("Digite o valor pago: ");
        double vPago = scanner.nextDouble();
        double trc = vPago - vCompra;

        if (vPago < vCompra) {
            System.out.println("Quantia paga é insuficiente para realizar a compra.");
        } else {
            
            double troco = vPago - vCompra;

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

            int moeda1 = (int) (troco);

        System.out.println("Troco: R$" + trc);
            System.out.println("Notas de R$ 50,00: " + nota50);
            System.out.println("Notas de R$ 20,00: " + nota20);
            System.out.println("Notas de R$ 10,00: " + nota10);
            System.out.println("Notas de R$ 5,00: " + nota5);
            System.out.println("Notas de R$ 2,00: " + nota2);
            System.out.println("Moedas de R$ 1,00: " + moeda1);
        }

        scanner.close();
    }
