package ua.lviv.ipm.lan.userlist.dao.impl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ua.lviv.ipm.lan.userlist.dao.AbstractDAO;
import ua.lviv.ipm.lan.userlist.dao.UserDao;
import ua.lviv.ipm.lan.userlist.domain.User;

@Repository
public class UserDaoImpl extends AbstractDAO<User> implements UserDao {

	@Override
	public Class<User> getEntityClass() {
		return User.class;
	}
	
	@Override
    public User findByLogin(String username) {
	Query query = entityManager.createNamedQuery(
		User.FIND_BY_LOGIN).setParameter(1, username);
	User user = null;
	try {
	user =(User) find(query);
	} catch (ClassCastException e){}
	return user;
    }

	
	}
