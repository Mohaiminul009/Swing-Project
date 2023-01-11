package Com.Flashnet.DAO;

import Com.Flashnet.Common.IcommonDAO;
import Com.Flashnet.Model.Packages;
import Com.Flashnet.Util.DBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PackagesDAO implements IcommonDAO<Packages>{

    @Override
    public int save(Packages p) {
        int status = 0;
        String sql = "INSERT INTO packages (pack_id, pack_name, bandwidth, pack_cost, pack_duration) VALUES (?, ?, ?, ?, ?)";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, p.getPackageId());
            pst.setString(2, p.getPackageName());
            pst.setString(3, p.getBandwidth());
            pst.setDouble(4, p.getPackageCost());
            pst.setInt(5, p.getDuration());
            status = pst.executeUpdate();
        } catch (Exception e) {
        }
        return status;
    }

    @Override
    public List<Packages> get() {
        List<Packages> packs = new ArrayList<>();
        String sql = "SELECT * FROM packages";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Packages pack = new Packages();
                pack.setPackageId(rs.getString("pack_id"));
                pack.setPackageName(rs.getString("pack_name"));
                pack.setBandwidth(rs.getString("bandwidth"));
                pack.setPackageCost(rs.getDouble("pack_cost"));
                pack.setDuration(rs.getInt("pack_duration"));
                packs.add(pack);
            }
        } catch (Exception e) {
        } finally {
            try {
                con.close();
            } catch (Exception e) {
            }
        }
        return packs;
    }

    @Override
    public int delete(String code) {
        
        int status = 0;
        String sql = "DELETE FROM packages WHERE pack_id = ?";
        try {

            int deleteStatus = JOptionPane.showConfirmDialog(null, "Do you want to delete the package " + code + " ?");
            if (deleteStatus == 0) {
                Connection con = DBC.getDB();
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, code);
                status = pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "The package has been deleted!");
            }
            System.out.println(deleteStatus);
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }



    
}
