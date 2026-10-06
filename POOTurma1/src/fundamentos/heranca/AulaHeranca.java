package fundamentos.heranca;

import fundamentos.associacao.Automovel;
import fundamentos.associacao.Pessoa;
import java.util.ArrayList;


public class AulaHeranca {
    public static void main(String[] args) {
        Hb20 h = new Hb20("cinza");
        //h.setCor("cinza");
        h.setAno(2022);
        System.out.println(h.getMotor().getFatorPotencia());
        Fusca fu = new Fusca();
        System.out.println("Cor do fusca: "+ fu.getCor());
        fu.acelera();
        System.out.println(fu.getMotor().getFatorPotencia());
        Ferrari ferrari = new Ferrari("vermelha");
        ferrari.setAno(2026);
        ferrari.acelera();
        System.out.println(ferrari.getMotor()
                .getFatorPotencia());
        System.out.println(ferrari.ligarTurbo());
        System.out.println(ferrari.ligarArCondicionado());
        System.out.println(ferrari.getMotor()
        .getAutomovel().getMotor().getAutomovel().getAno());
        Pessoa pe = new Pessoa();
        pe.setNome("Anthony");
        pe.setAutomovel(fu);
        pe.setAutomovel(ferrari);
        pe.setAutomovel(h);
        System.out.println(pe.getAutomoveis().get(1)
        .getCor());
        //lista de objetos do tipo automóvel
        ArrayList<Automovel> automoveis = new ArrayList<>();
        automoveis.add(h);
        automoveis.add(fu);
        automoveis.add(ferrari);
        for (Automovel auto : automoveis) {
            System.out.println("cores: "+auto.getCor());
            if (auto instanceof Ferrari) {
                Ferrari fe = (Ferrari) auto;
                System.out.println(fe.ligarArCondicionado());
            }
        }
        
    }
}
