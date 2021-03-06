package gc.dao.gym.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import gc.dao.gym.GymCommentDao;
import gc.dao.jdbc.DBContext;
import gc.entity.gym.Gym;
import gc.entity.gym.GymComment;
import gc.entity.trainer.TrainerComment;


public class JdbcGymCommentDao implements GymCommentDao{

	@Override
	public int insert(GymComment gymComment) {
		
		int result = 0;
		
		String url = DBContext.URL;
		String sql = "INSERT INTO GYM_COMMENT(RESERVATION_NUMBER, GYM_ID, CONTENT) VALUE(?,?,?)";
		
		
		try {
			Class.forName(DBContext.DRIVER);
			Connection con = DriverManager.getConnection(url,DBContext.UID,DBContext.PWD);
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, gymComment.getReservationNumber());
			st.setInt(2,gymComment.getGymId());
			st.setString(3, gymComment.getContent());
			
			result = st.executeUpdate();
			
			st.close();
			con.close();
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int update(GymComment gymComment) {
		
		int result = 0;
		
		String url = DBContext.URL;
		String sql = "UPDATE INTO GYM_COMMENT SET CONTENT=? WHERE RESERVATION_NUMBER=?, GYM_ID=?";
		
		try {
			Class.forName(DBContext.DRIVER);
			Connection con = DriverManager.getConnection(url,DBContext.UID,DBContext.PWD);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, gymComment.getContent());
			st.setInt(2, gymComment.getReservationNumber());
			st.setInt(3,gymComment.getGymId());
			
			result = st.executeUpdate();
			
			st.close();
			con.close();
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int delete(int reservationNumber, int gymId) {
		
		int result = 0;
		
		String url = DBContext.URL;
		String sql = "DELETE FROM GYM_COMMENT WHERE RESERVATION_NUMBER=?, GYM_ID=?";
		
		try {
			Class.forName(DBContext.DRIVER);
			Connection con = DriverManager.getConnection(url,DBContext.UID,DBContext.PWD);
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1,reservationNumber);
			st.setInt(2,gymId);
			
			result = st.executeUpdate();
			
			st.close();
			con.close();
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public GymComment get(int reservationNumber, int gymId) {
		
		GymComment g = null;
		
		String url = DBContext.URL;
		String sql = "SELECT * FROM GYM_COMMENT WHERE RESERVATION_NUMBER="+reservationNumber+"GYM_ID="+gymId;
		
		try {
			Class.forName(DBContext.DRIVER);
			Connection con = DriverManager.getConnection(url,DBContext.UID,DBContext.PWD);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				
				g = new GymComment(
				);
				
			}
			
			rs.close();
			st.close();
			con.close();
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return g;
	}

	@Override
	public List<GymComment> getList() {
		
		List<GymComment> list = new ArrayList<>();
		
		String url = DBContext.URL;
		String sql = "SELECT * FROM GYM_COMMENT";
		
		try {
			Class.forName(DBContext.DRIVER);
			Connection con = DriverManager.getConnection(url, DBContext.UID, DBContext.PWD);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				
				int reservationNumber = rs.getInt("reservation_number");
				Date regdate = rs.getDate("date");	
				int gymId = rs.getInt("gym_id");	
				String content = rs.getString("content");	
				
				GymComment g = new GymComment(
					reservationNumber,
					regdate,
					gymId,
					content
						);
						
				list.add(g);
			}
			rs.close();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}