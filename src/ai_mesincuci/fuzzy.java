/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ai_mesincuci;

/**
 *
 * @author sate malmsteen
 */
public class fuzzy {
    String [] kain;
    String [] noda;
    String [][] pakaian;    
    
    public String[][] setFuzzy(String[][] data) {
        int a = data.length;
        kain = new String[a];
        noda = new String[a];
        pakaian = new String[a][6];       
        
        if(data.length > 0) {           
            fuzzyKain(data);
        
            //set fuzzy noda
            String [] nd = new String[data.length]; 
            for (int i = 0; i < data.length; i++) {
                nd[i] = data[i][1];
            }
            fuzzyNoda(nd);
        
            //model, kain, noda, warna, pudar, jumlah
            for (int i = 0; i < data.length; i++) {
                pakaian[i][0] = data[i][0]; //model
                pakaian[i][1] = kain[i]; //kain
                pakaian[i][2] = noda[i]; //noda
                pakaian[i][3] = data[i][3]; //warna
                pakaian[i][4] = data[i][4]; //pudar
                pakaian[i][5] = data[i][5]; //jumlah
            }
        }
        return pakaian;
    }
    
    public void fuzzyKain(String[][] data) {
        //sutera, katun, parasit, kain = tipis
        //wol, kulit, jeans = tebal
        for (int i = 0; i < data.length; i++) {
            String jenis = "";                        
            if(data[i][1].equalsIgnoreCase("Wol") ||
               data[i][1].equalsIgnoreCase("Kulit") ||
               data[i][1].equalsIgnoreCase("Jeans") ||
               data[i][1].equalsIgnoreCase("Parasit")) {
                jenis = "Tebal";
            }
            else {
                jenis = "Tipis";
            }
            kain[i] = jenis;
        }
    }
    
    public void fuzzyNoda(String[] data) {        
        //kotor biasa = keringat, lumpur
        //kotor parah = minyak, cat
        //kotor sedang = kecap, saos, lainnya  
        for (int i = 0; i < data.length; i++) {
            String kotor = "";       
            if(data[i].equalsIgnoreCase("Keringat") ||
               data[i].equalsIgnoreCase("Lumpur")) {
                    kotor = "Biasa";
            }
            else if(data[i].equalsIgnoreCase("Minyak") ||
               data[i].equalsIgnoreCase("Cat")) {
                    kotor = "Parah";
            }
            else {
                    kotor = "Sedang";
            }
            noda[i] = kotor;
        }              
    }
}
