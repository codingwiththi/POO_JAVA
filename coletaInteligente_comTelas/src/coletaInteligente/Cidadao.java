
package coletaInteligente;

import Validador.ValidadorCidadao;
import java.util.Random;

public class Cidadao{
    int codigo;
    private String nome;
    private String email;
    private String senha;
    float latitude;
    float longitude;
    
    Random random = new Random();
    ValidadorCidadao valida = new ValidadorCidadao();
    
    public Cidadao (){
        this.codigo = random.nextInt(100);
        this.latitude = random.nextFloat();
        this.longitude = random.nextFloat();
    }
    
    public Cidadao (String nome, String email, String senha) throws Exception{
        valida.verificaNome(nome);
        valida.verificaEmail(email);
        valida.verificaSenha(senha);
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.codigo = random.nextInt(100);
        this.latitude = random.nextFloat();
        this.longitude = random.nextFloat();
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        valida.verificaNome(nome);
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    

    public void setEmail(String email) throws Exception {
        valida.verificaEmail(email);
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    
    
    public void setSenha(String senha) throws Exception {
        valida.verificaSenha(senha);
        this.senha = senha;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return getCodigo()+", "+getNome()+", "+getEmail()+", "+getSenha()+", "+getLatitude()+", "+getLongitude();   
    }



    

}