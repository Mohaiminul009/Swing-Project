package Com.Flashnet.DAO;

import Com.Flashnet.Common.IcommonDAO;
import Com.Flashnet.Model.CreateCustomer;
import Com.Flashnet.Model.Packages;
import Com.Flashnet.Util.DBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CreateCustomerDAO implements IcommonDAO<CreateCustomer>{

    @Override
    public int save(CreateCustomer cc) {
        int status = 0;
        String sql = "INSERT INTO create_customer (cust_id, cust_name, cust_phone, cust_email, installation_date, area_name, cust_address, pack_id, sub_area, pack_cost) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cc.getCustomerId());
            pst.setString(2, cc.getCustomerName());
            pst.setString(3, cc.getCustomerPhone());
            pst.setString(4, cc.getCustomerEmail());
            pst.setString(5, cc.getInstallationDate());
            pst.setString(6, cc.getCustomerAreaName());
            pst.setString(7, cc.getCustomerAddress());
            pst.setString(8, cc.getCustomerPackageId());
            pst.setString(9, cc.getCustomerSubAreaName());
            pst.setDouble(10, cc.getCustomerPackCost());
            status = pst.executeUpdate();
        } catch (Exception e) {
        }
        return status;
    }

    @Override
    public List<CreateCustomer> get() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
