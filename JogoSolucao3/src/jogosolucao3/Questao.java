/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogosolucao3;

/**
 *
 * @author thiag
 */
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public abstract class Questao {
    int pontos;
    int op1;
    int op2;
    int resultado;
    
    public Questao() {
        this.op1 = ThreadLocalRandom.current().nextInt(0, 100);
        this.op2 = ThreadLocalRandom.current().nextInt(0, 20);
    }
    
    public abstract boolean verificarResposta();
    
    public void exibirResultado() {
        if(this.verificarResposta())
        {
            JOptionPane.showMessageDialog(null, "Você Acertou!");
        }else
        {
            JOptionPane.showMessageDialog(null, "Você Errrooouuu!");
        }
    }
}
