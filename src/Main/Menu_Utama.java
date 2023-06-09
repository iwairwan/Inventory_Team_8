/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;



import View.Form_BarangKeluar;
import View.Form_BarangKeluar1;
import View.Form_BarangKeluar2;
import View.Form_BarangKeluar3;
import View.Form_BarangKeluar4;
import View.Form_BarangMasuk;
import View.Form_Home;
import View.Form_LaporanBarangKeluar;
import View.Form_LaporanBarangMasuk;
import View.Form_LaporanDataBarang;
import View.Form_LaporanDataPengguna;
import View.Form_LaporanDataDistributor;
import View.Form_LaporanPemesanan;
import View.Form_Login;
import View.Form_Pemesanan;
import View.Master_Barang;
import View.Master_Distributor;
import View.Master_JenisBarang;
import View.Master_Pengguna;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import menu.MenuItem;


/**
 *
 * @author RavenPC
 */
public class Menu_Utama extends javax.swing.JFrame {

    
    
    public Menu_Utama(String Id, String Nama, String Level2) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        lb_id.setText(Id);
        lb_nama.setText(Nama);
        lb_level.setText(Level2);
        
        execute(Level2);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        lb_id = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lb_nama = new javax.swing.JLabel();
        lb_level = new javax.swing.JLabel();
        lb_iconAdmin = new javax.swing.JLabel();
        lb_iconStaff = new javax.swing.JLabel();
        panelBody = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Inventory Toko Bangunan Mega Super");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(18, 61, 70));

        kGradientPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 140, 255));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Logo Toko Bangunan Mega Super Putih menu.png"))); // NOI18N

        lb_id.setBackground(new java.awt.Color(0, 140, 255));
        lb_id.setFont(new java.awt.Font("Square721 BT", 0, 14)); // NOI18N
        lb_id.setForeground(new java.awt.Color(0, 140, 255));
        lb_id.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_id.setText("ID");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 383, Short.MAX_VALUE)
                .addComponent(lb_id, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lb_id, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));
        panelMenu.setPreferredSize(new java.awt.Dimension(300, 384));

        jScrollPane1.setBorder(null);

        menus.setBackground(new java.awt.Color(255, 255, 255));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_nama.setFont(new java.awt.Font("Square721 BT", 0, 14)); // NOI18N
        lb_nama.setForeground(new java.awt.Color(0, 48, 88));
        lb_nama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nama.setText("Nama Pengguna");
        jPanel3.add(lb_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 97, 210, -1));

        lb_level.setFont(new java.awt.Font("Square721 BT", 2, 14)); // NOI18N
        lb_level.setForeground(new java.awt.Color(0, 48, 88));
        lb_level.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_level.setText("Level");
        jPanel3.add(lb_level, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 210, -1));

        lb_iconAdmin.setFont(new java.awt.Font("Square721 BT", 0, 14)); // NOI18N
        lb_iconAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lb_iconAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_iconAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8_User_75px_1.png"))); // NOI18N
        jPanel3.add(lb_iconAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 220, -1));

        lb_iconStaff.setFont(new java.awt.Font("Square721 BT", 0, 14)); // NOI18N
        lb_iconStaff.setForeground(new java.awt.Color(255, 255, 255));
        lb_iconStaff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_iconStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8_Worker_75px.png"))); // NOI18N
        jPanel3.add(lb_iconStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 220, -1));

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
        );

        getContentPane().add(panelMenu, java.awt.BorderLayout.LINE_START);

        panelBody.setBackground(new java.awt.Color(204, 204, 204));
        panelBody.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );
        panelBodyLayout.setVerticalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
        );

        getContentPane().add(panelBody, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(871, 473));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String Ide = lb_id.getText();
        String Nm = lb_nama.getText();
        jPanel2.add(new Form_Home(Ide,Nm));
        jPanel2.repaint();
        jPanel2.revalidate();

        
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Utama("ID","Nama","Level").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lb_iconAdmin;
    private javax.swing.JLabel lb_iconStaff;
    private javax.swing.JLabel lb_id;
    private javax.swing.JLabel lb_level;
    private javax.swing.JLabel lb_nama;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables

    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        menus.revalidate();
    }
    
    private void execute(String Level2) {
        //  icon Master
        ImageIcon iconMaster        = new ImageIcon(getClass().getResource("/menu/mas_Master.png"));
        ImageIcon iconSubMenuBrg    = new ImageIcon(getClass().getResource("/menu/mas_Barang.png"));
        ImageIcon iconSubMenuJnsBrg = new ImageIcon(getClass().getResource("/menu/mas_Jenis.png"));
        ImageIcon iconSubMenuDst    = new ImageIcon(getClass().getResource("/menu/mas_Distributor.png"));
        ImageIcon iconSubMenuPgn    = new ImageIcon(getClass().getResource("/menu/mas_Pengguna.png"));
        
        //  icon Transaksi
        ImageIcon iconTransaksi     = new ImageIcon(getClass().getResource("/menu/trans_Transaksi.png"));
        ImageIcon iconSubMenuPesan  = new ImageIcon(getClass().getResource("/menu/trans_Pesan.png"));
        ImageIcon iconSubMenuMasuk  = new ImageIcon(getClass().getResource("/menu/trans_Masuk.png"));
        ImageIcon iconSubMenuKeluar = new ImageIcon(getClass().getResource("/menu/trans_Keluar.png"));
        ImageIcon iconSubMenuRetur = new ImageIcon(getClass().getResource("/menu/trans_Keluar.png"));
        ImageIcon iconSubMenuStokopname  = new ImageIcon(getClass().getResource("/menu/trans_Pesan.png"));
                
        ImageIcon iconStaff         = new ImageIcon(getClass().getResource("/menu/user.png"));
        ImageIcon iconSetting       = new ImageIcon(getClass().getResource("/menu/setting.png"));
        ImageIcon iconDatabase      = new ImageIcon(getClass().getResource("/menu/database.png"));
        ImageIcon iconMessage       = new ImageIcon(getClass().getResource("/menu/message.png"));
        
        ImageIcon iconHome          = new ImageIcon(getClass().getResource("/menu/Beranda.png"));
        ImageIcon iconLogout        = new ImageIcon(getClass().getResource("/menu/keluar.png"));
        
        ImageIcon iconNext          = new ImageIcon(getClass().getResource("/menu/next.png"));
              
        //  Master Barang
        MenuItem masBarang = new MenuItem(null, true, iconSubMenuBrg, "Barang", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jPanel2.removeAll();
                String Id = lb_id.getText();
                jPanel2.add(new Master_Barang());
                jPanel2.repaint();
                jPanel2.revalidate();
            }
        });
        
        //  Master Jenis Barang
