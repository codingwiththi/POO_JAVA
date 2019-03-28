/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author 20162BSI0317
 */
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
public class Questao 
{
    public Questao() {}
    public void criarPergunta() 
    {
        int i = 0;
        int operacao = ThreadLocalRandom.current().nextInt(0,3);
        
        while(i < 5)
        {
            int operador1 = ThreadLocalRandom.current().nextInt(0,100);
            int operador2 = ThreadLocalRandom.current().nextInt(0, 20);
            
            if(operacao == 0)
            {
                String resposta = JOptionPane.showInputDialog("Quanto é " + operador1 + " + " + operador2);
                int respostaEmInteiro = Integer.parseInt(resposta);
                
                if(operador1 + operador2 == respostaEmInteiro)
                {
                    JOptionPane.showMessageDialog(null, "Você acertou!");
                }else
                {
                    JOptionPane.showMessageDialog(null, "Você errou!");
                }
                
            }else
            {
                if(operacao == 1)
                {
                    String resposta = JOptionPane.showInputDialog("Quanto é " + operador1 + " - " + operador2);
                    int respostaEmInteiro = Integer.parseInt(resposta);
                
                    if(operador1 - operador2 == respostaEmInteiro)
                    {
                        JOptionPane.showMessageDialog(null, "Você acertou!");
                    }else
                    {
                        JOptionPane.showMessageDialog(null, "Você errou!");
                    }
                
                }else
                {
                    if(operacao == 2)
                    {
                        operador2 = ThreadLocalRandom.current().nextInt(0, 10);
                        String resposta = JOptionPane.showInputDialog("Quanto é " + operador1 + " * " + operador2);
                        int respostaEmInteiro = Integer.parseInt(resposta);
                
                        if(operador1 * operador2 == respostaEmInteiro)
                        {
                            JOptionPane.showMessageDialog(null, "Você acertou!");
                        }else
                        {
                            JOptionPane.showMessageDialog(null, "Você errou!");
                        }
                
                    }
                }
                
            }
            operacao = ThreadLocalRandom.current().nextInt(0,3);
            i++;
              
            
        }
        
        
    }
}
