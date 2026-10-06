package fundamentos.heranca;


public class AulaHeranca {
    public static void main(String[] args) {
        Hb20 h = new Hb20("cinza");
        //h.setCor("cinza");
        h.setAno(2022);
        System.out.println(h.getMotor().getFatorPotencia());
        Fusca fu = new Fusca();
        System.out.println("Cor do fusca: "+ fu.getCor());
    }
}
