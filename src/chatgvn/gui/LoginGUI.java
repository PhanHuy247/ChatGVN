/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatgvn.gui;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Phan Huy
 */
public class LoginGUI {

    private JFrame _jfMainWindow = new JFrame();
    private JLabel _jlUserName = new JLabel();
    private JTextField _jtfUserName = new JTextField();
    private JLabel _jlPassWord = new JLabel();
    private JTextField _jtfPassWord = new JTextField();
    private JButton _jbLogin = new JButton();
    private JButton _jbRegister = new JButton();
    private JLabel _jlForgot = new JLabel();

    public void buildWindowLogin() {
        _jfMainWindow.setTitle("Login");
        _jfMainWindow.setSize(350, 220);
        _jfMainWindow.setResizable(true);
        _jfMainWindow.setLocationRelativeTo(null);
        configureWindowLogin();
        windowLoginAction();
        _jfMainWindow.setVisible(true);

    }

    private void configureWindowLogin() {
        _jfMainWindow.setBackground(new java.awt.Color(255, 255, 255));
        _jfMainWindow.getContentPane().setLayout(null);

        _jlUserName.setText("UserName");
        _jfMainWindow.getContentPane().add(_jlUserName);
        _jlUserName.setBounds(20, 45, 60, 15);

        _jtfUserName.setForeground(new java.awt.Color(0, 0, 255));
        _jtfUserName.requestFocus();
        _jfMainWindow.getContentPane().add(_jtfUserName);
        _jtfUserName.setBounds(100, 40, 200, 25);

        _jlPassWord.setText("PassWord");
        _jfMainWindow.getContentPane().add(_jlPassWord);
        _jlPassWord.setBounds(20, 80, 60, 15);

        _jtfPassWord.setForeground(new java.awt.Color(0, 0, 255));
        _jtfPassWord.requestFocus();
        _jfMainWindow.getContentPane().add(_jtfPassWord);
        _jtfPassWord.setBounds(100, 75, 200, 25);

        _jbLogin.setText("Login");
        _jfMainWindow.getContentPane().add(_jbLogin);
        _jbLogin.setBounds(65, 123, 90, 25);

        _jbRegister.setText("Register");
        _jfMainWindow.getContentPane().add(_jbRegister);
        _jbRegister.setBounds(195, 123, 90, 25);
        
        _jlForgot.setText("Do you forget account ?");
        _jfMainWindow.getContentPane().add(_jlForgot);
        _jlForgot.setBounds(100, 160, 150, 15);
        _jlForgot.setBackground(Color.BLUE);
    }

    private void windowLoginAction() {
        
    }
}
