import java.util.Scanner; // importa o scanner para leitura de teclado

public class main {
    public static void main(String[] args) {
        
        // entrada dos números
        System.out.println("###Cálculadora de função###\nDigite seu nome: ");
        Scanner lerEntrada = new Scanner(System.in); // ler teclado
        String valorNome;
        nome = lerEntrada.nextLine();
        System.out.print("Digite o valor total: ");
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
        System.out.println(valorNome + ", O resultado da função é: " + funcao);

        // fecha o scanner do teclado
        lerEntrada.close();
    }
}

