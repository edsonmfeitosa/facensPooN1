
package fundamentos;


public class AreaDoCirculo {
    private static final double pi = 3.14159;
    private double raio;
    public static int quantidade;
    
    public AreaDoCirculo(){
        quantidade ++;
    }
    
    public AreaDoCirculo(double raio){
        this.raio = raio;
        quantidade ++;
    }
    public double setRaio(double raio){
        return this.raio = raio;
    }
    public double getRaio(){
        return this.raio;
    }
    /*
    public void setPi(double pi){
        this.pi = pi;
    }
    */
    public double getPi(){
        return this.pi;
    }
    public double CalcularArea(){
        return pi * raio * raio;
    }
    public static double CalcularArea(double raio){
        return pi * Math.pow(raio, 2);
    }
}
