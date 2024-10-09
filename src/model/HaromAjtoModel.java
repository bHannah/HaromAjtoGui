package model;

import java.util.Random;
import nezet.HaromAjtoNezet;

/**
 *
 * @author BothOrsolya(SZF_2023
 */
public class HaromAjtoModel {
    //adattagok
    //a cserével nyert körök számlálója
    int cserevelNyert;
    //a csere nélkül nyert körök számlálója
    int csereNelkulNyert;
    int korokSzama;
    boolean elsoAjto;
    boolean masodikAjto;
    boolean harmadikAjto;
    Random rnd = new Random();
    
    
    //konstruktor
    public HaromAjtoModel(int cserevelNyert, int csereNelkulNyert) {
        this.cserevelNyert = cserevelNyert;
        this.csereNelkulNyert = csereNelkulNyert;
        this.elsoAjto = false;
        this.masodikAjto = false;
        this.harmadikAjto = false;
        this.korokSzama = 0;
    }
    
    
    
    //elindítja a játékot
    public void jatekInditas(){
        java.awt.EventQueue.invokeLater(() -> {
            new HaromAjtoNezet().setVisible(true);
        });
    }
    public void nyertesAjtoSorsolas(){
        int szam = rnd.nextInt(0,4);
        switch (szam) {
            case 1:
                this.elsoAjto = true;
                break;
            case 2:
                this.masodikAjto = true;
                break;
            case 3:
                this.harmadikAjto = true;
                break;
            default:
                break;
        }
    }

    public int getCserevelNyert() {
        return cserevelNyert;
    }

    public int getCsereNelkulNyert() {
        return csereNelkulNyert;
    }

    public int getKorokSzama() {
        return korokSzama;
    }
    
    
}
