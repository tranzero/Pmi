package ua.lviv.ipm.lan.userlist.dao.impl;

import org.springframework.stereotype.Repository;

import ua.lviv.ipm.lan.userlist.dao.AbstractDAO;
import ua.lviv.ipm.lan.userlist.dao.LocationDao;
import ua.lviv.ipm.lan.userlist.domain.Location;

@Repository
public class LocationDaoImpl extends AbstractDAO<Location> implements LocationDao {

	@Override
	public Class<Location> getEntityClass() {
		return Location.class;
	}

}
