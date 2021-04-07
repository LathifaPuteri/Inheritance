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
public class Cone extends circle{
    double sisi;
    double t;
    public void setT(double t){
        this.t=t;
    }
    public double getT(){
        return t;
    }
    public void setsisi(double sisi){
        this.sisi=sisi;
    }
    public double getsisi(){
        return sisi;
    }
     public void hitungCone(){
        double S = super.phi*super.r*sisi; 
        double V = super.phi*super.r*super.r*t/3;
        double Lp = super.phi*super.r*(super.r+S);
        System.out.println("Luas Selimut Kerucut = "+S);
        System.out.println("Volume Selimut = "+V);
        System.out.println("Luas Selimut = "+Lp);
        System.out.println(" ");
    }
}
