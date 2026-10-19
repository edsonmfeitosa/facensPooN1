
package fundamentos.abstrato;

public class Gato extends Mamifero{

    @Override
    public String fala() {
        return "miau";
    }

    @Override
    public String mover() {
        return "com as quatro patas";
    }
    
}
