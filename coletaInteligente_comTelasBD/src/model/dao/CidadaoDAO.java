/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Cidadao;


/**
 *
 * @author thiag
 */
public class CidadaoDAO {
    public void Insere(Cidadao c) {
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(
                    "INSERT INTO cidadao (cod_cidadao, nome, senha, email, latitude, longitude) VALUES (?,?,?,?,?,?)");
            stmt.setInt(1, c.getCodigo());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getSenha());
            stmt.setString(4, c.getEmail());
            stmt.setFloat(5, c.getLatitude());
            stmt.setFloat(6, c.getLongitude());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Insert criado com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(CidadaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Insert não deu certo");
        } finally {
            Conexao.closeConnection(con, stmt);
            
        }
        
        
    }
    
}
