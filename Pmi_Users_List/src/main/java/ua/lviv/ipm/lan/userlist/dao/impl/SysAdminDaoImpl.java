package ua.lviv.ipm.lan.userlist.dao.impl;

import org.springframework.stereotype.Repository;

import ua.lviv.ipm.lan.userlist.dao.AbstractDAO;
import ua.lviv.ipm.lan.userlist.dao.SysAdminDao;
import ua.lviv.ipm.lan.userlist.domain.Sadmin;

@Repository
public class SysAdminDaoImpl extends AbstractDAO<Sadmin> implements SysAdminDao {

	@Override
	public Class<Sadmin> getEntityClass() {
		return Sadmin.class;
	}

}
