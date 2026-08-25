
package Revisao;


public class Comparacao {
    public static void main(String[] args) {
       int num1, num2;
       num1 = 3;
       num2 = 3;
        System.out.println(num1 == num2);
        
        String nome1 = "Edson";
        String nome2 = "Edson";
        System.out.println(nome1 == nome2);
        
        Double n1 = 3.5;
        Double n2 = 3.5;
        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));
        
        String nome3 = new String("João");
        String nome4 = new String("João");
        System.out.println(nome3 == nome4);
        System.out.println(nome3.equals(nome4));
        
    }
}
