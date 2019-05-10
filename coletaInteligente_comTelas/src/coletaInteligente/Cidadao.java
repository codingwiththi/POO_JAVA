
package coletaInteligente;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 

public class Cidadao{
    int codigo;
    String nome;
    String email;
    String senha;
    float latitude;
    float longitude;
    
    Random random = new Random();
    
    public Cidadao (){
        this.codigo = random.nextInt(100);
        this.latitude = random.nextFloat();
        this.longitude = random.nextFloat();
    }
    
    public Cidadao (String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        
    }
    
    public int getCodigo() {
        return codigo;
    }
    //setCodigo gera um código aleatório para o cliente, 
    //não existe isso do cliente inserir o próprio cod, 
    //ninguém insere o préprio cod
    /*public void setCodigo() {
        this.codigo = random.nextInt(100);
    }*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public float getLatitude() {
        return latitude;
    }

    //Se o sistema vai pegar a localização automaticamente, pq a gente tá digitando isso?
    /*public void setLatitude() {
        this.latitude = random.nextFloat();
    }*/

    public float getLongitude() {
        return longitude;
    }

    /*public void setLongitude() {
        this.longitude = random.nextFloat();
    }*/

    @Override
    public String toString() {
        return getCodigo()+", "+getNome()+", "+getEmail()+", "+getSenha()+", "+getLatitude()+", "+getLongitude();   
    }



    

}