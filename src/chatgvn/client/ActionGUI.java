/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatgvn.client;

import chatgvn.gui.GUILogin;
import chatgvn.gui.GUIResetAccount;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Phan Huy
 */
public class ActionGUI {

    private GUILogin _guiLogin;

    public ActionGUI(GUILogin _guiLogin) {
        this._guiLogin = _guiLogin;
    }

    public void actionClickLabelForget() {
        _guiLogin._jlForgot.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent mEvent){
                _guiLogin._jfMainWindow.setVisible(false);
                GUIResetAccount guiReset = new GUIResetAccount();
                guiReset.buildWindowReset();
            }
        });
    }
}
