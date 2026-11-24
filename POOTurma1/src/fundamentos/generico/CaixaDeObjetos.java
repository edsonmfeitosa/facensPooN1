package fundamentos.generico;

import java.util.ArrayList;

public class CaixaDeObjetos {
    public ArrayList<Object> coisas;
    
    public void guardar(Object coisa){
        this.coisas.add(coisa);
    }
    public ArrayList<Object> mostrar(){
        return coisas;
    }
}
