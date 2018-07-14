/*
  Dilarang keras menggandakan/mengcopy/menyebarkan/membajak/mendecompile 
  Software ini dalam bentuk apapun tanpa seijin pembuat software
  (Khanza.Soft Media). Bagi yang sengaja membajak softaware ini ta
  npa ijin, kami sumpahi sial 1000 turunan, miskin sampai 500 turu
  nan. Selalu mendapat kecelakaan sampai 400 turunan. Anak pertama
  nya cacat tidak punya kaki sampai 300 turunan. Susah cari jodoh
  sampai umur 50 tahun sampai 200 turunan. Ya Alloh maafkan kami 
  karena telah berdoa buruk, semua ini kami lakukan karena kami ti
  dak pernah rela karya kami dibajak tanpa ijin.
 */

package simrskhanza;

import fungsi.koneksiDB;
import fungsi.sekuel;
import fungsi.validasi;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import inventory.DlgCariKonversi;
import inventory.DlgCariObat;
import inventory.DlgCariObat2;
import inventory.DlgCariObat3;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author perpustakaan
 */
public class DlgCatatan extends javax.swing.JDialog {
    private Connection koneksi=koneksiDB.condb();
    private sekuel Sequel=new sekuel();
    private validasi Valid=new validasi();
    private PreparedStatement ps;
    private ResultSet rs;

    /** Creates new form DlgPemberianObat
     * @param parent
     * @param modal */
    public DlgCatatan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.setLocation(8,1);
        setSize(885,674);
        
        //TCatatan.setText(TCatatan); 
        TCatatan.setLineWrap(true);
        TCatatan.setWrapStyleWord(true);
    }

    //private DlgCariObatPenyakit dlgobtpny=new DlgCariObatPenyakit(null,false);
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        internalFrame1 = new widget.InternalFrame();
        FormInput = new widget.PanelBiasa();
        jLabel3 = new widget.Label();
        TNoRM = new widget.TextBox();
        TPasien = new widget.TextBox();
        jLabel9 = new widget.Label();
        Scroll3 = new widget.ScrollPane();
        TCatatan = new widget.TextArea();
        panelGlass8 = new widget.panelisi();
        BtnSimpan = new widget.Button();
        BtnHapus = new widget.Button();
        BtnEdit = new widget.Button();
        BtnKeluar = new widget.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        internalFrame1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 245, 235)), "::[ Catatan Untuk Pasien ]::", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(140,120,120))); // NOI18N
        internalFrame1.setName("internalFrame1"); // NOI18N
        internalFrame1.setLayout(new java.awt.BorderLayout(1, 1));

        FormInput.setName("FormInput"); // NOI18N
        FormInput.setPreferredSize(new java.awt.Dimension(865, 137));
        FormInput.setLayout(null);

        jLabel3.setText("No.R.M. :");
        jLabel3.setName("jLabel3"); // NOI18N
        FormInput.add(jLabel3);
        jLabel3.setBounds(0, 10, 65, 23);

        TNoRM.setEditable(false);
        TNoRM.setHighlighter(null);
        TNoRM.setName("TNoRM"); // NOI18N
        FormInput.add(TNoRM);
        TNoRM.setBounds(70, 10, 130, 23);

        TPasien.setEditable(false);
        TPasien.setHighlighter(null);
        TPasien.setName("TPasien"); // NOI18N
        TPasien.setPreferredSize(new java.awt.Dimension(25, 28));
        FormInput.add(TPasien);
        TPasien.setBounds(202, 10, 486, 23);

        jLabel9.setText("Catatan :");
        jLabel9.setName("jLabel9"); // NOI18N
        FormInput.add(jLabel9);
        jLabel9.setBounds(0, 40, 65, 23);

        Scroll3.setName("Scroll3"); // NOI18N
        Scroll3.setOpaque(true);

        TCatatan.setColumns(20);
        TCatatan.setRows(5);
        TCatatan.setName("TCatatan"); // NOI18N
        Scroll3.setViewportView(TCatatan);

        FormInput.add(Scroll3);
        Scroll3.setBounds(70, 40, 620, 200);

        internalFrame1.add(FormInput, java.awt.BorderLayout.CENTER);
        FormInput.getAccessibleContext().setAccessibleName("");
        FormInput.getAccessibleContext().setAccessibleDescription("");

        panelGlass8.setName("panelGlass8"); // NOI18N
        panelGlass8.setPreferredSize(new java.awt.Dimension(100, 56));
        panelGlass8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 9));

        BtnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/save-16x16.png"))); // NOI18N
        BtnSimpan.setMnemonic('S');
        BtnSimpan.setText("Simpan");
        BtnSimpan.setToolTipText("Alt+S");
        BtnSimpan.setName("BtnSimpan"); // NOI18N
        BtnSimpan.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });
        BtnSimpan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnSimpanKeyPressed(evt);
            }
        });
        panelGlass8.add(BtnSimpan);

        BtnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/stop_f2.png"))); // NOI18N
        BtnHapus.setMnemonic('H');
        BtnHapus.setText("Hapus");
        BtnHapus.setToolTipText("Alt+H");
        BtnHapus.setName("BtnHapus"); // NOI18N
        BtnHapus.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });
        BtnHapus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnHapusKeyPressed(evt);
            }
        });
        panelGlass8.add(BtnHapus);

        BtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/inventaris.png"))); // NOI18N
        BtnEdit.setMnemonic('G');
        BtnEdit.setText("Ganti");
        BtnEdit.setToolTipText("Alt+G");
        BtnEdit.setName("BtnEdit"); // NOI18N
        BtnEdit.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });
        BtnEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnEditKeyPressed(evt);
            }
        });
        panelGlass8.add(BtnEdit);

        BtnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/cross.png"))); // NOI18N
        BtnKeluar.setMnemonic('T');
        BtnKeluar.setText("Tutup");
        BtnKeluar.setToolTipText("Alt+T");
        BtnKeluar.setName("BtnKeluar"); // NOI18N
        BtnKeluar.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKeluarActionPerformed(evt);
            }
        });
        BtnKeluar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnKeluarKeyPressed(evt);
            }
        });
        panelGlass8.add(BtnKeluar);

        internalFrame1.add(panelGlass8, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(internalFrame1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        if(TNoRM.getText().trim().equals("")||TPasien.getText().trim().equals("")){
            Valid.textKosong(TNoRM,"No.Rekam Medis");
        }else if(TCatatan.getText().trim().equals("")){
            Valid.textKosong(TCatatan,"Catatan");
        }else{          
            Sequel.menyimpan3("catatan_pasien","?,?",2,new String[]{TNoRM.getText(),TCatatan.getText()},"no_rkm_medis=?","catatan=?",2,new String[]{TCatatan.getText(),TNoRM.getText()});
            BtnKeluarActionPerformed(evt);        
        }  
}//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnSimpanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnSimpanKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            BtnSimpanActionPerformed(null);
        }else{
            Valid.pindah(evt,TCatatan,BtnKeluar);
        }
}//GEN-LAST:event_BtnSimpanKeyPressed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
       Sequel.meghapus2("catatan_pasien","no_rkm_medis",TNoRM.getText());
       BtnKeluarActionPerformed(evt);       
}//GEN-LAST:event_BtnHapusActionPerformed

    private void BtnHapusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnHapusKeyPressed
        
}//GEN-LAST:event_BtnHapusKeyPressed

    private void BtnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKeluarActionPerformed
        dispose();
}//GEN-LAST:event_BtnKeluarActionPerformed

    private void BtnKeluarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnKeluarKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            dispose();
        }
}//GEN-LAST:event_BtnKeluarKeyPressed

