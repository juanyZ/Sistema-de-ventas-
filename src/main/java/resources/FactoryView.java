/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author dagyus
 */
public class FactoryView {
    public static JLabel factoryLabel(String caption, int x, int y, int width, int height){
        JLabel lblRetorno = new JLabel(caption);
        lblRetorno.setBounds(x, y, width, height);
        return lblRetorno;
    }
    
    public static JTextField factoryTextField(int x, int y, int width, int height){
        JTextField txtRetorno = new JTextField();
        txtRetorno.setBounds(x, y, width, height);
        return txtRetorno;
    }
    
    public static JButton factoryButton(String caption, int x, int y, int width, int height){
        JButton btnRetorno = new JButton(caption);
        btnRetorno.setBounds(x, y, width, height);
        return btnRetorno;
    }
    
    public static JCheckBox factoryCheckBox(String caption, int x, int y, int width, int height){
        JCheckBox chkRetorno = new JCheckBox(caption);
        chkRetorno.setBounds(x, y, width, height);
        return chkRetorno;
    }
    
    public static JPasswordField factoryPasswordField(int x, int y, int width, int height){
        JPasswordField pwdRetorno = new JPasswordField();
        pwdRetorno.setBounds(x, y, width, height);
        return pwdRetorno;
    }
    
    public static JPanel factoryPanel(int x, int y, int width, int height, LayoutManager layout, boolean enabled, 
            Dimension d){
        JPanel pnl = new JPanel(layout);
        pnl.setBounds(x, y, width, height);
        pnl.setEnabled(enabled);
        pnl.setPreferredSize(d);
        return pnl;
    }

    public static JScrollPane factoryPanelWithScroll(int x, int y, int width, int height, JPanel pnl){
        JScrollPane scroll = new JScrollPane(pnl);
        scroll.setBounds(x, y, width, height);
        return scroll;
    }
}
