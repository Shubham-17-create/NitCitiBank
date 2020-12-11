package com.nt.controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.stereotype.Controller;

import com.nt.dto.UserDTO;
import com.nt.service.IUserMgmtService;
import com.nt.service.UserMgmtService;

@Controller
@WebServlet(value="/controller", loadOnStartup = 1)
public class MainControllerServlet extends HttpServlet {
	
	@Autowired
	ApplicationContext ctx;
	public void init()  {
	  //create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	}

	

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		           
		ApplicationContext ctx=null;
		   UserMgmtService service=null;
		   UserDTO dto=null;
	
		  
		   service=ctx.getBean("userService",UserMgmtService.class);
		   //invoke method
		   try { 
			   dto=service.viewShipment(453);
			   System.out.println(dto);
		   }
		   catch (DataAccessException dae) {
			   if(dae instanceof EmptyResultDataAccessException)
				   System.err.println("Record not found");
			   else if(dae instanceof BadSqlGrammarException)
				   System.err.println("SQLquery is wrong");
			   else
				   System.err.println("Other Internal problems");
			   
		}
		   System.out.println("========================");
		   
		   try { 
			   dto=service.shipReservation(453);
			   System.out.println(dto);
		   }
		   catch (DataAccessException dae) {
			   if(dae instanceof EmptyResultDataAccessException)
				   System.err.println("Record not found");
			   else if(dae instanceof BadSqlGrammarException)
				   System.err.println("SQLquery is wrong");
			   else
				   System.err.println("Other Internal problems");
			   
		}
		   System.out.println("========================");
           
		   try { 
			   dto=service.shipmentReservation(453);
			   System.out.println(dto);
		   }
		   catch (DataAccessException dae) {
			   if(dae instanceof EmptyResultDataAccessException)
				   System.err.println("Record not found");
			   else if(dae instanceof BadSqlGrammarException)
				   System.err.println("SQLquery is wrong");
			   else
				   System.err.println("Other Internal problems");
			   
		}
		   System.out.println("========================");
		   
		   
  
			}//doGet(-,-)

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
            doGet(req,res);
	}
	
	public void destroy() {
		//close IOC container
		((AbstractApplicationContext) ctx).close();
	}
}