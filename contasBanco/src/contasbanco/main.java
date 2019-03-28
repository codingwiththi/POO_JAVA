/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contasbanco;
import javax.swing.JOptionPane; //Importar bibliotéca de dialogo

/**
 *
 * @author thiag
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numConta = JOptionPane.showInputDialog("Digite o número da conta: ");
        String agencia = JOptionPane.showInputDialog("Digite a agência da conta: ");
        String nomeCliente = JOptionPane.showInputDialog("Digite o Nome do cliente: ");
        String limite = JOptionPane.showInputDialog("Digite o Limite: ");
        String saldo = JOptionPane.showInputDialog("Digite o Saldo: ");
        
        ContaCorrente contaCliente = new ContaCorrente(numConta, nomeCliente, saldo, limite, agencia);
        ContaPoupanca contaCliente2 = new ContaPoupanca(numConta, nomeCliente, saldo, agencia);
        contaCliente.imprimirSaldo();
        contaCliente2.imprimirSaldo();
        
        PersistenciaArquivo salvar = new PersistenciaArquivo();
        PersistenciaArquivo salvar2 = new PersistenciaArquivo();
        salvar.salvarContaCorrente(contaCliente);
        salvar2.salvarConta(contaCliente2);
    }

    
}
