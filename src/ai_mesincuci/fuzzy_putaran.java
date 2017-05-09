/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ai_mesincuci;

/**
 *
 * @author sate malmsteen
 */
public class fuzzy_putaran {
    
    public int putar(String model, String kain, String noda) {
        int ptr = 0;
        //kaos
        if(model.equalsIgnoreCase("K")) {
            ptr = kaos(kain, noda);
        }
        //jaket
        else if(model.equalsIgnoreCase("J")) {
            ptr = jaket(kain, noda);
        }
        //celana
        else if(model.equalsIgnoreCase("C")) {
            ptr = celana(kain, noda);
        }
        return ptr;
    }
    
    //model kaos
    public int kaos(String kain, String noda) {
        int ptr = 0;    
        //tipis - biasa
        if(kain.equalsIgnoreCase("tipis") && noda.equalsIgnoreCase("biasa")) {
            ptr = 3;
        }
        //tipis - sedang
        else if(kain.equalsIgnoreCase("tipis") && noda.equalsIgnoreCase("sedang")) {
            ptr = 5;
        }
        //tipis - parah
        else if(kain.equalsIgnoreCase("tipis") && noda.equalsIgnoreCase("parah")) {
            ptr = 7;
        }
        
        //tebal - biasa
        else if(kain.equalsIgnoreCase("tebal") && noda.equalsIgnoreCase("biasa")) {
            ptr = 6;
        }
        //tebal - sedang
        else if(kain.equalsIgnoreCase("tebal") && noda.equalsIgnoreCase("sedang")) {
            ptr = 9;
        }
        //tebal - parah
        else if(kain.equalsIgnoreCase("tebal") && noda.equalsIgnoreCase("parah")) {
            ptr = 12;
        }
        else {
            ptr = 1;
        }
        return ptr;
    }
    
    //model jaket
    public int jaket(String kain, String noda) {
        int ptr = 0;    
        //tipis - biasa
        if(kain.equalsIgnoreCase("tipis") && noda.equalsIgnoreCase("biasa")) {
            ptr = 5;
        }
        //tipis - sedang
        else if(kain.equalsIgnoreCase("tipis") && noda.equalsIgnoreCase("sedang")) {
            ptr = 8;
        }
        //tipis - parah
        else if(kain.equalsIgnoreCase("tipis") && noda.equalsIgnoreCase("parah")) {
            ptr = 11;
        }
        
        //tebal - biasa
        else if(kain.equalsIgnoreCase("tebal") && noda.equalsIgnoreCase("biasa")) {
            ptr = 15;
        }
        //tebal - sedang
        else if(kain.equalsIgnoreCase("tebal") && noda.equalsIgnoreCase("sedang")) {
            ptr = 17;
        }
        //tebal - parah
        else if(kain.equalsIgnoreCase("tebal") && noda.equalsIgnoreCase("parah")) {
            ptr = 21;
        }
        else {
            ptr = 1;
        }
        return ptr;
    }
    
    //model celana
    public int celana(String kain, String noda) {
        int ptr = 0;    
        //tipis - biasa
        if(kain.equalsIgnoreCase("tipis") && noda.equalsIgnoreCase("biasa")) {
            ptr = 4;
        }
        //tipis - sedang
        else if(kain.equalsIgnoreCase("tipis") && noda.equalsIgnoreCase("sedang")) {
            ptr = 7;
        }
        //tipis - parah
        else if(kain.equalsIgnoreCase("tipis") && noda.equalsIgnoreCase("parah")) {
            ptr = 9;
        }
        
        //tebal - biasa
        else if(kain.equalsIgnoreCase("tebal") && noda.equalsIgnoreCase("biasa")) {
            ptr = 10;
        }
        //tebal - sedang
        else if(kain.equalsIgnoreCase("tebal") && noda.equalsIgnoreCase("sedang")) {
            ptr = 14;
        }
        //tebal - parah
        else if(kain.equalsIgnoreCase("tebal") && noda.equalsIgnoreCase("parah")) {
            ptr = 18;
        }
        else {
            ptr = 1;
        }
        return ptr;
    }
}
