package com.armandoDev.util.messages;

import javax.swing.JFrame;

public class MessagesUtil {
    
    public static void alertMessage(JFrame parent, boolean status, String message) {        
        AlertMessage alert = new AlertMessage(parent, status, message);
        alert.setVisible(true);        
    }
}
