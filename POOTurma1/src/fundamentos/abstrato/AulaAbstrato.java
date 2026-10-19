
package fundamentos.abstrato;

public class AulaAbstrato {
    public static void main(String[] args) {
        //Animal a = new Animal();
        Cachorro cao = new Cachorro();
        System.out.println(cao.fala());
        System.out.println(cao.morder());
        System.out.println(cao.respirar());
        System.out.println(cao.mover());
        Gato gato = new Gato();
        System.out.println(gato.fala());
        System.out.println(gato.respirar());

    }
}
