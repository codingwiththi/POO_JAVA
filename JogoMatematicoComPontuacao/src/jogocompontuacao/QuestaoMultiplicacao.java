/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogocompontuacao;

import javax.swing.JOptionPane;

/**
 *
 * @author thiag
 */
public class QuestaoMultiplicacao extends Questao{
    
    @Override
    public boolean verificarResposta(){
        return this.op1 * this.op2 == this.resultado;
    }
    
    public void criarPergunta(){
        String respostatxt = JOptionPane.showInputDialog("Quanto é " + this.op1 + " * " + this.op2 + " ?");
        this.resultado = Integer.parseInt(respostatxt);
    }
    
}
