package model.services;

import java.util.List;

import model.dao.DepartmentDAO;
import model.dao.Factory;
import model.entities.Department;

public class DepartmentService {
	
	
	private DepartmentDAO dao = Factory.createDepartmentDao();
	public List<Department> findAll(){
		return dao.findAll();
		
	}

}
