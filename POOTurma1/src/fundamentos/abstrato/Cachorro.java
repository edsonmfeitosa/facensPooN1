
package fundamentos.abstrato;

public class Cachorro extends Mamifero{

    @Override
    public String fala() {
        return "au au";
    }

    @Override
    public String mover() {
        return "com quatro patas";
    }
    public String morder(){
        return "cuidado! Que o cachorro morde!";
    }
    
}
