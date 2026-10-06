
package fundamentos.associacao;

public class Automovel {
    //private String modelo;
    private String cor;
    protected int ano;
    private Motor motor;
    private Pessoa dono;
    
    public Automovel(String cor){
        this.cor = cor;
        motor = new Motor(this);
    }
/*
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
*/
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    public void acelera(){
        motor.setFatorPotencia(
                motor.getFatorPotencia() + 1
        );
    }
    public void freia(){
        if (motor.getFatorPotencia() > 0) {
            motor.setFatorPotencia(
                motor.getFatorPotencia() - 1
            );
        }
    }

    @Override
    public String toString() {
        return "Automovel{"  
                + ", cor=" + cor + ", ano=" + ano 
                + ", motor=" + motor.getFatorPotencia() + '}';
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }
   
}
