/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contasbanco;

import java.io.FileWriter;

import java.io.IOException;

import java.io.PrintWriter;

import java.util.logging.Level;

import java.util.logging.Logger;

/**
 *
 * @author thiag
 */
public class PersistenciaArquivo {
     public void salvarContaCorrente(ContaCorrente conta) {



        FileWriter arq;

        try {

            arq = new FileWriter("contaCorrente.txt", true);        

            PrintWriter gravarArq = new PrintWriter(arq);

            gravarArq.append( conta.getNomeCliente() + "," +conta.getNumConta()

                + ","+ conta.getAgencia()+","+ conta.getLimite() +"," + conta.getSaldo()+ "\r\n");        

            arq.close();   

        } catch (IOException ex) {

            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);

        }        

    }

    /**
     *
     * @param conta
     */
    public void salvarConta(ContaPoupanca conta) {



        FileWriter arq;

        try {

            arq = new FileWriter("contaPoupanca.txt", true);        

            PrintWriter gravarArq = new PrintWriter(arq);

            gravarArq.append( conta.getNomeCliente() + "," +conta.getNumConta()

                + ","+ conta.getAgencia()+","+ conta.getSaldo()+ "\r\n");        

            arq.close();   

        } catch (IOException ex) {

            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);

        }        

    }

    
}
