
package fundamentos.lista01;

import java.util.Scanner;


public class Exercicio1 {
    public static void main(String[] args) {
        /*
        Menu:
        1 – Criar pessoa
        2 – Mostrar pessoa
        3 – Sair
        */
        int opcao = 0;
        Scanner tec = new Scanner(System.in);
        Pessoa p = new Pessoa();
        while(opcao != 3)
        {
            System.out.println("Menu:");
            System.out.println("1 – Criar pessoa");
            System.out.println("2 – Mostrar pessoa");
            System.out.println("3 – Sair");
            opcao = Integer.parseInt(tec.nextLine());
            switch (opcao) {
                case 1:
                    //System.out.println("Criar pessoa");
                    System.out.println("Digite o CPF");
                    p.setCpf(tec.nextLine());
                    System.out.println("Digite o nome");
                    p.setNome(tec.nextLine());
                    System.out.println("Digite o sexo: M - Masculino | F - Feminino");
                    p.setSexo(tec.nextLine().charAt(0));
                    System.out.println("Digite a idade");
                    p.setIdade(Integer.parseInt(tec.nextLine()));
                    break;
                case 2:
                    //System.out.println("Mostrar pessoa");
                    System.out.println(p.imprimir());
                    break;
                case 3:
                    System.out.println("O sistema será fechado.");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }
        
        tec.close();
    }
}
