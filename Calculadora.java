public class Calculadora {
    private int num1;
    private int num2;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void soma() {
        System.out.println("Soma: " + (num1 + num2));
    }

    public void subtracao() {
        System.out.println("Subtração: " + (num1 - num2));
    }

    public void multiplicacao() {
        System.out.println("Multiplicação: " + (num1 * num2));
    }

    public void divisao() {
        try {
            int resultado = num1 / num2;
            System.out.println("Divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
    }
}
