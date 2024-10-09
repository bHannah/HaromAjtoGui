package vezerlo;

import nezet.HaromAjtoNezet;
import model.HaromAjtoModel;

public class HaromAjtoVezerlo {
    //adattagok
    private HaromAjtoNezet nezet;
    private HaromAjtoModel model;
    
    //konstruktor
    public HaromAjtoVezerlo(HaromAjtoNezet nezet, HaromAjtoModel modell) {
        this.model = modell;
        this.nezet = nezet;
        start(); 
    }
    
    //vezérli a játék menetét
    private void start(){
        nezet.korokSzamaKiiras(model.getKorokSzama());
        nezet.statisztika(model.getCserevelNyert(), model.getCsereNelkulNyert());
        model.jatekInditas();
        model.nyertesAjtoSorsolas();
    }
}
