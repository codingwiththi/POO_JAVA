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
import javax.swing.JOptionPane;

public class QuestaoSoma extends Questao{
    
    @Override
    public boolean verificarResposta(){
        if(this.op1 + this.op2 == this.resultado)
        {
            return true;
        }else
        {
            return false;
        }
    }
    
    public void criarPergunta(){
        String respostatxt = JOptionPane.showInputDialog("Quanto é " + this.op1 + " + " + this.op2 + " ?");
        this.resultado = Integer.parseInt(respostatxt);
    }
    
    
}
