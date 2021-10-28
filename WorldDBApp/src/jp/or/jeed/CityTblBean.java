package jp.or.jeed;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CityTblBean implements Serializable {

	private int id;
	private String name=null;
	private String countrycode=null;
	private String district=null;
	private long population;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}

	public static ArrayList<CityTblBean> selectAllList(int pos) throws SQLException{
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<CityTblBean> citylist = new ArrayList<>();
		try {
			conn = new ResourceFinder().getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM city");
			rs.absolute(pos);                                                                     //絶対値取得
			for(int i=0;i<20;i++) {
				CityTblBean ctb = new CityTblBean();
				ctb.setId(rs.getInt("ID"));
				ctb.setName(rs.getString("Name"));
				ctb.setCountrycode(rs.getString("CountryCode"));
				ctb.setDistrict(rs.getString("District"));
				ctb.setPopulation(rs.getInt("Population"));
				citylist.add(ctb);
				boolean b=rs.next();
				if(!b) break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return citylist;
	}
}
