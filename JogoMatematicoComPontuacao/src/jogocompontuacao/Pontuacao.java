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
public class Pontuacao {
    int pontos = 0;
    
    public void verificarQuestao(Questao questao){        
        if(questao.verificarResposta()){
            pontos += questao.pontos;
        }
    }
    
    public void exibirPontuacao(){
        JOptionPane.showMessageDialog(null, "Sua pontuacao atual é:" + pontos);
    }
    
    
}
