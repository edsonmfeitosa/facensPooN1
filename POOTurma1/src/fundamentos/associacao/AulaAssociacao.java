
package fundamentos.associacao;

import java.util.ArrayList;

public class AulaAssociacao {
    public static void main(String[] args) {
        //Motor m1 = new Motor();
        Automovel a1 = new Automovel("azul");
        //a1.setModelo("fusca");
        a1.setCor("branco");
        a1.setAno(1969);
        //a1.setMotor(m1);
        //System.out.println(a1.getModelo());
        System.out.println(a1.toString());
        a1.acelera();
        a1.acelera();
        System.out.println("Velocidade atual:"+
                a1.getMotor().getFatorPotencia());
        a1.freia();
        Automovel a2 = new Automovel("vermelho");
        //a2.setModelo("Onix");
        a2.setAno(2015);
        a2.setCor("cinza");
        System.out.println(a2.getMotor()
                .getFatorPotencia());
        System.out.println(
            a2.getMotor().getAutomovel()
                .getMotor().getAutomovel()

        );
        Pessoa p1 = new Pessoa();
        p1.setNome("Edson");
        p1.setEmail("edson.feitosa@facens.br");
        p1.setAutomovel(a2);
        System.out.println(p1.getAutomoveis()
        .get(0).getMotor()
        .getAutomovel());
        Pessoa p2 = new Pessoa();
        p2.setNome("Ericsson");
        p2.setAutomovel(a1);
        System.out.println(
                p2.getAutomoveis()
                .get(0).getMotor()
                .getAutomovel()
                .getDono().getNome()
        );
        Automovel a3 = new Automovel("branco");
        //a3.setModelo("StepWay");
        p1.setAutomovel(a3);
        ArrayList<Pessoa> pessoas = 
                new ArrayList<>();
        pessoas.add(p2);
        pessoas.add(p1);
    }
}
