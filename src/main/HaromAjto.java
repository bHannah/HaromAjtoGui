package main;

import model.HaromAjtoModel;
import nezet.HaromAjtoNezet;
import vezerlo.HaromAjtoVezerlo;

/**
 *
 * @author BothOrsolya(SZF_2023
 */
public class HaromAjto {
    public static void main(String[] args) {
        //példányosítja a modell-t, értéket ad a csere és a csere nélkül nyert számlálóknak, eleinte mind a kettő 0.
        HaromAjtoModel model = new HaromAjtoModel(0,0);
        //példányosítja a nézetet
        HaromAjtoNezet nezet = new HaromAjtoNezet();
        
        
        //példányosítja a vezérlőt, ádatva neki a modellt és a nézetet. 
        HaromAjtoVezerlo haromAjtoVezerlo = new HaromAjtoVezerlo(nezet, model);
    }
}
