package ua.lviv.ipm.lan.userlist.dao.impl;

import org.springframework.stereotype.Repository;

import ua.lviv.ipm.lan.userlist.dao.AbstractDAO;
import ua.lviv.ipm.lan.userlist.dao.RangDao;
import ua.lviv.ipm.lan.userlist.domain.Rang;

@Repository
public class RangDaoImpl extends AbstractDAO<Rang> implements RangDao {

	@Override
	public Class<Rang> getEntityClass() {
		return Rang.class;
	}

}
