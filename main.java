
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        
        // entrada dos números
        System.out.println("Cálculadora de função");
        System.out.print("Digite o valor total: ");
        Scanner lerEntrada = new Scanner(System.in); // ler teclado
        double valorTotal;
        valorTotal = lerEntrada.nextDouble();
        System.out.print("Digite o valor fixo: ");
        double valorFixo;
        valorFixo = lerEntrada.nextDouble();
        System.out.print("Digite a variável (incógnita): ");
        double valorIncognita;
        valorIncognita = lerEntrada.nextDouble();

        // usando o cálculo f(x)=total+fixo.x
        double funcao = valorTotal + valorFixo * valorIncognita;

        // mostrando o resultado da função
        System.out.println("O resultado da função é: " + funcao);

        // fecha o scanner do teclado
        lerEntrada.close();
    }
}
