package Com.Flashnet.DAO;

import Com.Flashnet.Common.IcommonDAO;
import Com.Flashnet.Model.ConnectioN;
import Com.Flashnet.Util.DBC;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.List;

public class ConnectionDAO implements IcommonDAO<ConnectioN> {

    @Override
    public int save(ConnectioN cn) {
        int status = 0;
        String sql = "INSERT INTO connection (cust_id, pack_id, start_date, end_date, renew_type, active_status) VALUES (?, ?, ?, ?, ?, ?)";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cn.getcId());
            pst.setString(2, cn.getcPackId());
            pst.setString(3, cn.getcStartDate());
            pst.setString(4, cn.getcEndDate());
            pst.setString(5, cn.getcRenewType());
            pst.setString(6, cn.getcActiveStatus());
            status = pst.executeUpdate();
        } catch (Exception e) {
        }
        return status;
    }

    @Override
    public List<ConnectioN> get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
