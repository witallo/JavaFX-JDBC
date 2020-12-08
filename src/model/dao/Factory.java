package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDAOJDBC;

public class Factory {

	public static SellerDAO createSellerDao() {
		return new SellerDAOJDBC(DB.getConnection());
	}
	
	public static DepartmentDAO createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}