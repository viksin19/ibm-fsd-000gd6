package FIRSTswing;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

import myconnection.Factory;

public class RS2XMLConfig {
private Factory factory;
private Connection connection;
public RS2XMLConfig() throws SQLException {
	super();
	factory = Factory.createObject();
	connection = factory.getConnection();
}
public ResultSet getallemployee() throws SQLException {
	Statement statement = connection.createStatement();
	ResultSet rs = statement.executeQuery("select * from employee");
	return rs;
	
	
}
public ResultSet getalltable() throws SQLException {
	Statement st =connection.createStatement();
	ResultSet rs = st.executeQuery("select Firstname as First_Name ,Lastname as Last_Name ,email as Email,Dname as Department ,location as Loction from employee,department");
	return rs;
}
}
