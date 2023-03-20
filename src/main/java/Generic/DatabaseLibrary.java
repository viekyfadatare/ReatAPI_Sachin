package Generic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DatabaseLibrary {

	static Connection con;
	static Driver driver;
	
	/**
	 * This method is used to connect thed ata base
	 * @throws Exception
	 */
	public void connecttoDB() throws Exception {
		
		driver = new Driver();
		DriverManager.registerDriver(driver);
		con =  DriverManager.getConnection(IConstant.dbUrl,IConstant.dbUsername ,IConstant.dbPassword);
	}
	
	/**
	 * this method is used to close the database
	 * @throws Exception
	 */
	
	public void closeDB() throws Exception {
		con.close();
	}
	
	/**
	 * This methoos is used tho read the data from database
	 * @param query
	 * @param columnIndex
	 * @param expData
	 * @return
	 * @throws Exception
	 */
	
	
	public String readDataFromDBAndValidate( String query , int columnIndex , String expData) throws Exception {
		
		boolean flag = false;
		
		ResultSet result = con.createStatement().executeQuery(query);
		
		 while(result.next()) {
			 
			 if(result.getString(columnIndex).equalsIgnoreCase(expData)) {
				 
				 flag = true;
				 break;
			 }
			 
		 }
		 
		 
		 if(flag) {
			 System.out.println("verified");
			 return expData;
		 }else {
			 System.out.println("data not verified");
			 
			 return " wrong data ";
		 }
		
	}
	
}
