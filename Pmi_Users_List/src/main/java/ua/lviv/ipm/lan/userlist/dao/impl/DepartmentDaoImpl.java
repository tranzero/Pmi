package ua.lviv.ipm.lan.userlist.dao.impl;

import org.springframework.stereotype.Repository;

import ua.lviv.ipm.lan.userlist.dao.AbstractDAO;
import ua.lviv.ipm.lan.userlist.dao.DepartmentDao;
import ua.lviv.ipm.lan.userlist.domain.Department;

@Repository
public class DepartmentDaoImpl extends AbstractDAO<Department> implements DepartmentDao {

	@Override
	public Class<Department> getEntityClass() {
		return Department.class;
	}

}
