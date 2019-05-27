/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatgvn.client;

import chatgvn.control.CheckSendEmail;
import chatgvn.gui.GUILogin;
import chatgvn.gui.GUIRegister;
import chatgvn.gui.GUIResetAccount;
import chatgvn.utils.ValidateEmail;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Phan Huy
 */
public class ActionGUI {

    private GUILogin _guiLogin;
    private String emailRegister;
    private CheckSendEmail checkSendEmail;

    public ActionGUI(GUILogin _guiLogin) {
        this._guiLogin = _guiLogin;
    }

    public void actionClickLabelForget() {
        _guiLogin._jlForgot.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent mEvent) {
                _guiLogin._jfMainWindow.setVisible(false);
                GUIResetAccount guiReset = new GUIResetAccount();
                guiReset.buildWindowReset();
                getEmailReset(guiReset);

            }

        });
    }

    public void actionClickLabelRegister() {
        _guiLogin._jbRegister.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                _guiLogin._jfMainWindow.setVisible(false);
                GUIRegister guiRegister = new GUIRegister();
                guiRegister.buildWindowRegister();

                actionButtonRegister(guiRegister);

            }

        });
    }

    private void actionButtonRegister(final GUIRegister guiRegister) {
        guiRegister._jbRegister.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String userName = guiRegister._jtfUserName.getText().trim();
                String passWord = guiRegister._jtfPassWord.getText().trim();
                String email = guiRegister._jtfEmail.getText().trim();
                String phoneNumber = guiRegister._jtfPhoneNumber.getText().trim();
                String questionSecrect = guiRegister._jtfQuestionSecret.getText().trim();
                System.out.println(userName.length());             
                if (userName.equals(null) || passWord == "" || email == "" || phoneNumber == "" || questionSecrect == "") {
                    guiRegister._jlTextWaring.setVisible(true);
                }
            }
        });
    }

    private void getEmailReset(final GUIResetAccount guiReset) {

        guiReset._jbSendEmail.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent aEvent) {
                emailRegister = guiReset._jtfEmail.getText();
                guiReset._jtfEmail.setText("");
                ValidateEmail validateEmail = new ValidateEmail();

                if (!validateEmail.isValidEmailAddress(emailRegister)) {
                    guiReset._jlNotification.setText("email not invalid");
                    return;
                }
                checkSendEmail = new CheckSendEmail();
                if (checkSendEmail.checkDatabaseEmail(emailRegister)) {
                    beSendEmailReset(guiReset);
                } else {
                    guiReset._jlNotification.setText("email not correct");
                    return;
                }
            }

        });
    }

    private void beSendEmailReset(GUIResetAccount guiReset) {
        guiReset.buildWindowSendEmail();
    }
}
