/*
 * NumbersDocument.java
 * Copyright (c) SN SISTEMAS.
 *
 * Este software é confidencial e propriedade da SN SISTEMAS.
 * Não é permitida sua distribuição ou divulgação do seu conteúdo sem expressa autorização da SN SISTEMAS.
 * Este arquivo contém informações proprietárias.
 */
package com.armandoDev.util.document;

import javax.swing.text.BadLocationException;

public class NumbersDocument extends FixedLengthDocument {

    public NumbersDocument(int maxlen) {
        super(maxlen);
    }

    @Override
    public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException {

        super.insertString(offset, str.toUpperCase().replaceAll("[^0-9]", ""), attr);

    }

}
