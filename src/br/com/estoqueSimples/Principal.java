package br.com.estoqueSimples;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String produto = "Teclado Mecânico";
        int quantidade = 50;
        int opcao = 0;

        Scanner scanner = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println("Informações do Produto:");
            System.out.println("Nome do Produto: " + produto);
            System.out.println("Quantidade em Estoque: " + quantidade);
            
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Consultar quantidade em estoque");
            System.out.println("2. Adicionar produtos ao estoque");
            System.out.println("3. Retirar produtos do estoque");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Quantidade em estoque: " + quantidade);
                    break;
                case 2:
                    System.out.print("Digite a quantidade de produtos a ser adicionada: ");
                    int quantidadeAdicionar = scanner.nextInt();
                    quantidade += quantidadeAdicionar;
                    System.out.println("Produtos adicionados ao estoque.");
                    break;
                case 3:
                    System.out.print("Digite a quantidade de produtos a ser retirada: ");
                    int quantidadeRetirar = scanner.nextInt();
                    if (quantidadeRetirar <= quantidade) {
                        quantidade -= quantidadeRetirar;
                        System.out.println("Produtos retirados do estoque.");
                    } else {
                        System.out.println("Quantidade insuficiente em estoque.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            if (quantidade < 10) {
                System.out.println("ALERTA: Quantidade em estoque está abaixo de 10 unidades!");
            }
        }

        scanner.close();
    }
}
