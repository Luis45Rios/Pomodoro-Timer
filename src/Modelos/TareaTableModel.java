package Modelos;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class TareaTableModel extends AbstractTableModel {
    private final String[] columnNames = { "Nombre", "Nro. Pomodoros", "Tiempo de Enfoque", "Acciones" };
    private final List<Tarea> tareas;

    public TareaTableModel(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return tareas.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tarea tarea = tareas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tarea.getNombre();
            case 1:
                return tarea.getNumeroPomodoros();
            case 2:
                return tarea.getTiempoEnfoque();
            case 3:
                return "Eliminar";
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 3;
    }

    public void removeRow(int rowIndex) {
        tareas.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    public Tarea getTarea(int rowIndex) {
        return tareas.get(rowIndex);
    }
}
