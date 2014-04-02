package ua.lviv.ipm.lan.userlist.dao.impl;

import org.springframework.stereotype.Repository;

import ua.lviv.ipm.lan.userlist.dao.AbstractDAO;
import ua.lviv.ipm.lan.userlist.dao.IpAdressDao;
import ua.lviv.ipm.lan.userlist.domain.IpAdress;

@Repository
public class IpAdressDaoImpl extends AbstractDAO<IpAdress> implements IpAdressDao {

	@Override
	public Class<IpAdress> getEntityClass() {
		return IpAdress.class;
	}

}
