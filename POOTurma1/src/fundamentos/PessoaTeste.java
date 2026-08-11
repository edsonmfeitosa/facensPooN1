
package fundamentos;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Pessoa p2 = new Pessoa();
        p.corDosOlhos = "castanhos";
        p.DarNome("Guilherme");
        p2.DarNome("Edson");
        p2.corDosOlhos = "castanhos";
        System.out.println(p2.perguntarONome(p));
        //System.out.println(p.responderONome());
    }
}
