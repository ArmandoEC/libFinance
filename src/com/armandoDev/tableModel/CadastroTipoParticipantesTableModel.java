package com.armandoDev.tableModel;

import com.armandoDev.entity.ParticipanteTipoEntity;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class CadastroTipoParticipantesTableModel extends AbstractTableModel {

    private List<ParticipanteTipoEntity> rows;
    private String[] columns = {"Código", "Nome"};

    public CadastroTipoParticipantesTableModel(List<ParticipanteTipoEntity> rows) {
        this.rows = rows;
    }

    @Override
    public String getColumnName(int column) {
        return this.columns[column];
    }

    @Override
    public int getRowCount() {
        return this.rows.size();
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {

        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            default:
                throw new IllegalArgumentException("Column index invalid");

        }

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        ParticipanteTipoEntity entity = this.rows.get(rowIndex);

        switch (columnIndex) {
            
            case 0:
                return entity.getCodigo();
            case 1:
                return entity.getNome();
            default:
                throw new IllegalArgumentException("Column index invalid");

        }

    }

    public ParticipanteTipoEntity getRow(int index) {
        return this.rows.get(index);
    }

    public List<ParticipanteTipoEntity> getRows() {
        return this.rows;
    }

    public void update() {
        fireTableDataChanged();
    }

}
