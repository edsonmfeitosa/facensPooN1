
package fundamentos;


public class AreaDoCirculoTeste {
    public static void main(String[] args) {
        AreaDoCirculo a1 = new AreaDoCirculo(10.2);
        System.out.println("Quantidade: "+ a1.quantidade);
        AreaDoCirculo a2 = new AreaDoCirculo();
        //a1.setRaio(10.2);
        a2.setRaio(5.5);
        //a2.setPi(3.14159);
        System.out.println("Valor da área: "+a1.CalcularArea());
        System.out.println("Valor da área: "+a2.CalcularArea());
        
        //exemplo de atributo estático
        
        System.out.println("Quantidade: "+ a2.quantidade);
        
        System.out.println(AreaDoCirculo.CalcularArea(4.5));
    }
}
