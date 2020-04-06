/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3metodosnumericos;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author cbo_m
 */
public class tblGauss extends AbstractTableModel{
    private int num;
    
    public void setNum(int num) {
        this.num = num;
    }
    
    private String[] columnas = {" Iteracion ", " X1 ", " X2 ", "X3", " X4 "};
    private ArrayList<csGauss> lista = null;

    public tblGauss(ArrayList<csGauss> resultados) {
        this.lista = resultados;
    }

    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return num + 1;
    }

    @Override
    public Object getValueAt(int i, int columna) {
        csGauss fila = this.lista.get(i);
        switch (columna) {

            case 0:
                return fila.getIteraciones();

            case 1:
                return fila.getX1();

            case 2:
                return fila.getX2();
            case 3:
                return fila.getX3();
            case 4:
                return fila.getX4();
        }
        return null;
    }

    /*@Override
    public boolean isCellEditable(int i, int i1) {
        return true;
    }*/

    @Override
    public String getColumnName(int i) {
        return this.columnas[i];
    }
    
    
}