private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
    if(TNoRM.getText().trim().equals("")||TPasien.getText().trim().equals("")){
        Valid.textKosong(TNoRM,"No.Rekam Medis");
    }else if(TCatatan.getText().trim().equals("")){
        Valid.textKosong(TCatatan,"Catatan");
    }else{  
        Sequel.mengedit2("catatan_pasien","no_rkm_medis=?","catatan=?",2,new String[]{
            TCatatan.getText(),TNoRM.getText()
        });
        BtnKeluarActionPerformed(evt);
    }
}//GEN-LAST:event_BtnEditActionPerformed

private void BtnEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnEditKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            BtnEditActionPerformed(null);
        }
}//GEN-LAST:event_BtnEditKeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        TCatatan.requestFocus();
    }//GEN-LAST:event_formWindowActivated

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            DlgCatatan dialog = new DlgCatatan(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widget.Button BtnEdit;
    private widget.Button BtnHapus;
    private widget.Button BtnKeluar;
    private widget.Button BtnSimpan;
    private widget.PanelBiasa FormInput;
    private widget.ScrollPane Scroll3;
    private widget.TextArea TCatatan;
    private widget.TextBox TNoRM;
    private widget.TextBox TPasien;
    private widget.InternalFrame internalFrame1;
    private widget.Label jLabel3;
    private widget.Label jLabel9;
    private widget.panelisi panelGlass8;
    // End of variables declaration//GEN-END:variables
    

    private void isPsien() {
        Sequel.cariIsi("select nm_pasien from pasien where no_rkm_medis=? ",TPasien,TNoRM.getText());
    }

    public void setNoRm(String norm) {
        TNoRM.setText(norm);  
        isPsien();   
        Sequel.cariIsi("select catatan from catatan_pasien where no_rkm_medis=?",TCatatan,TNoRM.getText());       
    }
    
    
    public void isCek(){
        BtnSimpan.setEnabled(true);
        BtnHapus.setEnabled(true);
        BtnEdit.setEnabled(true);
       
        
    }



}
