
package exemplo.intefaces;

import java.util.List;

public class CalculaMediana implements ICalcula{        
     @Override
     public double calcula(List<Integer> lista){             
         double mediana = 0;
         double soma;
         if(lista.size() % 2 == 0){//par
             soma = (lista.get((lista.size()/2)-1) + lista.get((lista.size()/2)));
             mediana = soma/2;
         }else{//impar
            int meio = (lista.size()/2);
            mediana = lista.get(meio);
         }
        return mediana;
    }
}
