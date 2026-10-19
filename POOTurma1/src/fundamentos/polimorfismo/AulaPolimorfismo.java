
package fundamentos.polimorfismo;

public class AulaPolimorfismo {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Edson", 63d);
        Feijao f = new Feijao();
        f.setPeso(0.070);
        Arroz a = new Arroz();
        a.setPeso(0.200);
        Carne c = new Carne();
        c.setPeso(0.150);
        System.out.println("Peso atual: "+p.getPeso());
        p.comer(a);
        p.comer(f);
        p.comer(c);
        System.out.println("Peso atual: "+p.getPeso());
    }
}
