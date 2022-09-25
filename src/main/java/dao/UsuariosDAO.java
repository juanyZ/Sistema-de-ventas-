/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Exceptions.ContraseñaIncorrectaException;
import Exceptions.UsuarioNoEncontradoException;
import resources.DBConnection;
import Modelo.UsuariosBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author dagyus
 */
public class UsuariosDAO {
    
    private static PreparedStatement ps;
    
    public static UsuariosBean getUsuario(String usuario, String password) throws ContraseñaIncorrectaException, UsuarioNoEncontradoException{
        UsuariosBean user = new UsuariosBean();
        Integer valor = null;
        List<UsuariosBean> listUsers = getAll();
        if (listUsers != null){
            for(UsuariosBean ub : listUsers){
                if(ub.getNombre().equals(usuario) && ub.getPassword().equals(password)){
                    user = ub;
                } else if(ub.getNombre().equals(usuario) && !ub.getPassword().equals(password)){
                    valor = 1;
                } else {
                    valor = 2;
                }
            }
        }
        if (!Objects.isNull(valor) && valor.equals(1)) {
            throw new ContraseñaIncorrectaException();
        } else if (valor.equals(2)) {
            throw new UsuarioNoEncontradoException();
        }
        return user;
    }
    
    private static List<UsuariosBean> getAll() {
        List<UsuariosBean> listUsers = new ArrayList<>();
        try {
            DBConnection.conectar();
            String sqlQuery = "SELECT * FROM usuarios;";
            ps = DBConnection.getConexion().prepareStatement(sqlQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Integer idUsuario = rs.getInt(1);
                String nombreUsuario = rs.getString(2);
                String passwordUsuario = rs.getString(3);
                listUsers.add(new UsuariosBean(idUsuario, nombreUsuario, passwordUsuario));
            }
            DBConnection.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta.");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No hay resultados.");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
        }
        return listUsers;
    }

    public static UsuariosBean getByID(Integer idUsuario) throws UsuarioNoEncontradoException {
        List<UsuariosBean> listUsers = getAll();
        for (UsuariosBean user : listUsers){
            if(user.getIdUsuario().equals(idUsuario)){
                return user;
            }
        }
        throw new UsuarioNoEncontradoException();
    }
    
    public static Integer getLastId() throws ClassNotFoundException, SQLException{
        Integer id;
        DBConnection.conectar();
        String sql = "SELECT MAX(idUsuario) FROM usuarios;";
        ps = DBConnection.getConexion().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        id = rs.getInt(1);
        DBConnection.desconectar();
        return id;
    }

    public static void alta(String nick, String pass, List<Boolean> permisos) {
        
    }
}
