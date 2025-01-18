package com.armandoDev.util.document;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class StringDocument extends PlainDocument {
    
    private int maxLength;
    
    public StringDocument(int maxlen) {
        super();

        if (maxlen <= 0) {
            throw new IllegalArgumentException("Você deve especificar um comprimento máximo!");
        }

        maxLength = maxlen;
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {

        if (str == null) {
            return;
        }

        super.insertString(offset, str.toUpperCase(), attr);

    }
    
}