//        MenuItem masJenis = new MenuItem(null, true, iconSubMenuJnsBrg, "Jenis Barang", new ActionListener() {
        MenuItem masJenis = new MenuItem(null, true, iconSubMenuJnsBrg, "Kategori", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jPanel2.removeAll();
                String Id = lb_id.getText();
                jPanel2.add(new Master_JenisBarang());
                jPanel2.repaint();
                jPanel2.revalidate();
            }
        });
        
        //  Master Distributor
        MenuItem masDistributor = new MenuItem(null, true, iconSubMenuDst, "Distributor", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel2.removeAll();
                String Id = lb_id.getText();
                jPanel2.add(new Master_Distributor());
                jPanel2.repaint();
                jPanel2.revalidate();
            }
        });
        
        //  Master Pengguna
        MenuItem masPengguna = new MenuItem(null, true, iconSubMenuPgn, "Pengguna", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel2.removeAll();
                String Id = lb_id.getText();
                jPanel2.add(new Master_Pengguna());
                jPanel2.repaint();
                jPanel2.revalidate();
            }
        });
        
        //  Transaksi Pemesanan Barang 
        MenuItem transPemesanan = new MenuItem(null, true, iconSubMenuPesan, "Pemesanan Barang", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel2.removeAll();
                String Id = lb_id.getText();
                jPanel2.add(new Form_Pemesanan(Id));
                jPanel2.repaint();
                jPanel2.revalidate();
            }
        });
        
        //  Transaksi Barang Masuk 
        MenuItem transBarangMasuk = new MenuItem(null, true, iconSubMenuMasuk, "Barang Masuk", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel2.removeAll();
                String Id = lb_id.getText();
                jPanel2.add(new Form_BarangMasuk(Id));
                jPanel2.repaint();
                jPanel2.revalidate();
            }
        });
        
        //  Transaksi Barang Keluar
        MenuItem transBarangKeluar = new MenuItem(null, true, iconSubMenuKeluar, "Barang Keluar", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel2.removeAll();
                String Id = lb_id.getText();
                jPanel2.add(new Form_BarangKeluar(Id));
                jPanel2.repaint();
                jPanel2.revalidate();
            }
        });

        //  modive by: irwan ==> Transaksi Barang Retur
        MenuItem transBarangRetur = new MenuItem(null, true, iconSubMenuRetur, "Retur Barang", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel2.removeAll();
                String Id = lb_id.getText();
                jPanel2.add(new Form_BarangKeluar2(Id));
                jPanel2.repaint();
                jPanel2.revalidate();
            }
        });

        //  modive by: irwan ==> Transaksi Stokopname Barang 
        MenuItem transStokopname = new MenuItem(null, true, iconSubMenuStokopname, "Stokopname Barang", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel2.removeAll();
                String Id = lb_id.getText();
                jPanel2.add(new Form_BarangKeluar1(Id));
                jPanel2.repaint();
                jPanel2.revalidate();
            }
        });        
        

        //  Laporan Stok Barang
        MenuItem lapStokBarang = new MenuItem(null, true, iconSubMenuBrg, "Lap. Stok Barang", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel2.removeAll();
                String Id = lb_id.getText();
                jPanel2.add(new Form_LaporanDataBarang(Id));
                jPanel2.repaint();
                jPanel2.revalidate();
            }
        });
        
        //  Laporan Pemesanan Barang
        MenuItem lapPemesananBarang = new MenuItem(null, true, iconSubMenuPesan, "Pemesanan Barang", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel2.removeAll();
                String Id = lb_id.getText();
                jPanel2.add(new Form_LaporanPemesanan(Id));
                jPanel2.repaint();
                jPanel2.revalidate();
            }
        });
        
        //  Laporan Barang Masuk
        MenuItem lapBarangMasuk = new MenuItem(null, true, iconSubMenuMasuk, "Lap. Barang Masuk", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel2.removeAll();
                String Id = lb_id.getText();
                jPanel2.add(new Form_LaporanBarangMasuk(Id));
                jPanel2.repaint();
                jPanel2.revalidate();
            }
        });
        
        //  Laporan Barang Keluar
        MenuItem lapBarangKeluar = new MenuItem(null, true, iconSubMenuKeluar, "Lap. Barang Keluar", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel2.removeAll();
                String Id = lb_id.getText();
                jPanel2.add(new Form_LaporanBarangKeluar(Id));
                jPanel2.repaint();
                jPanel2.revalidate();
            }
        });

        //  modive by: irwan ==> Laporan Retur Barang
        MenuItem lapBarangRetur = new MenuItem(null, true, iconSubMenuKeluar, "Retur Barang", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel2.removeAll();
                String Id = lb_id.getText();
                jPanel2.add(new Form_BarangKeluar3(Id));
                jPanel2.repaint();
                jPanel2.revalidate();
            }
        });

        //  start modive by: irwan ==> Laporan Stokopname Barang
        MenuItem lapBarangStokopname = new MenuItem(null, true, iconSubMenuKeluar, "Stokopaname Barang", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel2.removeAll();
                String Id = lb_id.getText();
                jPanel2.add(new Form_BarangKeluar4(Id));
                jPanel2.repaint();
                jPanel2.revalidate();
            }
        });
        




        //  start modive by: irwan ==> Laporan Pengguna
        MenuItem lapPengguna = new MenuItem(null, true, iconSubMenuPgn, "Lap. Pengguna", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel2.removeAll();
                String Id = lb_id.getText();
                jPanel2.add(new Form_LaporanDataPengguna(Id));
                jPanel2.repaint();
                jPanel2.revalidate();
            }
        });

        //  start modive by: irwan ==> Laporan Distributor
        MenuItem lapDistributor = new MenuItem(null, true, iconSubMenuDst, "Lap. Distributor", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel2.removeAll();
                String Id = lb_id.getText();
                jPanel2.add(new Form_LaporanDataDistributor(Id));
                jPanel2.repaint();
                jPanel2.revalidate();
            }
        });
        
        //Menu utama
        MenuItem menuHome = new MenuItem(iconHome, false, null, "Home", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel2.removeAll();
                String Ide = lb_id.getText();
                String Nm = lb_nama.getText();
                jPanel2.add(new Form_Home(Ide,Nm));
                jPanel2.repaint();
                jPanel2.revalidate();
            }
        });
        
        //Logout
        MenuItem menuLogin = new MenuItem(iconLogout, false, null, "Keluar", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Form_Login().show();
                dispose();
            }
        });
        MenuItem menuMaster      = new MenuItem(iconMaster, false, null, "Master", null, masBarang, masJenis, masDistributor, masPengguna, transBarangMasuk, transBarangKeluar);
//        MenuItem menuTransaksi   = new MenuItem(iconTransaksi, false, null, "Transaksi", null, transPemesanan, transBarangMasuk, transBarangKeluar, transBarangRetur, transStokopname);
//        MenuItem menuLaporan     = new MenuItem(iconDatabase, false, null, "Laporan", null, lapStokBarang, lapPemesananBarang, lapBarangMasuk, lapBarangKeluar, lapBarangRetur, lapBarangStokopname);
        MenuItem menuLaporan     = new MenuItem(iconDatabase, false, null, "Laporan", null, lapStokBarang, lapBarangMasuk, lapBarangKeluar, lapPengguna, lapDistributor);
        
        if (Level2.equals("Owner")) {
//            addMenu(menuHome, menuMaster, menuTransaksi, menuLaporan, menuLogin);
            addMenu(menuHome, menuMaster, menuLaporan, menuLogin);            
            this.lb_iconAdmin.setVisible(true);
        }else{
//            addMenu(menuHome, menuTransaksi, menuLaporan, menuLogin);
            addMenu(menuHome, menuLaporan, menuLogin);            
            this.lb_iconStaff.setVisible(true);
            this.lb_iconAdmin.setVisible(false);
        }
        
    }
        
    
    
    
}
