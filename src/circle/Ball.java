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
public class Ball extends circle{
    public void hitungBola(){
        double V = super.phi*super.r*super.r*super.r*4/3;
        double Lp = 4*super.phi*super.r*super.r;
        System.out.println("Volume Bola = "+V);
        System.out.println("Luas Bola = "+Lp);
        System.out.println(" ");
    }
}
