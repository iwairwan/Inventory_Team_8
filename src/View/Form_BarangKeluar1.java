/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

//import Config.Koneksi;
////import DAO.DAO_Barang;
//import DAO.DAO_DetBarangKeluar;
//import DAO.DAO_Laporan;
//import DAO.DAO_BarangKeluar;
//import DAO.DAO_SemBarangKeluar;
//import Model.Model_Barang;
//import Model.Model_DetBarangKeluar;
//import Model.Model_Distributor;
//import Model.Model_JenisBarang;
//import Model.Model_BarangKeluar;
////import Model.Model_Pengguna;
////import Model.Model_SemBarangKeluar;
////import Service.Service_Barang;
//import Service.Service_DetBarangKeluar;
//import Service.Service_Laporan;
//import Service.Service_BarangKeluar;
//import Service.Service_SemBarangKeluar;
////import TableModel.TblMod_Barang;
//import TableModel.TblMod_BarangKeluar;
//import TableModel.TblMod_DetBarangKeluar;
//import TableModel.TblMod_SemBarangKeluar;
////import java.awt.Color;
////import java.awt.Font;
////import java.awt.event.KeyEvent;
//import java.sql.Connection;
//import java.text.SimpleDateFormat;
//import java.util.HashMap;
import java.util.List;
//import javax.swing.JOptionPane;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author RavenPC
 */
public class Form_BarangKeluar1 extends javax.swing.JPanel {
    
//    private Connection conn;

//    private Service_BarangKeluar servis_keluar = new DAO_BarangKeluar();
//    private Service_DetBarangKeluar servis_detkeluar = new DAO_DetBarangKeluar();
//    
//    private TblMod_BarangKeluar tblModel_keluar = new TblMod_BarangKeluar();
//    private TblMod_DetBarangKeluar tblModel_detkeluar = new TblMod_DetBarangKeluar();
//    
//    private Service_SemBarangKeluar servis = new DAO_SemBarangKeluar();
//    private TblMod_SemBarangKeluar tblModel = new TblMod_SemBarangKeluar();
//    
//    private Service_Laporan servis_lap = new DAO_Laporan();
//    
    public Form_BarangKeluar1(String Id) {
        initComponents();
        
//        conn = Koneksi.getConnection();
        
        //Pengaturan Tabel BarangKeluar
//        tbl_keluar.setModel(tblModel_keluar);
        
//        tbl_keluar.getTableHeader().setFont(new Font ("Segoe UI", Font.BOLD, 12));
//        tbl_keluar.getTableHeader().setOpaque(false);
//        tbl_keluar.getTableHeader().setBackground(new Color(0,48,88));
//        tbl_keluar.getTableHeader().setForeground(new Color(255,255,255));
//        tbl_keluar.setRowHeight(27);
        
        //Pengaturan Tabel Sementara
//        tbl_sementara.setModel(tblModel);
//        tbl_sementara.getTableHeader().setFont(new Font ("Segoe UI", Font.BOLD, 12));
//        tbl_sementara.getTableHeader().setOpaque(false);
//        tbl_sementara.getTableHeader().setBackground(new Color(0,48,88));
//        tbl_sementara.getTableHeader().setForeground(new Color(255,255,255));
//        tbl_sementara.setRowHeight(27);
        
        lb_id.setText(Id);
        //setLocationRelativeTo(null);
//        tbl_sementara.setModel(tblModel);
//        tbl_keluar.setModel(tblModel_keluar);
//        tbl_detail.setModel(tblModel_detkeluar);
//        loadData();
//        loadDataSementara();
//        //tbl_barang2.setModel(tblModel);
//        //loadData();
//        pn_detail.setVisible(false);
//        resetForm();
//        nonAktif();
    }
    
       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        dataBarangKeluar = new javax.swing.JPanel();
        lb_id = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        dataBarangKeluar.setBackground(new java.awt.Color(255, 255, 255));
        dataBarangKeluar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new java.awt.Color(0, 48, 88)));
        dataBarangKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataBarangKeluarMouseClicked(evt);
            }
        });

        lb_id.setText("lb_id");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 48, 88));
        jLabel2.setText("Modul STOKOPNAME BARANG - Under Construction");

        javax.swing.GroupLayout dataBarangKeluarLayout = new javax.swing.GroupLayout(dataBarangKeluar);
        dataBarangKeluar.setLayout(dataBarangKeluarLayout);
        dataBarangKeluarLayout.setHorizontalGroup(
            dataBarangKeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarangKeluarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_id, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataBarangKeluarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 567, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(649, 649, 649))
        );
        dataBarangKeluarLayout.setVerticalGroup(
            dataBarangKeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarangKeluarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_id)
                .addGroup(dataBarangKeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataBarangKeluarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(dataBarangKeluarLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2)))
                .addContainerGap(672, Short.MAX_VALUE))
        );

        mainPanel.add(dataBarangKeluar, "card2");

        add(mainPanel, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void dataBarangKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataBarangKeluarMouseClicked
        tampilPanel();
        loadData();
        resetForm();
    }//GEN-LAST:event_dataBarangKeluarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dataBarangKeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lb_id;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        //bt_hapusdata.setVisible(false);
        
