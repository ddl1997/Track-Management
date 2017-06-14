package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import com.mysql.jdbc.PreparedStatement;


public class DBOperate {
	
	public int insert(Track in)
	{
		Timestamp ts = new Timestamp(in.getDate().getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
		String date = df.format(ts);
		String sql = "insert into track(car_id, date, longitude, lantitude, speed, is_idle) values (?, ?, ?, ?, ?, ?)";
		Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DBConnection.getConnection();
            pstmt = (PreparedStatement) con.prepareStatement(sql);
            pstmt.setString(1, in.getCar_id());
            pstmt.setString(2, date);
            pstmt.setDouble(3, in.getLongitude());
            pstmt.setDouble(4, in.getLantitude());
            pstmt.setDouble(5, in.getSpeed());
            pstmt.setBoolean(6, in.isIs_idle());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return 1;
        }finally{
            DBConnection.closeConnection(con);
        }
        return 0;
	}
	
	public int deleteTrack(Track in)
	{
		String sql = "delete from track where car_id = ? and longitude = ? and lantitude = ?";
		Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DBConnection.getConnection();
            pstmt = (PreparedStatement) con.prepareStatement(sql);
            pstmt.setString(1, in.getCar_id());
            pstmt.setDouble(2, in.getLongitude());
            pstmt.setDouble(3, in.getLantitude());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return 1;
        }finally{
            DBConnection.closeConnection(con);
        }
        return 0;
	}
	
	public int deleteLine(String id)
	{
		String sql = "delete from track where car_id = ?;";
		Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DBConnection.getConnection();
            pstmt = (PreparedStatement) con.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return 1;
        }finally{
            DBConnection.closeConnection(con);
        }
        return 0;
	}
	
	public int modify(Track in, double newlng, double newlat)
	{
		/*String sql = "update track set longitude = ? and where car_id = ? and longitude = ? and ;";
		Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DBConnection.getConnection();
            pstmt = (PreparedStatement) con.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return 1;
        }finally{
            DBConnection.closeConnection(con);
        }*/
        return 0;
	}
	
	public ArrayList<Track> searchById(String id)
	{
		ArrayList<Track> tl = new ArrayList<Track>();
		String sql = "select * from track where car_id = ?;";
		Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DBConnection.getConnection();
            pstmt = (PreparedStatement) con.prepareStatement(sql);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next() == false)
            	return null;

            while (rs.next())
            {
            	Track t = new Track();
            	t.setCar_id(rs.getString("car_id"));
            	t.setDate(rs.getDate("date"));
            	t.setLongitude(rs.getDouble("longitude"));
            	t.setLantitude(rs.getDouble("lantitude"));
            	t.setSpeed(rs.getDouble("speed"));
            	t.setIs_idle(rs.getBoolean("is_idle"));
            	tl.add(t);
            }
            
            rs.close();
            pstmt.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        }finally{
            DBConnection.closeConnection(con);
        }
        return tl;
	}
	
	public ArrayList<Track> searchByDate(Date date)
	{
		return null;
	}
	
	public ArrayList<Track> searchByLocation(
			double startLng,
			double startLat,
			double endLng,
			double endLat)
	{
		return null;
	}
}
