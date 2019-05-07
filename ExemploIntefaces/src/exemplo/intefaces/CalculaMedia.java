
package exemplo.intefaces;

import java.util.List;

public class CalculaMedia implements ICalcula{        
    @Override
    public double calcula(List<Integer> lista){      
        double total=0;
        for(Integer item : lista){
            total+= item;
        }        
        double media = total/lista.size();
        return media;       
    }
}
