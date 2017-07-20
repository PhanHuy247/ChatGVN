/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatgvn.client;

import chatgvn.gui.GUILogin;
import chatgvn.gui.GUIResetAccount;

/**
 *
 * @author Phan Huy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUILogin loginGui = new GUILogin();
        loginGui.buildWindowLogin();
        ActionGUI actionGui = new ActionGUI(loginGui);
        actionGui.actionClickLabelForget();
//        GUIResetAccount guiReset = new GUIResetAccount();
//        guiReset.buildWindowReset();
    }
    
}
