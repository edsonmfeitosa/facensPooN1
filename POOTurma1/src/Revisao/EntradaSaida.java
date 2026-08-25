
package Revisao;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class EntradaSaida {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = teclado.nextLine();
        System.out.println("Qual a sua idade?");
        int idade = Integer.parseInt(teclado.nextLine());
        System.out.println("Olá " + nome + ", você tem "+ idade);
        teclado.close();
        /*
        String nome = JOptionPane.
                showInputDialog(null, 
                        "Qual o seu nome?");
        int idade = Integer.parseInt(JOptionPane.
                showInputDialog(null,
                        "Qual a sua idade?"));
        JOptionPane.showMessageDialog(null, 
                "Olá " + nome + ", você tem "+ idade);
        */
    }
 
}
