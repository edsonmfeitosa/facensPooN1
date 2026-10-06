package fundamentos.heranca;

import fundamentos.associacao.Automovel;

public class Ferrari extends Automovel implements Luxo, Esportivo{
    
    public Ferrari(String cor) {
        super(cor);
    }
    public Ferrari(){
        super("");
    }

    @Override
    public void acelera() {
        super.acelera(); 
        super.acelera(); 
        super.acelera(); 
        super.acelera(); 
        super.acelera(); 
        super.acelera(); 
        super.acelera(); 
        super.acelera(); 
        super.acelera(); 
        super.acelera(); 
        super.acelera(); 
    }

    @Override
    public String ligarArCondicionado() {
        return "o ar condicionado está ligado!";
    }

    @Override
    public String desligarArCondicionado() {
        return "O ar condicionado está desligado!";
    }

    @Override
    public String ligarTurbo() {
        return "Turbo ligado";
    }

    @Override
    public String desligarTurbo() {
        return "Turbo desligado!";
    }
    
}
