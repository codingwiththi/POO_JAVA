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
    
    Pontuacao pontuacao = new Pontuacao();
    
    public void Jogo(){
        while(i < 5)
        {
            this.operacao = ThreadLocalRandom.current().nextInt(0, 3);
            if(this.operacao == 0)
            {
                QuestaoSoma novaQuestao = new QuestaoSoma ();
                novaQuestao.criarPergunta();
                novaQuestao.exibirResultado();
                pontuacao.verificarQuestao(novaQuestao);
            }else
            {
                if(this.operacao == 1)
                {
                    QuestaoSubtracao novaQuestao = new QuestaoSubtracao ();
                    novaQuestao.criarPergunta();
                    novaQuestao.exibirResultado();
                    pontuacao.verificarQuestao(novaQuestao);
                }else
                {
                    QuestaoMultiplicacao novaQuestao = new QuestaoMultiplicacao ();
                    novaQuestao.criarPergunta();
                    novaQuestao.exibirResultado();
                    pontuacao.verificarQuestao(novaQuestao);
                }
            }
            i = i+1;
            
        }
        pontuacao.exibirPontuacao();
    }
    
    
}
