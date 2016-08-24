package utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Max_Id {
	
	public ConnUtil connUtil=new ConnUtil();
	public Connection conn=connUtil.getConn();
	/**
	 * 取出最大的PID值
	 * @return n
	 * @throws SQLException
	 */
		public int select_maxPowId() throws SQLException {
			String sql="select max(pid) max from pow";
			int n=0;
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				n=rs.getInt("max");
			}
			return n;
		}
	/**
	 * 取出最大的RID值
	 * @return n
	 * @throws SQLException
	 */
		public int select_maxRoleId() throws SQLException {
			String sql="select max(rid) max from u_role";
			int n=0;
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				n=rs.getInt("max");
			}
			return n;
		}
		
		/**
		 * 取出最大的UserID值
		 * @return n
		 * @throws SQLException
		 */
			public int select_maxUserId() throws SQLException {
				String sql="select max(userid) userid from userInfo";
				int n=0;
				Statement st=conn.createStatement();
				ResultSet rs=st.executeQuery(sql);
				while(rs.next()){
					n=rs.getInt("userid");
				}
				return n;
			}
}
