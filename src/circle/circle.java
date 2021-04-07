/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**public void hitungdata(){
        double K = 2*phi*r;
        double L = phi*r*r;
        System.out.println("Keliling lingkaran = "+K);
        System.out.println("Luas lingkaran = "+L);
    }
}
 *
 * @author MOKLET-2
 */
public class circle {
    double phi;
    double r;
    public void setr(double r){
        this.r=r;
    }
    public double getr(){
        return r;
    }
    public void setphi(double phi){
        this.phi=phi;
    }
    public double getphi(){
        return phi;
    }
    public void hitungdata(){
        double K = 2*phi*r;
        double L = phi*r*r;
        System.out.println("r = "+getr());
        System.out.println("phi = "+getphi());
        System.out.println("Keliling lingkaran = "+K);
        System.out.println("Luas lingkaran = "+L);
        System.out.println(" ");
    }
}
