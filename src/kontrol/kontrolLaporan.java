/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kontrol;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Lenovo
 */
public class kontrolLaporan extends koneksi {
    public kontrolLaporan() {
        setkonek();
    }
    
    public ResultSet tampilidtrans(String id) throws SQLException {
        String sql = "SELECT id_transaksi From transaksi WHERE id_order = '"+id+"'";
        st.executeQuery(sql);    
        return rs;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
