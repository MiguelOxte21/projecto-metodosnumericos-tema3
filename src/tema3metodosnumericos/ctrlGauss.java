/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3metodosnumericos;

import java.util.ArrayList;

/**
 *
 * @author cbo_m
 */
public class ctrlGauss {
    public tblGauss seidel (double error, int matriz[][], int numvar) {

        ArrayList<csGauss> lista = null;// = new ArrayList<csBiseccion>();
        lista = new ArrayList<csGauss>();
        tblGauss tabla = null;
        double errormayor = 1;
        int iteracion = 0;
        double x1, x1ante, x2, x2ante, x3, x3ante, x4, x4ante;
       csGauss fila = new csGauss();
        double errores[] = new double[numvar];
        while (errormayor >= error && iteracion < 10) {
            csGauss filar = new csGauss();
            fila.setIteraciones(iteracion + 1);

            filar.setIteraciones(iteracion + 1);
            x1ante = fila.getX1();
            x1 = (matriz[0][numvar] + matriz[0][1] * fila.getX2() + matriz[0][2] * fila.getX3() + matriz[0][3] * fila.getX4()) / matriz[0][0];
            errores[0] = (x1 - x1ante) / x1;
            fila.setX1(x1);
            filar.setX1(x1);
            errormayor = errores[0];

            x2ante = fila.getX2();
            x2 = (matriz[1][numvar] + matriz[1][0] * fila.getX1() + matriz[1][2] * fila.getX3() + matriz[1][3] * fila.getX4()) / matriz[1][1];
            errores[1] = (x2 - x2ante) / x2;
            fila.setX2(x2);
            filar.setX2(x2);
            if (errores[1] >= errormayor) {
                errormayor = errores[1];
            }
            for (int i = 0; i < errores.length; i++) {
                System.out.print(errores[i] + "\t");
            }
            System.out.println("");
            if (numvar > 2) {
                x3ante = fila.getX3();
                x3 = (matriz[2][numvar] + matriz[2][0] * fila.getX1() + matriz[2][1] * fila.getX2() + matriz[2][3] * fila.getX4()) / matriz[2][2];
                errores[2] = (x3 - x3ante) / x3;
                fila.setX3(x3);
                filar.setX3(x3);
                if (errores[2] >= errormayor) {
                    errormayor = errores[2];
                }
                for (int i = 0; i < errores.length; i++) {
                    System.out.print(errores[i] + "\t");
                }
                System.out.println("");
            }
            if (numvar > 3) {
                x4ante = fila.getX4();
                x4 = (matriz[3][numvar] + matriz[3][0] * fila.getX1() + matriz[3][1] * fila.getX2() + matriz[3][2] * fila.getX3()) / matriz[3][3];
                errores[3] = (x4 - x4ante) / x4;
                fila.setX4(x4);
                filar.setX4(x4);
                if (errores[3] >= errormayor) {
                    errormayor = errores[3];
                }
                fila.toString();
                for (int i = 0; i < errores.length; i++) {
                    System.out.print(errores[i] + "\t");
                }
                System.out.println("");
            }

            iteracion++;
            lista.add(filar);
        }
        tabla = new tblGauss(lista);
        tabla.setNum(numvar);
        return tabla;
    }
}
