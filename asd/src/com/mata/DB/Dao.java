package com.mata.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;


public class Dao implements IDao {

	public static JSONArray GetData(String name) {
		// TODO Auto-generated method stub
		
		
		try {
			Connection conn=Connect.getConnection();
			
			PreparedStatement pstmt=conn.prepareStatement("select * from  "+name);
			
			ResultSet res=pstmt.executeQuery();
		
			Map<String ,String> ma=new HashMap<String,String>();
			JSONArray aa=new JSONArray();
			while(res.next()){
				JSONObject js=new JSONObject();
				js.put(res.getString(2), res.getString(3));
				aa.put(js);
			}
			
			Connect.closeConnection(conn);
			
			return aa;
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return null;
	}

	
	
	
	
}
