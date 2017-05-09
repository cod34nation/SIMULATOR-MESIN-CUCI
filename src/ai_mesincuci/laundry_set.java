/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ai_mesincuci;

import javax.swing.JFrame;


/**
 *
 * @author sate malmsteen
 */
public class laundry_set {
    
    pisah_kategori pk = new pisah_kategori();
    fuzzy f = new fuzzy();
    fuzzy_putaran fp = new fuzzy_putaran();
    fuzzy_deterjen_air fda = new fuzzy_deterjen_air();
    JFrame fr;
    
    public void set_laundry(String[][] data, JFrame f) { 
        this.fr = f;        
        
        setPutih(data);
        setWTL(data);
        setWL(data);        
    }
    
    public void setPutih(String[][] data) {
        int jumlah = pk.hitungPutih(data);        
        if(jumlah > 0) {
            String putih[][] = pk.setPutih(data, jumlah);
            String fputih[][] = f.setFuzzy(putih);            
            int total = 0;
            
            int putaran_putih [] = new int[fputih.length];            
            for (int i = 0; i < fputih.length; i++) {
               putaran_putih[i] = (fp.putar(fputih[i][0], fputih[i][1], fputih[i][2])) * Integer.parseInt(fputih[i][5]); 
               total +=  Integer.parseInt(fputih[i][5]);
            }
            
            int det_air_putih[] = fda.deterjen_air(fputih);
            int jml_putaran_putih = putaran(putaran_putih) / putaran_putih.length;
            
            int proses[] = new int[4];
            proses[0] = det_air_putih[0]; 
            proses[1] = det_air_putih[1];
            proses[2] = total;
            proses[3] = jml_putaran_putih;            
            new laundry_proses(fr, false, 1, proses).setVisible(true);
        }
    }
    
    public void setWTL(String[][] data) {
        int jumlah = pk.hitungWTL(data);       
        if(jumlah > 0) {
            String wtl[][] = pk.setWarnaTidakLuntur(data, jumlah);
            String fwtl[][] = f.setFuzzy(wtl);           
            int total = 0;
            
            int putaran_wtl [] = new int[fwtl.length];
            for (int i = 0; i < fwtl.length; i++) {
                putaran_wtl[i] = (fp.putar(fwtl[i][0], fwtl[i][1], fwtl[i][2])) * Integer.parseInt(fwtl[i][5]); 
                total +=  Integer.parseInt(fwtl[i][5]);
            }
            
             int det_air_wtl[] = fda.deterjen_air(fwtl);  
             int jml_putaran_wtl = putaran(putaran_wtl) / putaran_wtl.length;
             
             int proses[] = new int[4];
             proses[0] = det_air_wtl[0]; 
             proses[1] = det_air_wtl[1];
             proses[2] = total;
             proses[3] = jml_putaran_wtl;
             new laundry_proses(fr, false, 2, proses).setVisible(true);
        } 
    }
    
     public void setWL(String[][] data) {
        int jumlah = pk.hitungWL(data);          
        if(jumlah > 0) {
            String wl[][] = pk.setWarnaLuntur(data, jumlah); 
            String fwl[][] = f.setFuzzy(wl);           
            int total = 0;
            
            int putaran_wl [] = new int[fwl.length];            
            for (int i = 0; i < fwl.length; i++) {
                putaran_wl[i] = (fp.putar(fwl[i][0], fwl[i][1], fwl[i][2])) * Integer.parseInt(fwl[i][5]);
                total +=  Integer.parseInt(fwl[i][5]);
            }       
        
            int det_air_wl[] = fda.deterjen_air(fwl);         
            int jml_putaran_wl = putaran(putaran_wl) / putaran_wl.length;
            
            int proses[] = new int[4];
            proses[0] = det_air_wl[0]; 
            proses[1] = det_air_wl[1];
            proses[2] = total;
            proses[3] = jml_putaran_wl;
            new laundry_proses(fr, false, 3, proses).setVisible(true);
        }
     }
    
    public int putaran(int[] putaran) {
        int total = 0;
        for (int i = 0; i < putaran.length; i++) {
            total += putaran[i];           
        }
        return total;
    }
}
