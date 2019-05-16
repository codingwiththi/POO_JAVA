/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

/**
 *
 * @author thiag
 */
//YOUTUBE
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/ColetaInteligente";
    private static final String USER = "postgres";
    private static final String PASS = "root";

    public static Connection getConnection() {

        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão: ", ex);
        }

    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {

        closeConnection(con);

        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {

        closeConnection(con, stmt);
        
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

/*
















//DEVMEDIA
import java.sql.*;
import javax.swing.JOptionPane;

//*
//* @author mayron

public final class Conexao {
    private String local;
    private String user;
    private String senha;
    private Connection c;
    private Statement statment;
    private String str_conexao;
    private String driverjdbc;
 
    public Conexao(String bd, String local, String porta,
    String banco, String user, String senha) {
        if (bd.equals("PostgreSql")){
            setStr_conexao("jdbc:postgresql://"+ local +":" + porta +"/"+ banco);
            setLocal(local);
            setSenha(senha);
            setUser(user);
            setDriverjdbc("org.postgresql.Driver");
         }else {
            if (bd.equals("MySql")) {
                    setStr_conexao("jdbc:mysql://"+ local +":" + porta +"/"+ banco); 
                    setLocal(local);
                    setSenha(senha);
                    setUser(user);
                    setDriverjdbc("com.mysql.jdbc.Driver");
            }
        }
    } 
 
    public void configUser(String user, String senha) {
        setUser(user);
        setSenha(senha);
    }
 
    public void configLocal(String banco) {
        setLocal(banco);
    }
 
    //Conexão com o Banco de Dados
    public void conect(){
        try {
            Class.forName(getDriverjdbc());
            setC(DriverManager.getConnection(getStr_conexao(), getUser(), getSenha()));
            setStatment(getC().createStatement());
            JOptionPane.showMessageDialog(null, "Conectado");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro");
            System.err.println(e);
            e.printStackTrace();
        } 
    }
 
    public void disconect(){
        try {
            getC().close();
        }catch (SQLException ex) {
            System.err.println(ex);
            ex.printStackTrace();
        }
    }
 
    public ResultSet query(String query){
        try {
            return getStatment().executeQuery(query);
        }catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    } 
 
    // GETs AND SETs
    public String getLocal() {
        return local;
    }
 
    public void setLocal(String local) {
        this.local = local;
    }
 
    public String getUser() {
        return user;
    }
 
    public void setUser(String user) {
        this.user = user;
    }
 
    public String getSenha() {
        return senha;
    }
 
    public void setSenha(String senha) {
        this.senha = senha;
    }
 
    public Connection getC() {
        return c;
    }
 
    public void setC(Connection c) {
        this.c = c;
    }
 
    public Statement getStatment() {
        return statment;
    }
 
    public void setStatment(Statement statment) {
        this.statment = statment;
    }
 
    public String getStr_conexao() {
        return str_conexao;
    }
 
    public void setStr_conexao(String str_conexao) {
        this.str_conexao = str_conexao;
    }
 
    public String getDriverjdbc() {
        return driverjdbc;
    }
 
    public void setDriverjdbc(String driverjdbc) {
        this.driverjdbc = driverjdbc;
    }
 
}
*/