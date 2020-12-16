package domain.dao;
import domain.Employee;

public class EmployeeDAO {

	public EmployeeDAO() {
		
	}

	public void saveEmployee(Employee employee) {
		
		/**
			DatabaseConnectionManager databaseConnection = DatabaseConnectionManager
					.getManagerInstance();
			databaseConnection.connect();
	
			DatabaseConnectionManager.getManagerInstance().getConnectionObject()
					.prepareStatement("some sql... ");
			databaseConnection.disconnect();
			*/
			
		System.out.println("saved employee to database");
		
	}

	public void removeEmployee(Employee employee){
				
		//	DatabaseConnectionManager.getManagerInstance().getConnectionObject()
		//		.prepareStatement("some sql... ");
	
		System.out.println("removed employee from database");	
	}
	
}