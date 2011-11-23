package ie.cit.cloud.appdev;

import ie.cit.cloud.appdev.model.Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
/**
 * EmployeeContoller
 * 
 * @author paul bradley
 */
@Service
public class EmployeeService {

	/* simple in-memory data repository (!not persistent! and instance specific) */
	private List<Employee> repository;

	public EmployeeService() {
		repository = new ArrayList<Employee>();
	}

	public List<Employee> getAllEmployees() {
		return repository;
	}

	public int getEmployeesCount() {
		return repository.size();
	}
	
	public void addNewEmployee(Employee newEmployee) {
		repository.add(newEmployee);
	}

}
