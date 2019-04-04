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

public class Jogo {
    int i = 0;
    int operacao;
    
    public void Jogo(){
        while(i < 5)
        {
            this.operacao = ThreadLocalRandom.current().nextInt(0, 3);
            if(this.operacao == 0)
            {
                QuestaoSoma novaQuestao = new QuestaoSoma ();
                novaQuestao.criarPergunta();
                novaQuestao.exibirResultado();       
            }else
            {
                if(this.operacao == 1)
                {
                    QuestaoSubtracao novaQuestao = new QuestaoSubtracao ();
                    novaQuestao.criarPergunta();
                    novaQuestao.exibirResultado();
                }else
                {
                    QuestaoMultiplicacao novaQuestao = new QuestaoMultiplicacao ();
                    novaQuestao.criarPergunta();
                    novaQuestao.exibirResultado();
                }
            }
            i = i+1;
        }
    }
    
}
