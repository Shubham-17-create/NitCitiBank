package com.nt.service;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.UserBO;
import com.nt.dao.UserDAOImpl;
import com.nt.dto.UserDTO;

@Service("userService")
public class UserMgmtService implements IUserMgmtService {
	@Autowired
	private UserDAOImpl dao;
	@Override
	public UserDTO viewShipment(long no) {
	
		UserBO bo=null;
		UserDTO dto=null;
		
		//use dao
		bo=dao.viewShipment(no);
		
		//convert Bo to Dto
		dto=new UserDTO();
		
		BeanUtils.copyProperties(bo,dto);
		return dto;
		
		
	}

	@Override
	public UserDTO shipReservation(long no) {
		UserBO bo=null;
		UserDTO dto=null;
		
		//use dao
		bo=dao.shipReservation(no);
		
		//convert Bo to Dto
		dto=new UserDTO();
		
		BeanUtils.copyProperties(bo,dto);
		return dto;
		
	
	}

	@Override
	public UserDTO shipmentReservation(long no) {
		UserBO bo=null;
		UserDTO dto=null;
		
		//use dao
		bo=dao.shipmentReservation(no);
		
		//convert Bo to Dto
		dto=new UserDTO();
		
		BeanUtils.copyProperties(bo,dto);
		return dto;

		
	}

}
