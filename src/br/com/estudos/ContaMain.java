package br.com.estudos;

import java.util.Locale;
import java.util.Scanner;

public class ContaMain {

    public static void main(String[] args) {
        ContaClass contaClass;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("1 - Conta Corrente %n2 - Conta Poupança %nInforme o número da operação: %n");
        int numOperacao = sc.nextInt();

        if (numOperacao == 1) {
            System.out.println("Entre com o número da conta: ");
            int numConta = sc.nextInt();
            System.out.println("Entre com o nome do titular da conta: ");
            sc.nextLine();
            String nomeConta = sc.nextLine();
            System.out.println("Entre com o valor do depósito: ");
            Double valorDeposito = sc.nextDouble();
            System.out.println("Entre com o valor do saque: ");
            Double valorSaque = sc.nextDouble();

            contaClass = new ContaClass(numConta, nomeConta);
            contaClass.deposito(valorDeposito);
            contaClass.saque(valorSaque);

            System.out.println("==========================================================");
            System.out.println("                         EXTRATO                          ");
            System.out.println();
            System.out.printf(" Titular:%s Conta:%d Saldo em Conta:R$ %.2f %n", contaClass.getNomeConta(), contaClass.getNumConta(), contaClass.getSaldoConta());
            System.out.println();
            System.out.println("==========================================================");

        } else if (numOperacao == 2){
            System.out.println("Entre com o número da conta: ");
            int numConta = sc.nextInt();
            System.out.println("Entre com o nome do titular da conta: ");
            sc.nextLine();
            String nomeConta = sc.nextLine();
            System.out.println("Entre com o valor do depósito: ");
            Double valorDeposito = sc.nextDouble();
            System.out.println("Entre com o valor do saque: ");
            Double valorSaque = sc.nextDouble();

            contaClass = new ContaPoupancaClass(numConta, nomeConta);
            contaClass.deposito(valorDeposito);
            contaClass.saque(valorSaque);

            System.out.println("==========================================================");
            System.out.println("                         EXTRATO                          ");
            System.out.println();
            System.out.printf(" Titular:%s Conta:%d Saldo em Conta:R$ %.2f %n", contaClass.getNomeConta(), contaClass.getNumConta(), contaClass.getSaldoConta());
            System.out.println();
            System.out.println("==========================================================");
        } else {
            System.out.println("Valor informado inexistente !");
        }

        System.out.printf("Deseja realizar outra operação ? %n1 - Sim %n2 - Não %n%n");
        sc.nextLine();
        Integer snOperacao = sc.nextInt();

        if (snOperacao == 1){
            System.out.println();
            ContaMain cm = new ContaMain();
            cm.main(args);
        }

        sc.close();
    }


}
