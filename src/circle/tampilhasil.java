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
public class tampilhasil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       circle lingkaran = new circle();
       tube Tabung = new tube();
       Ball Bola = new Ball();
       Cone Kerucut = new Cone();
       
       lingkaran.setr(10);
       lingkaran.setphi(3.14);
       lingkaran.hitungdata();
       
       Tabung.setT(5);
       Tabung.setphi(3.14);
       Tabung.setr(10);
       Tabung.hitungdata();
       
       Bola.setphi(3.14);
       Bola.setr(10);
       Bola.hitungBola();
       
       Kerucut.setphi(3.14);
       Kerucut.setr(10);
       Kerucut.setT(7);
       Kerucut.setsisi(4);
       Kerucut.hitungCone();
    }
}
