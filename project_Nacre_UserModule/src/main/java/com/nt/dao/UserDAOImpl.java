package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nt.bo.UserBO;
@Repository
public class UserDAOImpl implements IUserDAO{
	
	private static final String SELECT_QUERY1="SELECT * FROM SHIPMENT_DETAILS WHERE SHIPMENT_ID=?";
	private static final String SELECT_QUERY2="SELECT * FROM SHIP_DETAILS WHERE SHIP_ID=?";
	private static final String SELECT_QUERY3="SELECT * FROM SHIPRES_DETAILS WHERE SHIPRES_ID=?";
    
	@Autowired
	private  JdbcTemplate jt;

	@Override
	public UserBO viewShipment(long no) {
		UserBO bo = null;
		bo=jt.queryForObject(SELECT_QUERY1,new UserMapper(),no);
		
		return bo;
	}
	public static class UserMapper implements RowMapper<UserBO>{

		@Override
		public UserBO mapRow(ResultSet rs, int rowNum) throws SQLException {
			// convert RS record to UserBO class object
			
			UserBO bo= new UserBO(); 
			
			bo.setShipment_Id(rs.getLong(1));
			bo.setCustomer_Id(rs.getLong(2));
			bo.setResFrom(rs.getString(3));
			bo.setDestination(rs.getString(4));
			bo.setShipment_date(rs.getString(5));
			bo.setRes_date(rs.getString(6));
			bo.setAmount_paid(rs.getLong(7));
			bo.setShip_name(rs.getString(8));
			
			
			return bo;
	    	} //mapRow
		}//inner class


	@Override
	public UserBO shipReservation(long no) {
		UserBO bo = null;
		bo=jt.queryForObject(SELECT_QUERY2,new UserMapper1(),no);
		
		return bo;
	}
	public static class UserMapper1 implements RowMapper<UserBO>{

		@Override
		public UserBO mapRow(ResultSet rs, int rowNum) throws SQLException {
			// convert RS record to UserBO class object
			
			UserBO bo= new UserBO(); 
			
			bo.setShip_id(rs.getLong(1));
			bo.setShip_name(rs.getString(2));
			bo.setOperate_from(rs.getString(3));
			bo.setOperate_to(rs.getString(4));
			bo.setLaunch_date(rs.getString(5));
			bo.setMaintainance_cost(rs.getLong(6));
			bo.setShip_type(rs.getString(7));
			
			
			return bo;
	    	} //mapRow
		}//inner class


	@Override
	public UserBO shipmentReservation(long no) {
		UserBO bo = null;
		bo=jt.queryForObject(SELECT_QUERY3,new UserMapper2(),no);
		
		return bo;
	}
	public static class UserMapper2 implements RowMapper<UserBO>{

		@Override
		public UserBO mapRow(ResultSet rs, int rowNum) throws SQLException {
			// convert RS record to UserBO class object
			
			UserBO bo= new UserBO(); 
			
			bo.setShipres_id(rs.getLong(1));
			bo.setCustomer_Id(rs.getLong(2));
			bo.setResFrom(rs.getString(3));
			bo.setDestination(rs.getString(4));
			bo.setJour_date(rs.getString(5));
			bo.setAmount_paid(rs.getLong(6));
			bo.setShip_name(rs.getString(7));
			
			
			return bo;
	    	} //mapRow
		}//inner class

	
}
