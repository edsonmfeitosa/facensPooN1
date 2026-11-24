
package fundamentos.generico;

import fundamentos.associacao.Pessoa;


public class AulaGenerica {
    public static void main(String[] args) {
        /*
        CaixaDeObjetos cxO = new CaixaDeObjetos();
        Pessoa p = new Pessoa();
        cxO.guardar(p);
        String nome = "Edson";
        cxO.guardar(nome);
        System.out.println(cxO.mostrar());
        */
        Caixa<Pessoa> caixaDeNumeros = new Caixa<>();
    }
}
