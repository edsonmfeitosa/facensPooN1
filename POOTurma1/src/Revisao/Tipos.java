
package Revisao;


public class Tipos {
    public static void main(String[] args) {
        /*
        Numéricos
        Inteiros
            byte – 1 byte
            short – 2 bytes
            int – 4 bytes
            long – 8 bytes
        Reais
            float – 4 bytes
            double – 8 bytes
        Caracter
            char
        Booleano
            boolean
        */
        byte x = 1;
        short x2 = 2;
        x = (byte)x2;
        System.out.println(x);
        float num3 = 3.5f;
        
        //inferência de tipos
        var nome = "Edson";
        var numero = 10; //nesse caso assume o int (padrão)
        
        int n1 = 3;
        Integer n2 = 3;
        System.out.println(n1);
        System.out.println(n2);
        
        //exemplos com Wrapper
        float m1 = 10.2F;
        String teste = n2.toString();
        int teste2 = Integer.parseInt("10");
        
        //Booleano
        boolean b = true; //false
        System.out.println(b);
        System.out.println(n1 == n2);
        
        
        
    }
}
