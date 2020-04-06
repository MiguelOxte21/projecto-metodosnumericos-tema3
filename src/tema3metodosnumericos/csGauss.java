/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3metodosnumericos;

/**
 *
 * @author cbo_m
 */
public class csGauss {
    int iteraciones;
    double x1=0,x2=0,x3=0,x4=0;

    public String toString() {
        System.out.println("iteracion: "+iteraciones+" x1: "+x1+" x2: "+x2+" x3 "+x3+" x4 "+x4+"\n");
        return super.toString();
    }

    public int getIteraciones() {
        return iteraciones;
    }

    public void setIteraciones(int iteraciones) {
        this.iteraciones = iteraciones;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getX4() {
        return x4;
    }

    public void setX4(double x4) {
        this.x4 = x4;
    }
    
    
}
