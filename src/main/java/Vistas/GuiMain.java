/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import Modelo.UsuariosBean;
import Resources.Fuente;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class GuiMain extends JFrame implements ActionListener {

    private Container container = new Container();
    private JButton btnBuscar, btnAgregar, btnEditar;
    private ImageIcon iconFind, iconAdd, iconUpdate;
    private Fuente font = new Fuente();
    private JMenuBar menu;
    private JMenu productos;
    private JMenuItem addProduct, searchProduct, removeProduct;
    private UsuariosBean user;

    public GuiMain(UsuariosBean usuario) {
        super("Bookstore");
        this.user = user;
        super.setResizable(false);
        super.setSize(800, 460);
        super.setLocationRelativeTo(null);
        container = super.getContentPane();
        container.setLayout(null);
        menu = createMenuBar();
        productos=new JMenu("Productos");
        addProduct=new JMenuItem("Agregar");
        searchProduct=new JMenuItem("Buscar");
        removeProduct=new JMenuItem("Quitar");
        productos.add(addProduct);
        productos.add(searchProduct);
        productos.add(removeProduct);
        menu.add(productos);
        container.add(menu);
        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    private JMenuBar createMenuBar(){
        menu=new JMenuBar();
        menu.setBounds(0, 0, super.getWidth(), 20);
        menu.setFont(font.MyFont(0, 20f));
        return menu;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }

}
