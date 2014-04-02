package ua.lviv.ipm.lan.userlist.service;

import java.util.List;

import ua.lviv.ipm.lan.userlist.domain.User;


public interface UserSecvice extends BaseService {

	List<User> findUserList();

	boolean createUser(String login, String password, String username,
			String email, String phone);

	boolean issetUser(String login);

	boolean removeUser(String login);

	User fingByLogin(String login);

	boolean updateUser(String login, String password, String username, String email,
			String phone);

}
