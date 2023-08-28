import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número");
        double num2 = scanner.nextDouble();
        System.out.println("Digite a operação(+, -, *, /):") ;
        char operacao = scanner.next().charAt(0);
        scanner.close();
        double result;

        switch (operacao){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida.");
                return;

        }

        System.out.println(num1+ " "+operacao+" "+num2+": "+result);
    }
}