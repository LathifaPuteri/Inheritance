/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author MOKLET-2
 */
public class tube extends circle{
    double t;
    public void setT(double t){
        this.t=t;
    }
    public double getT(){
        return t;
    }
    @Override
    public void hitungdata(){
        double V = super.phi*super.r*super.r*t;
        double Lp = 2*super.phi*super.r*(super.r+t);
        System.out.println("Tinggi = "+getT());
        System.out.println("Volume Tube = "+V);
        System.out.println("Luas Permukaan Tube = "+Lp);
        System.out.println(" ");
    }
}
