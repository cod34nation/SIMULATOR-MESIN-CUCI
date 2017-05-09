/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ai_mesincuci;

/**
 *
 * @author sate malmsteen
 */
public class fuzzy_deterjen_air {
    
    public int[] deterjen_air(String[][] data) {
        String kat [] = new String[data.length];
        for (int i = 0; i < kat.length; i++) {
           kat[i] = kategori(data[i][1], data[i][2]);
        }
        
        return setDeterjenAir(kat, data);
    }            
    
    public String kategori(String kain, String noda) {
        String kat = "";
        if(kain.equalsIgnoreCase("Tipis") && noda.equalsIgnoreCase("Biasa")) {
            kat = "a";
        }
        else if(kain.equalsIgnoreCase("Tipis") && noda.equalsIgnoreCase("Sedang")) {
            kat = "b";
        }
        else if(kain.equalsIgnoreCase("Tipis") && noda.equalsIgnoreCase("Parah")) {
            kat = "c";
        }
        else if(kain.equalsIgnoreCase("Tebal") && noda.equalsIgnoreCase("Biasa")) {
            kat = "d";
        }
        else if(kain.equalsIgnoreCase("Tebal") && noda.equalsIgnoreCase("Sedang")) {
            kat = "e";
        }
        else if(kain.equalsIgnoreCase("Tebal") && noda.equalsIgnoreCase("Parah")) {
            kat = "f";
        }
        return kat;
    }
    
     /*
        1 gram   3liter     3   tipis-biasa = a
                            2   tipis-sedang = b
                            1   tipis-parah = c
     
        3 gram   7liter     3   tebal-biasa = d
                            2   tebal-sedang = e
                            1   tebal-parah = f
    */
    
    public int[] setDeterjenAir(String[] kat, String data[][]) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;        
        
        for (int i = 0; i < kat.length; i++) {
            if(kat[i].equalsIgnoreCase("a")) {
                a += Integer.parseInt(data[i][5]);
            }     
            else if(kat[i].equalsIgnoreCase("b")) {
                b += Integer.parseInt(data[i][5]);
                System.out.println(""+b+" : "+data[i][5]);
            }
            else if(kat[i].equalsIgnoreCase("c")) {
                c += Integer.parseInt(data[i][5]);
            }
            else if(kat[i].equalsIgnoreCase("d")) {
                d += Integer.parseInt(data[i][5]);
            }
            else if(kat[i].equalsIgnoreCase("e")) {
                e += Integer.parseInt(data[i][5]);
            }
            else if(kat[i].equalsIgnoreCase("f")) {
                f += Integer.parseInt(data[i][5]);
            }
        }        
                
        int bagi1 = (a/3) + (b/2) + c;
        int modul1 = (a%3) + (b%2);
        int gram1 = 1 * (bagi1 + modul1);
        int liter1 = 3 * (bagi1 + modul1);                      
        
        int bagi2 = (d/3) + (e/7) + f;
        int modul2 = (d%3) + (e%7);
        int gram2 = 3 * (bagi2 + modul2);
        int liter2 = 7 * (bagi2 + modul2);
        
        int det_air [] = new int[2];
        det_air[0] = (gram1 + gram2);
        det_air[1] = (liter1 + liter2);
        return det_air;
    }
}
