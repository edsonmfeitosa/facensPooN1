
package fundamentos.Listas;

import java.util.ArrayList;


public class AulaListas {
    public static void main(String[] args) {
        //array
        int[] numeros = new int[3];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        System.out.println(numeros[1]);
        //numeros[3] = 10;
        System.out.println("tamanho: "+
                numeros.length);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("-> "+numeros[i]);
        }    
        //arraylist
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Edson");
        nomes.add("Renata");
        nomes.add("Victor");
        nomes.add("Vinícius");
        System.out.println(nomes);
        nomes.add(1, "Daniela");
        System.out.println(nomes);
        if (nomes.contains("Victor")) {
            System.out.println("O Victor está na lista");
        }
        System.out.println(nomes.get(2));
        //pegar o indice
        System.out.println(nomes.indexOf("Edson"));
        System.out.println("Tamanho: "+nomes.size());
        nomes.remove("Edson");
        System.out.println(nomes);
        nomes.remove(1);
        System.out.println(nomes);
        
        Produto p1 = new Produto();
        p1.setNome("caneta");
        p1.setValor(3.5);
        p1.setDesconto(0d);
        Produto p2 = new Produto();
        p2.setNome("lápis");
        p2.setValor(2d);
        p2.setDesconto(0.1);
        Fornecedor f = new Fornecedor();
        f.setNome("Faber castel");
        f.setProduto(p1);
        f.setProduto(p2);
        for (String nome : nomes) {
            System.out.println(nome);
        }
        for (Produto produto : f.getProdutos()) {
            System.out.println(produto.getNome());
        }
        Fornecedor f2 = new Fornecedor();
        f2.setNome("HP");
        Produto p3 = new Produto();
        p3.setNome("notebook");
        p3.setValor(5500d);
        f2.setProduto(p3);
        ArrayList<Fornecedor> fornecedores =
                new ArrayList<>();
        fornecedores.add(f);
        fornecedores.add(f2);
        
        //mostrar os fornecedores e seus produtos
        for (Fornecedor forn : fornecedores) {
            System.out.println("--->"+forn.getNome());
            for (Produto p : forn.getProdutos()){
                System.out.println("---------> "+
                        p.getNome() + " Valor: "+ p.getValor());
            }
        }
    }   
}
