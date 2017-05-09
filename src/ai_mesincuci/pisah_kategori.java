/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ai_mesincuci;

/**
 *
 * @author sate malmsteen
 */
public class pisah_kategori {
    
    public int hitungPutih(String[][] data) {
        int jumlah = 0;
        for (int i = 0; i < data.length; i++) {
            if(data[i][3].equalsIgnoreCase("P")) {
                jumlah++;
            }
        }
        return jumlah;
    }
    
    public int hitungWTL(String[][] data) {
        int jumlah = 0;
        for (int i = 0; i < data.length; i++) {
            if(data[i][3].equalsIgnoreCase("W") &&
               data[i][4].equalsIgnoreCase("T")) {
                jumlah++;
            }
        }
        return jumlah;
    }
    
    public int hitungWL(String[][] data) {
        int jumlah = 0;
        for (int i = 0; i < data.length; i++) {
            if(data[i][3].equalsIgnoreCase("W") &&
               data[i][4].equalsIgnoreCase("Y")) {
                jumlah++;
            }
        }
        return jumlah;
    }
    
    public String [][] setPutih(String[][] data, int jumlah) {
        String pakaian [][] = new String [jumlah][6];
        int a = 0;
        for (int i = 0; i < data.length; i++) {           
            if(data[i][3].equalsIgnoreCase("P")) {               
                pakaian[a][0] = data[i][0]; //model
                pakaian[a][1] = data[i][1]; //kain
                pakaian[a][2] = data[i][2]; //noda
                pakaian[a][3] = data[i][3]; //warna
                pakaian[a][4] = data[i][4]; //pudar
                pakaian[a][5] = data[i][5]; //jumlah
                a++;                
            }
        }
        return pakaian;
    }
    
    //berwarna - tidak luntur
     public String [][] setWarnaTidakLuntur(String[][] data, int jumlah) {
        String pakaian [][] = new String [jumlah][6];
        int a = 0;
        for (int i = 0; i < data.length; i++) {
            if(data[i][3].equalsIgnoreCase("W") &&
               data[i][4].equalsIgnoreCase("T")) {
                pakaian[a][0] = data[i][0]; //model
                pakaian[a][1] = data[i][1]; //kain
                pakaian[a][2] = data[i][2]; //noda
                pakaian[a][3] = data[i][3]; //warna
                pakaian[a][4] = data[i][4]; //pudar
                pakaian[a][5] = data[i][5]; //jumlah
                a++;     
            }
        }
         return pakaian;
    }
    
     //berwarna - luntur
     public String [][] setWarnaLuntur(String[][] data, int jumlah) {
        String pakaian [][] = new String [jumlah][6];
        int a = 0;
        for (int i = 0; i < data.length; i++) {
            if(data[i][3].equalsIgnoreCase("W") &&
               data[i][4].equalsIgnoreCase("Y")) {
                    pakaian[a][0] = data[i][0]; //model
                    pakaian[a][1] = data[i][1]; //kain
                    pakaian[a][2] = data[i][2]; //noda
                    pakaian[a][3] = data[i][3]; //warna
                    pakaian[a][4] = data[i][4]; //pudar
                    pakaian[a][5] = data[i][5]; //jumlah
                    a++;     
            }
        }
         return pakaian;
    }
}
