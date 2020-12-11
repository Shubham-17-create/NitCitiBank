package com.nt.service;

import com.nt.bo.UserBO;
import com.nt.dto.UserDTO;

public interface IUserMgmtService {

	public UserDTO viewShipment(long no);
	public UserDTO shipReservation(long no);
	public UserDTO shipmentReservation(long no);
	

}
