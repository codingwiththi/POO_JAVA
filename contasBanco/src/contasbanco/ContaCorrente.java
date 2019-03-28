/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contasbanco;

/**
 *
 * @author thiag
 */
public class ContaCorrente{
    //ATRIBUTOS
    //Nome do Cliente
    private String nomeCliente;
    //Saldo da Conta
    private double saldo=0;
    //Numero conta
    private int numConta;
    //Agencia numero
    private int agencia;
    //limite da conta
    private double limite=0;
    
    public ContaCorrente(String numConta, String nomeCliente, String saldo, String limite, String agencia){
        this.numConta = Integer.parseInt(numConta);
        this.nomeCliente = nomeCliente;
        this.saldo = Double.parseDouble(saldo);
        this.limite = Double.parseDouble(limite);
        this.agencia = Integer.parseInt(agencia);
    }
    
    //METODOS
    //DEPOSITAR UM VALOR NA CONTA
    public boolean depositar(double valor){
        return true; 
    }
    public boolean sacar(double valor){
        return true;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    
    
    
//SACA UM VALOR DA CONTA
    public void imprimirSaldo(){
        System.out.println("PREZADO SR(a), "+ nomeCliente);
        System.out.println("Seu saldo atual na sua Conta Corrente é: R$"+saldo);
    }
}
