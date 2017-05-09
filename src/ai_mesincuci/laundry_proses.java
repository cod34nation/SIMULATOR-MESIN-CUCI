/*
 * laundry_proses.java
 *
 * Created on January 13, 2011, 2:44 AM
 */

package ai_mesincuci;

import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author  sate malmsteen
 */
public class laundry_proses extends javax.swing.JDialog {

    /** Creates new form laundry_proses */
    public laundry_proses(java.awt.Frame parent, boolean modal, int a, int data[]) {
        super(parent, modal);
        initComponents();
        String status = "";
        if(a == 1) {
            status = "Pencucian Pakaian Putih....";
        }
        else if(a == 2) {
            status = "Pencucian Pakaian Berwarna Dan Tidak Luntur....";
        }
        else if(a == 3) {
            status = "Pencucian Pakaian Berwarna Dan Luntur....";
        }
        
        lblKet.setText(status);
        lblDeterjen.setText(""+data[0]+" gram.");
        lblAir.setText(""+data[1]+" liter.");
        lblPakaian.setText(""+data[2]+" buah.");
        lblPutaran.setText(""+data[3]+" putaran.");
        int wktu = data[3]/2;        
        setWaktu(wktu);
        wkt = wktu / 20;
        
        lblBanyak.setText(""+((data[2]/20) + 1)+" X");
        wkt = wktu/20;
        setProgres(wkt);
    }

    public void setWaktu(int waktu) {
        int jam = 0;
        int menit = 0;
        int detik = 0;
        
        String jam0;
        String menit0;
        String detik0;
        
        if(waktu >= 60) {
            detik =  waktu % 60;
            menit = (waktu / 60);
            jam = (menit / 60);
        }
        else {
            detik = waktu;
        }
       
        if(jam <= 9) {
            jam0 = "0"+jam;
        }
        else {
            jam0 = ""+jam;
        }
        
        if(menit <= 9) {
            menit0 = "0"+menit;
        }
        else {
            menit0 = ""+menit;
        }
        
        if(detik <= 9) {
            detik0 = "0"+detik;
        }
        else {
            detik0 = ""+detik;
        }
        
        lblWaktu.setText(jam0+":"+menit0+":"+detik0);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        lblWaktu = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblBanyak = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        progres = new javax.swing.JProgressBar();
        lblCurrent = new javax.swing.JLabel();
        lblPutaran = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblPros = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblPakaian = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblAir = new javax.swing.JLabel();
        lblDeterjen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblKet = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("   Proses Laundry...");
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(0, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mesin.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 70, 280, 320);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kipas.gif"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(60, 120, 220, 210);

        panel.setBackground(new java.awt.Color(102, 102, 102));
        panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel.setLayout(null);
        getContentPane().add(panel);
        panel.setBounds(100, 170, 170, 130);

        lblWaktu.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblWaktu.setText("14:00:00");
        getContentPane().add(lblWaktu);
        lblWaktu.setBounds(420, 230, 80, 20);

        jLabel10.setText("Waktu");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(300, 230, 100, 20);

        lblBanyak.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblBanyak.setText("2 X");
        getContentPane().add(lblBanyak);
        lblBanyak.setBounds(420, 260, 80, 20);

        jLabel12.setText("Banyak Mencuci");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(300, 260, 100, 20);
        getContentPane().add(progres);
        progres.setBounds(300, 330, 220, 14);

        lblCurrent.setText("10 %");
        getContentPane().add(lblCurrent);
        lblCurrent.setBounds(390, 310, 70, 20);

        lblPutaran.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblPutaran.setText("12 Putaran");
        getContentPane().add(lblPutaran);
        lblPutaran.setBounds(420, 200, 100, 20);

        jLabel15.setText("Total Putaran");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(300, 200, 100, 20);

        lblPros.setText("Please Wait...");
        getContentPane().add(lblPros);
        lblPros.setBounds(330, 340, 190, 30);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        jLabel8.setText("Jumlah Cucian");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(300, 110, 100, 20);

        lblPakaian.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblPakaian.setText("0 buah");
        jPanel1.add(lblPakaian);
        lblPakaian.setBounds(420, 110, 100, 20);

        jLabel4.setText("Total Deterjen");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 140, 100, 20);

        jLabel6.setText("Total Air");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(300, 170, 100, 20);

        lblAir.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblAir.setText("0 ml");
        jPanel1.add(lblAir);
        lblAir.setBounds(420, 170, 100, 20);

        lblDeterjen.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblDeterjen.setText("0 gram");
        jPanel1.add(lblDeterjen);
        lblDeterjen.setBounds(420, 140, 100, 20);

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 100, 240, 280);

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel3.setText("Informasi ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(380, 80, 100, 20);

        lblKet.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblKet.setText("Washing Mechine Simulator");
        jPanel1.add(lblKet);
        lblKet.setBounds(180, 10, 230, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 580, 430);

        setSize(new java.awt.Dimension(563, 454));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void setProgres(int waktu) {
        int proses = 0;
        if(waktu % 2 == 1) {
            proses = (waktu+1) / 2;
        }
        else {
            proses = waktu / 2;
        }
        
        a = proses / 4;
        jalan = a;
        jam();
    }
    
    public void jam() {
       ActionListener taskPerformer = new ActionListener() {
      public void actionPerformed(ActionEvent evt) {  
            if(wkt == 0) {                
                lblPros.setText("Proses Completed..");
                lblCurrent.setText("100 %");
                progres.setValue(100);
            }
            else {
                wkt--;
                jalan--;
                if(jalan == 0) {
                    jalan = a;
                    pros += 25;                    
                }
                
                lblCurrent.setText(""+pros+" %");
                progres.setValue(pros);                
            }
      }
     };   
        new javax.swing.Timer(1000, taskPerformer).start();
    }
    
    /**
    * @param args the command line arguments
    */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAir;
    private javax.swing.JLabel lblBanyak;
    private javax.swing.JLabel lblCurrent;
    private javax.swing.JLabel lblDeterjen;
    private javax.swing.JLabel lblKet;
    private javax.swing.JLabel lblPakaian;
    private javax.swing.JLabel lblPros;
    private javax.swing.JLabel lblPutaran;
    private javax.swing.JLabel lblWaktu;
    private javax.swing.JPanel panel;
    private javax.swing.JProgressBar progres;
    // End of variables declaration//GEN-END:variables
    int wkt = 0;    
    int a = 0;
    int jalan = 0;
    int pros = 25;    
}