package DAO;

import Config.Koneksi;
import Model.Model_Distributor;
import Model.Model_Pemesanan;
import Model.Model_JenisBarang;
import Model.Model_Pemesanan;
import Model.Model_Pengguna;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Service.Service_Barang;
import Service.Service_Pemesanan;
import Service.Service_Percobaan;
import javax.swing.JOptionPane;

public class DAO_Percobaan implements Service_Percobaan{

    private Connection connection;
    
    public DAO_Percobaan(){
        connection = Koneksi.getConnection();
    }
    
    @Override
    public String nomor() {
        PreparedStatement st = null;
        ResultSet rs = null;
        String urutan = null;
        
        String sql = "SELECT RIGHT (no_pesan,3)+1 AS Nomor FROM pemesanan ORDER BY Nomor desc";
        try{
            st = connection.prepareStatement(sql);
            rs= st.executeQuery();
            if(rs.next()){
                urutan=rs.getString(1);
                while (urutan.length()<3)
                   urutan="0"+urutan;
                   urutan =urutan;
                }else{
                    urutan ="001";
                }
            }catch (SQLException ex) {
                java.util.logging.Logger.getLogger(DAO_Percobaan.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                if (st!=null) {
                    try {
                        st.close();
                    } catch (SQLException ex) {
                        java.util.logging.Logger.getLogger(DAO_Percobaan.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                }
            }
        return urutan;
    }

    
    
}