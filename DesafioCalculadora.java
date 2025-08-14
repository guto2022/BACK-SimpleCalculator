import java.util.Scanner;

public class DesafioCalculadora {

    public static void main (String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite qual operação matemática você deseja fazer (+, -, * ou /): ");
            String op = scanner.next();
            
            System.out.println("Digite o primeiro número: ");
            double n1 = scanner.nextDouble();
            
            System.out.println("Digite segundo número: ");
            double n2 = scanner.nextDouble();
            
            if (op.equals("+")) {
                System.out.println(adicao(n1, n2));
            } else if (op.equals("-")) {
                System.out.println(subtracao(n1, n2));
            } else if (op.equals("*")) {
                System.out.println(multiplicacao(n1, n2));
            } else if (op.equals("/")) {
                System.out.println(divisao(n1, n2));
            } else {
                System.out.println("Algo deu errado!");
            }
        }
    }

    public static double adicao (double n1, double n2) {
        return n1 + n2;
    }

    public static double subtracao (double n1, double n2) {
        return n1 - n2;
    }

    public static double multiplicacao (double n1, double n2) {
        return n1 * n2;
    }

    public static double divisao (double n1, double n2) {
        return n1 / n2;
    }
}