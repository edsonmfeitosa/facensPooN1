
package fundamentos.associacao;


public class Motor {
    private int fatorPotencia = 1000;
    private Automovel automovel;
    
    public Motor(Automovel automovel){
        this.automovel = automovel;
    }

    public int getFatorPotencia() {
        return fatorPotencia;
    }

    public void setFatorPotencia(int fatorPotencia) {
        this.fatorPotencia = fatorPotencia;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }
    
}
