package employeedao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import employee.Employee;
import myconnection.Factory;

public class EmployeeDaoimpl implements EmployeeDao {

	private Factory factory = null;
	private Connection connection = null;
	private PreparedStatement pStatement = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	
	
	public EmployeeDaoimpl() throws SQLException {
		super();
		factory = Factory.createObject();
		connection = factory.getConnection();
		
	}

	@Override
	public void createEmployee(Employee employee) {
		try{
			pStatement = connection.prepareStatement("insert into employee values(?,?,?,?)");
			pStatement.setInt(1,employee.getId());
			pStatement.setString(2,employee.getFirstname());
			pStatement.setString(3,employee.getLastname());
			pStatement.setString(4,employee.getEmail());
			pStatement.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			
		}

	}

	@Override
	public List<Employee> getAllEmployees() {
		
		List<Employee> list = new ArrayList<Employee>();
		
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from employee");
			
			while (resultSet.next()) {
				 list.add(new Employee(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
 	}

	@Override
	public void deleteEmployee(int did) {
		try {
			pStatement = connection.prepareStatement("delete from employee where id = ?");
			pStatement.setInt(1,did);
		}catch(SQLException e){
		}finally {
		}
			
		}
		
	
		
	}


