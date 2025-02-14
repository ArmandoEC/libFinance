package com.armandoDev.util.messages;

import javax.swing.JFrame;

public class MessagesUtil {
    
    public static void alertMessage(JFrame parent, boolean status, String message) {        
        AlertMessage alert = new AlertMessage(parent, status, message);
        alert.setVisible(true);        
    }
    
    public static void erroMessage(JFrame parent, boolean status, String message) {        
        ErroMessage erro = new ErroMessage(parent, status, message);
        erro.setVisible(true);        
    }
    
    public static void sucessMessage(JFrame parent, boolean status) {        
        SucessMessage sucess = new SucessMessage(parent, status);
        sucess.setVisible(true);        
    }
    
}
