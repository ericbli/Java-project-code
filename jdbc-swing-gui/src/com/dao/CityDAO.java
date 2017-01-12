package com.dao;

import java.util.*;

import com.core.City;

import java.sql.*;
import java.io.*;
import java.math.BigDecimal;

/**
 * 
 * @author www.luv2code.com
 *
 */
public class CityDAO {

	private Connection myConn;
	
	public CityDAO() throws Exception {
		
		// get db properties
		Properties props = new Properties();
		props.load(new FileInputStream("demo.properties"));
		
		String user = props.getProperty("user");
		String password = props.getProperty("password");
		String dburl = props.getProperty("dburl");
		
		// connect to database
		myConn = DriverManager.getConnection(dburl, user, password);
		
		System.out.println("DB connection successful to: " + dburl);
	}
	
	

	public List<City> getAllCitys() throws Exception {
		List<City> list = new ArrayList<>();
		
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("select * from city");
			
			while (myRs.next()) {
				City tempCity = convertRowToCity(myRs);
				list.add(tempCity);
			}

			return list;		
		}
		finally {
			close(myStmt, myRs);
		}
	}
	

	public List<City> searchCitys(String name) throws Exception {
		List<City> list = new ArrayList<>();

		PreparedStatement myStmt = null;
		ResultSet myRs = null;

		try {
			name += "%";
			myStmt = myConn.prepareStatement("select * from city where name like ?");
			
			myStmt.setString(1, name);
			
			myRs = myStmt.executeQuery();
			
			while (myRs.next()) {
				City tempCity = convertRowToCity(myRs);
				list.add(tempCity);
			}
			
			return list;
		}
		finally {
			close(myStmt, myRs);
		}
	}
	
	


	private City convertRowToCity(ResultSet myRs) throws SQLException {
		
		int id = myRs.getInt("id");
		String name = myRs.getString("name");
		String countryCode = myRs.getString("CountryCode");
		String district = myRs.getString("district");
		int population = myRs.getInt("population");
		
		City tempCity = new City(id, name, countryCode, district, population);
		
		return tempCity;
	}

	
	private static void close(Connection myConn, Statement myStmt, ResultSet myRs)
			throws SQLException {

		if (myRs != null) {
			myRs.close();
		}

		if (myStmt != null) {
			
		}
		
		if (myConn != null) {
			myConn.close();
		}
	}

	private void close(Statement myStmt, ResultSet myRs) throws SQLException {
		close(null, myStmt, myRs);		
	}

	public static void main(String[] args) throws Exception {
		
		CityDAO dao = new CityDAO();
		System.out.println(dao.searchCitys("thom"));

		System.out.println(dao.getAllCitys());
	}
}
