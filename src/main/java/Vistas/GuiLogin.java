/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;
import dao.UsuariosDAO;
import Exceptions.ContraseñaIncorrectaException;
import Exceptions.UsuarioNoEncontradoException;
import Modelo.UsuariosBean;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author dagyus
 */
public class GuiLogin extends JFrame implements WindowListener, ActionListener{
    private static GuiLogin gui = null;
    private JTextField usuario;
    private JPasswordField password;
    private JLabel lUsuario, lPassword;
    private JButton btnLogin;
    private Container container=new Container();
    
    public GuiLogin(){
        super("Login");
        super.setSize(350, 200);
        super.setLocationRelativeTo(null);
        container=super.getContentPane();
        container.setLayout(null);
        lUsuario=new JLabel("Usuario: ");
        lUsuario.setBounds(40, 10, 60, 30);
        container.add(lUsuario);
        lPassword=new JLabel("Contraseña: ");
        lPassword.setBounds(40, 45, 80, 30);
        container.add(lPassword);
        usuario=new JTextField();
        usuario.setBounds(140, 12, 150, 30);
        container.add(usuario);
        password=new JPasswordField();
        password.setBounds(140, 47, 150, 30);
        container.add(password);
        btnLogin=new JButton("Iniciar Sesion");
        btnLogin.setBounds(90, 100, 150, 30);
        container.add(btnLogin);
        usuario.addActionListener(this);
        password.addActionListener(this);
        btnLogin.addActionListener(this);
        super.setVisible(true);
    }
    
    private void loguear(){
        UsuariosBean user2 = new UsuariosBean(1, "dagyus", "hola");
                        GuiMain guiPrincipal = new GuiMain(user2);
                        guiPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        closeInstance();
        /*if(!(usuario.getText().equals("")) && !(password.getPassword().equals(""))){
                    try {
                        UsuariosBean user = UsuariosDAO.getUsuario(usuario.getText(), new String(password.getPassword()));
                        GuiMain guiPrincipal = new GuiMain(user);
                        guiPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        closeInstance();
                    } catch (ContraseñaIncorrectaException | UsuarioNoEncontradoException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Ha ocurrido un error.\nContacte a un administrador.");
                        e.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Campo usuario o contraseña vacio.");
                }*/
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        loguear();
    }
    
    public static GuiLogin getInstance() {
        if (gui == null) {
            gui = new GuiLogin();
            gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        return gui;
    }
    
    public static void closeInstance(){
        gui.dispose();
        gui = null;
    }

    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        if(e.getSource()==gui){
            closeInstance();
        }
    }
}
