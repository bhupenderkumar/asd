package com.bhupender.sharma;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.mata.DB.Dao;


@Path("/Name") 
public class Simple {

	@Path("/algo")
	@GET
	public String getAlgo(){
		return Dao.GetData("algo").toString() ;
	}
	@Path("/java")
	@GET
	public String getJava(){
		return Dao.GetData("java").toString() ;
	}
	@Path("/scjp")
	@GET
	public String getScjp(){
		return Dao.GetData("scjp").toString() ;
	}
	@Path("/videos")
	@GET
	public String getalgo(){
		return Dao.GetData("videos").toString() ;
	}
	
	
}
