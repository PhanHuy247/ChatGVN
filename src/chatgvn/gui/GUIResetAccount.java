/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatgvn.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Phan Huy
 */
public class GUIResetAccount {

    public static String RESET = "reset";
    public static String TEXT_EMAIL = "Email You Register : ";
    public static String TEXT_EMAIL_REGISTER = "Email";
    public static String TEXT_EMAIL_SEND = "A Email Will Send For You";
    public static String BUTTON_SEND = "SEND";
    
    private JFrame _jfMainWindow = new JFrame();
    private JLabel _jlEmail = new JLabel();
    private JLabel _jlEmailRegister = new JLabel();
    private JLabel _jlTextSendEmail = new JLabel();
    
    public JTextField _jtfEmail = new JTextField();
    public JButton _jbSendEmail = new JButton();

    public void buildWindowReset() {
        _jfMainWindow.setTitle(RESET);
        _jfMainWindow.setSize(300, 180);
        _jfMainWindow.setResizable(true);
        _jfMainWindow.setLocationRelativeTo(null);
        configureWindowLogin();
        _jfMainWindow.setVisible(true);
    }

    private void configureWindowLogin() {
        
        _jfMainWindow.setBackground(new java.awt.Color(255, 255, 255));
        _jfMainWindow.getContentPane().setLayout(null);

        _jlEmail.setText(TEXT_EMAIL);
        _jfMainWindow.getContentPane().add(_jlEmail);
        _jlEmail.setBounds(10, 25, 150, 25);
        
         _jlEmailRegister.setText(TEXT_EMAIL_REGISTER);
        _jfMainWindow.getContentPane().add(_jlEmailRegister);
        _jlEmailRegister.setBounds(10, 58, 50, 15);
        _jlEmailRegister.setForeground(new java.awt.Color(128,128,128));
        
        _jtfEmail.setForeground(new java.awt.Color(0, 0, 255));
        _jtfEmail.requestFocus();
        _jfMainWindow.getContentPane().add(_jtfEmail);
        _jtfEmail.setBounds(60, 55, 180, 25);
        
        _jlTextSendEmail.setText(TEXT_EMAIL_SEND);
        _jfMainWindow.getContentPane().add(_jlTextSendEmail);
        _jlTextSendEmail.setBounds(70, 90, 200, 15);
        _jlTextSendEmail.setForeground(new java.awt.Color(128,128,128));
        
        _jbSendEmail.setText(BUTTON_SEND);
        _jfMainWindow.getContentPane().add(_jbSendEmail);
        _jbSendEmail.setBounds(100, 110, 90, 25);
    }
    
}
