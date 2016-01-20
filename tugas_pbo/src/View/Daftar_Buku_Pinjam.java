/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

/**
 *
 * @author Rian
 */
public class Daftar_Buku_Pinjam extends javax.swing.JFrame {
    private DefaultTableModel Tampil;

    /**
     * Creates new form Daftar_Buku
     */
    public Daftar_Buku_Pinjam() {
        initComponents();
    }
    
    public void tampil_pinjam(){
    Object[] tampilpem = {"Id Pinjam","No. Anggota","Nama","Id Buku","Judul","Tgl Pinjam","Tgl Kembali"};
     Tampil= new DefaultTableModel(new Object [][]{}, tampilpem){boolean[] canEdit=new boolean[]{false,false,false,false,false,false,false};
            @Override
                public boolean isCellEditable(int rowIndex, int columnIndex){return canEdit[columnIndex];
                }
        };
        tbl_pinjam.setModel(Tampil);
    try {Statement stat1 = (Statement) koneksi.ayokonek().createStatement();
        ResultSet rs = stat1.executeQuery("select * from pinjam,buku,anggota where pinjam.no_anggota=anggota.no_anggota and pinjam.id_buku=buku.id_buku and pinjam.status=1");
                    
                    while (rs.next()) {
                        String id_pinjam = rs.getString("pinjam.id_pinjam");
                        String noanggota = rs.getString("pinjam.no_anggota");
                        String nama = rs.getString("anggota.nama");                        
                        String idbuku = rs.getString("pinjam.id_buku");                    
                        String judul = rs.getString("buku.judul");                    
                        String tgl_pinjam = rs.getString("pinjam.tgl_pinjam");                    
                        String tgl_kembali = rs.getString("pinjam.tgl_kembali");
                        
                        String[] dataField1 = {id_pinjam,noanggota,nama,idbuku,judul,tgl_pinjam,tgl_kembali};
                        Tampil.addRow(dataField1);
                    }
    } catch (Exception e) {
         JOptionPane.showMessageDialog(this,"kesalahan:>>"+ e);
    }
    }
    
    public void cari(){
    Object[] tampilpem = {"Id Pinjam","No. Anggota","Nama","Id Buku","Judul","Tgl Pinjam","Tgl Kembali"};
     Tampil= new DefaultTableModel(new Object [][]{}, tampilpem){boolean[] canEdit=new boolean[]{false,false,false,false,false,false,false};
            @Override
                public boolean isCellEditable(int rowIndex, int columnIndex){return canEdit[columnIndex];
                }
        };
        tbl_pinjam.setModel(Tampil);
    try {Statement stat1 = (Statement) koneksi.ayokonek().createStatement();
        ResultSet rs = stat1.executeQuery("select * from pinjam,buku,anggota where pinjam.no_anggota=anggota.no_anggota and pinjam.id_buku=buku.id_buku and pinjam.status=1 and pinjam.id_pinjam like '%"+txt_cari.getText()+"%'");
                    
                    while (rs.next()) {
                        String id_pinjam = rs.getString("pinjam.id_pinjam");
                        String noanggota = rs.getString("pinjam.no_anggota");
                        String nama = rs.getString("anggota.nama");                        
                        String idbuku = rs.getString("pinjam.id_buku");                    
                        String judul = rs.getString("buku.judul");                    
                        String tgl_pinjam = rs.getString("pinjam.tgl_pinjam");                    
                        String tgl_kembali = rs.getString("pinjam.tgl_kembali");
                        
                        String[] dataField1 = {id_pinjam,noanggota,nama,idbuku,judul,tgl_pinjam,tgl_kembali};
                        Tampil.addRow(dataField1);
                    }
    } catch (Exception e) {
         JOptionPane.showMessageDialog(this,"kesalahan:>>"+ e);
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_cari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_pinjam = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("KEMBALI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Id Pinjam");

        txt_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cariKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cariKeyReleased(evt);
            }
        });

        tbl_pinjam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbl_pinjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Kode", "Judul", "Peminjaman", "No. Anggota", "Tgl.Pinjam", "Jadwal Kembali"
            }
        ));
        jScrollPane1.setViewportView(tbl_pinjam);
        tbl_pinjam.getColumnModel().getColumn(0).setHeaderValue("No");
        tbl_pinjam.getColumnModel().getColumn(1).setHeaderValue("Kode");
        tbl_pinjam.getColumnModel().getColumn(2).setHeaderValue("Judul");
        tbl_pinjam.getColumnModel().getColumn(3).setHeaderValue("Peminjaman");
        tbl_pinjam.getColumnModel().getColumn(4).setHeaderValue("No. Anggota");
        tbl_pinjam.getColumnModel().getColumn(5).setHeaderValue("Tgl.Pinjam");
        tbl_pinjam.getColumnModel().getColumn(6).setHeaderValue("Jadwal Kembali");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 611, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_cariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariKeyPressed
        // TODO add your handling code here:
        cari();
    }//GEN-LAST:event_txt_cariKeyPressed

    private void txt_cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariKeyReleased
        // TODO add your handling code here:
        cari();
    }//GEN-LAST:event_txt_cariKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        tampil_pinjam();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Daftar_Buku_Pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Daftar_Buku_Pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Daftar_Buku_Pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Daftar_Buku_Pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Daftar_Buku_Pinjam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_pinjam;
    private javax.swing.JTextField txt_cari;
    // End of variables declaration//GEN-END:variables
}