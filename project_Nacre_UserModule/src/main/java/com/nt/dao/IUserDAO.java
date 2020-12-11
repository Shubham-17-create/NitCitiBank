package com.nt.dao;

import java.util.Map;

import com.nt.bo.UserBO;

public interface IUserDAO {
	
	public UserBO viewShipment(long no);
	public UserBO shipReservation(long no);
	public UserBO shipmentReservation(long no);
	
}
