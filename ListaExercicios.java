import java.util.Scanner;

public class ListaExercicios {

    public static void main(String[] args) {

        // criando o scanner pra ler tudo que o usuário digitar
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            // menu principal
            System.out.println("\n===== MENU DE EXERCÍCIOS =====");
            System.out.println("0. Sair");
            System.out.println("1. Exercício 1");
            System.out.println("2. Exercício 2");
            System.out.println("3. Exercício 3");
            System.out.println("4. Exercício 4");
            System.out.println("5. Exercício 5");
            System.out.println("6. Exercício 6");
            System.out.println("7. Exercício 7");
            System.out.println("8. Exercício 8");
            System.out.println("9. Exercício 9");
            System.out.println("10. Exercício 10");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite um número inteiro: ");
                    int num = sc.nextInt();

                    // usando resto da divisão pra descobrir se é par
                    if (num % 2 == 0) {
                        System.out.println("PAR");
                    } else {
                        System.out.println("ÍMPAR");
                    }
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    int a = sc.nextInt();

                    System.out.print("Digite o segundo número: ");
                    int b = sc.nextInt();

                    if (a > b) {
                        System.out.println("Maior: " + a);
                    } else if (b > a) {
                        System.out.println("Maior: " + b);
                    } else {
                        System.out.println("Iguais");
                    }
                    break;

                case 3:
                    System.out.println("1- Somar");
                    System.out.println("2- Subtrair");
                    System.out.println("3- Multiplicar");
                    System.out.println("4- Dividir");

                    System.out.print("Escolha a operação: ");
                    int op = sc.nextInt();

                    System.out.print("Digite o primeiro número: ");
                    double n1 = sc.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    double n2 = sc.nextDouble();

                    // switch interno pra calculadora
                    switch (op) {
                        case 1:
                            System.out.println("Resultado: " + (n1 + n2));
                            break;
                        case 2:
                            System.out.println("Resultado: " + (n1 - n2));
                            break;
                        case 3:
                            System.out.println("Resultado: " + (n1 * n2));
                            break;
                        case 4:
                            // cuidado com divisão por zero
                            if (n2 == 0) {
                                System.out.println("Erro: divisão por zero!");
                            } else {
                                System.out.println("Resultado: " + (n1 / n2));
                            }
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 4:
                    double nota;

                    // fica pedindo até o valor estar dentro do intervalo
                    do {
                        System.out.print("Digite uma nota (0 a 100): ");
                        nota = sc.nextDouble();
                    } while (nota < 0 || nota > 100);

                    System.out.println("Nota válida: " + nota);
                    break;

                case 5:
                    int numero;
                    int maior = Integer.MIN_VALUE;
                    int menor = Integer.MAX_VALUE;

                    System.out.println("Digite números (0 para parar):");

                    while (true) {
                        numero = sc.nextInt();

                        if (numero == 0)
                            break;

                        if (numero > maior)
                            maior = numero;

                        if (numero < menor)
                            menor = numero;
                    }

                    // tratando caso o usuário não digitou nada válido
                    if (maior == Integer.MIN_VALUE) {
                        System.out.println("Nenhum número válido foi digitado.");
                    } else {
                        System.out.println("Maior: " + maior);
                        System.out.println("Menor: " + menor);
                    }
                    break;

                case 6:
                    double saldo = 1000;
                    int escolha;

                    do {
                        System.out.println("\n1- Depositar");
                        System.out.println("2- Sacar");
                        System.out.println("3- Ver saldo");
                        System.out.println("4- Sair");

                        System.out.print("Escolha: ");
                        escolha = sc.nextInt();

                        switch (escolha) {

                            case 1:
                                System.out.print("Valor para depositar: ");
                                double dep = sc.nextDouble();

                                if (dep > 0) {
                                    saldo += dep;
                                } else {
                                    System.out.println("Valor inválido.");
                                }
                                break;

                            case 2:
                                System.out.print("Valor para sacar: ");
                                double saque = sc.nextDouble();

                                if (saque > 0 && saque <= saldo) {
                                    saldo -= saque;
                                } else {
                                    System.out.println("Saque inválido.");
                                }
                                break;

                            case 3:
                                System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                                break;
                        }

                    } while (escolha != 4);

                    System.out.printf("Saldo final: R$ %.2f\n", saldo);
                    break;

                case 7:
                    System.out.print("Valor da compra: ");
                    double valor = sc.nextDouble();

                    System.out.print("Categoria (1 = comum, 2 = premium, 3 = funcionário): ");
                    int cat = sc.nextInt();

                    double desconto = 0;

                    // definindo o desconto baseado na categoria
                    switch (cat) {
                        case 1:
                            desconto = valor * 0.05;
                            System.out.println("Categoria comum - 5% de desconto");
                            break;

                        case 2:
                            desconto = valor * 0.10;
                            System.out.println("Categoria premium - 10% de desconto");
                            break;

                        case 3:
                            desconto = valor * 0.15;
                            System.out.println("Categoria funcionário - 15% de desconto");
                            break;

                        default:
                            System.out.println("Categoria inválida");
                            break;
                    }

                    // só mostra se for categoria válida
                    if (cat >= 1 && cat <= 3) {
                        System.out.printf("Desconto: R$ %.2f\n", desconto);
                        System.out.printf("Valor final: R$ %.2f\n", (valor - desconto));
                    }

                    break;

                case 8:
                    int positivos = 0, negativos = 0, zeros = 0;

                    for (int i = 0; i < 10; i++) {
                        int x = sc.nextInt();

                        if (x > 0)
                            positivos++;
                        else if (x < 0)
                            negativos++;
                        else
                            zeros++;
                    }

                    System.out.println("Positivos: " + positivos);
                    System.out.println("Negativos: " + negativos);
                    System.out.println("Zeros: " + zeros);
                    break;

                case 9:
                    System.out.print("Digite N: ");
                    int N = sc.nextInt();

                    int soma = 0;

                    for (int i = 1; i <= N; i++) {
                        soma += i;
                    }

                    System.out.println("Soma: " + soma);
                    break;

                case 10:
                    System.out.print("Digite N (>0): ");
                    int n = sc.nextInt();

                    int total = 0;

                    // contagem regressiva com soma
                    for (int i = n; i >= 1; i--) {
                        System.out.print(i + " ");
                        total += i;
                    }

                    System.out.println("\nSoma = " + total);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        // fechando o scanner (boa prática)
        sc.close();
    }
}