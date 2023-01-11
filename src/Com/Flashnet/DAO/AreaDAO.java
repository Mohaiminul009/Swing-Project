package Com.Flashnet.DAO;

import Com.Flashnet.Common.IcommonDAO;
import Com.Flashnet.Model.Area;
import Com.Flashnet.Model.CreateCustomer;
import Com.Flashnet.Util.DBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AreaDAO implements IcommonDAO<Area>{

    @Override
    public int save(Area a) {
        int status = 0;
        String sql = "INSERT INTO area (area_id, area_name, sub_area, con_type) VALUES (?, ?, ?, ?)";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, a.getAreaId());
            pst.setString(2, a.getAreaName());
            pst.setString(3, a.getSubAreaName());
            pst.setString(4, a.getConnectionType());
            status = pst.executeUpdate();
        } catch (Exception e) {
        }
        return status;
    }

    @Override
    public List<Area> get() {
        List<Area> ar = new ArrayList<>();
        String sql = "SELECT * FROM area";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Area a = new Area();
                a.setAreaId(rs.getString("area_id"));
                a.setAreaName(rs.getString("area_name"));
                a.setSubAreaName(rs.getString("sub_area"));
                a.setConnectionType(rs.getString("con_type"));
                ar.add(a);
            }
        } catch (Exception e) {
        } finally {
            try {
                con.close();
            } catch (Exception e) {
            }
        }
        return ar;
    }

    @Override
    public int delete(String code) {
        int status = 0;
        String sql = "DELETE FROM area WHERE area_id = ?";
        try {

            int deleteStatus = JOptionPane.showConfirmDialog(null, "Do you want to delete the area " + code + " ?");
            if (deleteStatus == 0) {
                Connection con = DBC.getDB();
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, code);
                status = pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "The area has been deleted!");
            }
            System.out.println(deleteStatus);
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
}