//        List<Model_BarangKeluar> list = servis_keluar.getData();
//        tblModel_keluar.setData(list);
    }

    private void pencarian() {
//        List<Model_BarangKeluar> list = servis_keluar.pencarian(t_cari.getText());
//        tblModel_keluar.setData(list);
    }
    
    

    private void resetForm() {
//        t_no.setText("");
//        t_tanggal.setText("");
//        t_kodbar.setText("");
//        t_nambar.setText("");
//        t_satuan.setText("");
//        t_harbar.setText("");
//        t_jumbar.setText("");
//        t_subtotal.setText("");
//        lb_tobar.setText("");

    }
    
    private void nonAktif(){
//        t_no.setEnabled(false);
    }
    
    private void aktif(){
    }

    private void perbaruiData() {
//        int index = tbl_sementara.getSelectedRow();
//        if (index!=-1) {
//            Model_SemBarangKeluar modsem = tblModel.getData(tbl_sementara.convertRowIndexToModel(index));
//             
//            String kode_barang  = t_kodbar.getText();
//            String nama_barang  = t_nambar.getText();
//            Long harga          = Long.parseLong(t_harbar.getText());
//            int jumlah          = Integer.parseInt(t_jumbar.getText());
//            Long subtotal       = Long.parseLong(t_subtotal.getText());
//                    
//            Model_SemBarangKeluar smt = new Model_SemBarangKeluar();
//            Model_Barang brg = new Model_Barang();
//            Model_DetBarangKeluar det_keluar = new Model_DetBarangKeluar();
//            
//            brg.setKode_barang(kode_barang);
//            brg.setNama_barang(nama_barang);
//            //brg.setSatuan(satuan);
//            brg.setHarga(harga);
//            det_keluar.setJml_keluar(jumlah);
//            det_keluar.setSubtotal_keluar(subtotal);
//            
//            smt.setMdl_barang(brg);
//            smt.setMdl_detkeluar(det_keluar);
//                
//            servis.perbaruiData(smt);
//            tblModel.perbaruiData(index, smt);
//            loadDataSementara();
//            bersihBarang();
//        }else{
//            JOptionPane.showMessageDialog(null, "Pilih dahulu record yang akan diperbarui");
//        }    
//        
    }

    private void tampilPanel(){
        mainPanel.removeAll();
        String Id = lb_id.getText();
        mainPanel.add(new Form_BarangKeluar1(Id));
        mainPanel.repaint();
        mainPanel.revalidate();
    }

//    private void hapusDataSementara() {
//        int index = tbl_sementara.getSelectedRow();
//        if (index!=-1) {
//            Model_SemBarangKeluar smt = tblModel.getData(tbl_sementara.convertRowIndexToModel(index));
//            if (JOptionPane.showConfirmDialog(null, "Yakin data akan dihapus?","Konfirmasi", JOptionPane.OK_CANCEL_OPTION)== JOptionPane.OK_OPTION) {
//                servis.hapusData(smt);
//                tblModel.hapusData(index);
//                loadDataSementara();
//                
//            }
//        }else{
//            JOptionPane.showMessageDialog(null, "Pilih dahulu record yang akan diupdate");
//        
//        }
//    }
//    
//    private void tambahData(){
//        String no   = t_no.getText();
//            
//        Model_BarangKeluar keluar = new Model_BarangKeluar();    
//        keluar.setNo_keluar(no);
//        
//        t_no.setText(servis_keluar.nomor());
//        setTanggal();
//    }
//    void setTanggal(){
//        java.util.Date sekarang = new java.util.Date();
//        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("yyyy-MM-dd");
//        t_tanggal.setText(kal.format(sekarang));
//    }
//
//    
//    private void loadDataSementara() {
//        List<Model_SemBarangKeluar> list = servis.getData();
//        tblModel.setData(list);
//    }
//
//    private void bersihBarang() {
//        t_kodbar.setText("");
//        t_nambar.setText("");
//        t_satuan.setText("");
//        t_harbar.setText("");
//        t_jumbar.setText("");
//        t_stok.setText("");
//        t_subtotal.setText("");
//    }
//
//    private void simpanData() {
//        String no_keluar = t_no.getText();
//        String tgl_keluar = t_tanggal.getText();
//        String kode = t_kodbar.getText();
//        String nama = t_nambar.getText();
//        String id_peng = lb_id.getText();
//        Long total      = Long.parseLong(lb_tobar.getText());
//        
//        Model_Barang brg = new Model_Barang();
//        Model_Pengguna pgn = new Model_Pengguna();
//        Model_DetBarangKeluar det_keluar = new Model_DetBarangKeluar();
//        Model_BarangKeluar keluar = new Model_BarangKeluar();
//        
//        // Simpan Tabel BarangKeluar
//        keluar.setNo_keluar(no_keluar);
//        keluar.setTgl_keluar(tgl_keluar);
//        keluar.setTotal_keluar(total);
//        pgn.setId_pengguna(id_peng);
//        
//        keluar.setMdl_peng(pgn);
//        
//        // Simpan Tabel Detail Barang Keluar
//        det_keluar.setMdl_keluar(keluar);
//        det_keluar.setMdl_barang(brg);
//        
//        servis_keluar.tambahData(keluar);
//        servis_detkeluar.tambahData(det_keluar);
//        servis_detkeluar.hapusSementara(det_keluar);
//        tblModel_keluar.tambahData(keluar);
//        
//        //tampilPanel();
//    }

    
}
