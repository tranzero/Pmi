package ua.lviv.ipm.lan.userlist.dao;

import ua.lviv.ipm.lan.userlist.domain.User;

public interface UserDao extends AbstractDAOIface<User> {

	User findByLogin(String login);

}
