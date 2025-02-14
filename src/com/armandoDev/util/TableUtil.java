package com.armandoDev.util;

import java.util.List;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class TableUtil {
    
    public static void configureTable(JTable table, List<Integer> sizes) {

        table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        for (int i = 0; i < sizes.size(); i++) {
            table.getColumnModel().getColumn(i).setPreferredWidth(sizes.get(i));
        }

    }
    
    
}
