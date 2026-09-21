package fundamentos.lista02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        /*
        Menu:
        1 – Criar Curso
        2 – Criar Aluno (Perguntar os dados do aluno e escolher o curso do aluno)
        3 – Remover Aluno
        4 – Mostrar Todos os Cursos
        5 – Mostrar alunos do curso
        6 – Sair
         */
        int opcao = 0;
        Scanner tec = new Scanner(System.in);
        ArrayList<Curso> cursos = new ArrayList<>();
        
        while (opcao != 6) {
            System.out.println("1 – Criar Curso");
            System.out.println("2 – Criar Aluno");
            System.out.println("3 – Remover Aluno");
            System.out.println("4 – Mostrar Todos os Cursos");
            System.out.println("5 – Mostrar alunos do curso");
            System.out.println("6 – Sair");
            opcao = Integer.parseInt(tec.nextLine());
            switch (opcao) {
                case 1:
                    Curso c = new Curso();
                    System.out.println("Digite o código do curso");
                    c.setCodigo(Integer.parseInt(tec.nextLine()));
                    System.out.println("Digite o nome do curso");
                    c.setNome(tec.nextLine());
                    System.out.println("Digite a carga horária");
                    c.setCargaHoraria(Integer.parseInt(tec.nextLine()));
                    cursos.add(c);
                    break;
                case 2:
                    Aluno a = new Aluno();
                    int optCurso;
                    System.out.println("Digite o RA do aluno");
                    a.setRa(tec.nextLine());
                    System.out.println("Digite o nome do aluno");
                    a.setNome(tec.nextLine());
                    for (int i = 0; i < cursos.size(); i++) {
                        System.out.println(i + " - " + 
                                cursos.get(i).getNome());
                    }
                    optCurso = Integer.parseInt(tec.nextLine());
                    cursos.get(optCurso).inserirAluno(a);
                    
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    for (Curso curso : cursos) {
                        System.out.println(curso.imprimir());
                    }
                    break;
                case 5:
                    for (Curso curso : cursos) {
                        System.out.println(curso.imprimirCompleto());
                    }
                    break;
                case 6:
                    System.out.println("O sistema será fechado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        tec.close();
    }
}
