/**
 * Criar uma calculadora que realiza soma, multiplicação, divisão e subtração.
 * 
 * 1 - Pedir dois números para o usuário (Double).
 * 2 - Apresentar uma tabela / texto para escolher a operação.
 * 3 - Resgatar a operação que o usuário selecionou.
 * 4 - Realizar o calculo.
 * 5 - Exibir o resultado.
 * 6 - Se a operação escolhida for inválida, exibir a mensagem de erro.
 * 7 - Se a divisão for por zero, exiba uma mensagem de erro.
 *  */


// Importando o Scanner.
import java.util.Scanner;


public class calculadoraSimples {

    public static void main(String[] args) {
    
    // Ativando o Scanner.
    Scanner scanner = new Scanner(System.in);
    
    // Caixa de texto do programa.
    System.out.println("Olá seja bem vindo!.");
    System.out.println("Escolha uma opção abaixo em número: ");
    System.out.println("1) Soma");
    System.out.println("2) Multiplicação");
    System.out.println("3) Divisão");
    System.out.println("4) Subtração");
    System.out.println("5) Sair");
    
    // Coletando a opção do usuário.
    int escolha = scanner.nextInt();

    // Estrutura da opção de sair. Mais as opções invalidas que não existem no programa.
    if(escolha == 5){
        System.out.println("Você escolheu a opção (Sair). Obrigado por utilizar meu programa!.");
        
        // Encerra o programa imediatamente.
        System.exit(0);

    }else if(escolha < 1 || escolha > 5){
        System.out.println("Esta opção não existe, por favor escolha uma das opções acima.");

        // Encerra o programa imediatamente.
        System.exit(0);
    }
    // Coletando o primeiro número do usuário.
    System.out.println("Digite o primeiro número: ");
    double primeiroNum = scanner.nextDouble();

    // Coletando o segundo número do usuário.
    System.out.println("Digite o segundo número: ");
    double segundoNum = scanner.nextDouble();
    

    //Estrutura dos cálculos das operações.
    switch (escolha) {
        case 1:
            System.out.println("Sua escolha foi adição. Resultado da sua operação: " + (primeiroNum + segundoNum));
            break;
        case 2:
            System.out.println("Sua escolha foi a multiplicação. Resultado da sua operação: " + (primeiroNum * segundoNum));
            break;
        case 3:
            if(segundoNum == 0){
                System.out.println("Operação invalida. Divisão por 0 não pode ser efetuado!.");
            }else{
                System.out.println("Sua escolha foi a divisão. Resultado da sua operação: " + (primeiroNum / segundoNum));
            }
            break;
        case 4:
            System.out.println("Sua escolha foi a subtração. Resultado da sua operção: " + (primeiroNum - segundoNum));
            break;
        }

        // Fechando o programa Scanner.
        scanner.close();
    }
}