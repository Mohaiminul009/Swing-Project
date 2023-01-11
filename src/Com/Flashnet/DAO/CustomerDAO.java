package Com.Flashnet.DAO;

import Com.Flashnet.Common.IcommonDAO;
import Com.Flashnet.Model.Customer;
import Com.Flashnet.Util.DBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class CustomerDAO implements IcommonDAO<Customer>{

    @Override
    public int save(Customer c) {
        int status = 0;
        String sql = "INSERT INTO customer (cust_id, cust_name, cust_phone, cust_email, area_name, sub_area, cust_address, pack_id, pack_name, pack_cost, bandwidth, pack_duration, con_type, installation_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, c.getCUSTid());
            pst.setString(2, c.getCUSTname());
            pst.setString(3, c.getCUSTphone());
            pst.setString(4, c.getCUSTemail());
            pst.setString(5, c.getCUSTareaname());
            pst.setString(6, c.getCUSTsubarea());
            pst.setString(7, c.getCUSTaddress());
            pst.setString(8, c.getCUSTpackid());
            pst.setString(9, c.getCUSTpackname());
            pst.setDouble(10, c.getCUSTpackcost());
            pst.setString(11, c.getCUSTbandwidth());
            pst.setInt(12, c.getCUSTpackduration());
            pst.setString(13, c.getCUSTcontype());
            pst.setString(14, c.getCUSTinstallationdate());
            status = pst.executeUpdate();
        } catch (Exception e) {
        }
        return status;
    }

    @Override
    public List<Customer> get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
