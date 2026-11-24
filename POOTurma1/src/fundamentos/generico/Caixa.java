
package fundamentos.generico;

import java.util.ArrayList;

public class Caixa<T> {
    public T coisas;
    
    public void guardar(T coisa){
        coisas = coisa;
    }
    public T mostrar(){
        return coisas;
    }
}
