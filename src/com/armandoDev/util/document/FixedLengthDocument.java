/*
 * FixedLengthDocument.java
 * Copyright (c) SN SISTEMAS.
 *
 * Este software é confidencial e propriedade da SN SISTEMAS.
 * Não é permitida sua distribuição ou divulgação do seu conteúdo sem expressa autorização da SN SISTEMAS.
 * Este arquivo contém informações proprietárias.
 */
package com.armandoDev.util.document;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class FixedLengthDocument extends PlainDocument {

    private int maxLength;

    public FixedLengthDocument(int maxlen) {
        super();

        if (maxlen <= 0) {
            throw new IllegalArgumentException("Você deve especificar um comprimento máximo!");
        }

        maxLength = maxlen;
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr)
            throws BadLocationException {
        if (str == null || getLength() == maxLength) {
            return;
        }

        int totalLen = (getLength() + str.length());
        if (totalLen <= maxLength) {
            super.insertString(offset, str.toUpperCase(), attr);
            return;
        }

        String newStr = str.substring(0, (maxLength - getLength()));
        super.insertString(offset, newStr.toUpperCase(), attr);
        
    }
    
}
