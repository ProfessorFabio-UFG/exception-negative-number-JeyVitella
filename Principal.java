import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();
            validarNumero(num1);

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();
            validarNumero(num2);

            Calculadora calc = new Calculadora(num1, num2);

            calc.soma();
            calc.subtracao();
            calc.multiplicacao();
            calc.divisao();

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Informe números inteiros.");
        } catch (NumeroNegativo e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void validarNumero(int numero) {
        if (numero < 0) {
            throw new NumeroNegativo("Número negativo informado: " + numero);
        }
    }
}
