package ua.lviv.ipm.lan.userlist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.ipm.lan.userlist.dao.UserDao;
import ua.lviv.ipm.lan.userlist.domain.User;
import ua.lviv.ipm.lan.userlist.service.ServiceFactory;
import ua.lviv.ipm.lan.userlist.service.UserSecvice;

@Service
public class UserServiceImpl implements UserSecvice {

	@Autowired
	private UserDao userDao;

	@Autowired
	private User user;

	@Transactional(readOnly = true)
	@Override
	public List<User> findUserList() {
		return userDao.getAllEntities();
	}

	@Transactional(readOnly = true)
	@Override
	public boolean issetUser(String login) {
		if (this.fingByLogin(login) != null) {
			return false;
		} else {
			return true;
		}

	}

	@Transactional(readOnly = true)
	@Override
	public User fingByLogin(String login) {

		return userDao.findByLogin(login);
	}

	@Transactional
	@Override
	public boolean createUser(String login, String password, String username,
			String email, String phone) {

		if (this.issetUser(login)) {
			user = new User(login, password, username, email, phone);
			userDao.save(user);
			return true;
		}
		return false;
	}

	@Transactional
	@Override
	public boolean updateUser(String login, String password, String username,
			String email, String phone) {
		if (!this.issetUser(login)) {
			user = this.fingByLogin(login);

			user.setPassword(password);
			user.setEmail(email);
			user.setPhone(phone);
			user.setUsername(username);

			userDao.update(user);

			return true;
		}
		return false;
	}

	@Transactional
	@Override
	public boolean removeUser(String login) {
		if (this.issetUser(login)) {
			userDao.remove(userDao.findByLogin(login));
			return true;
		}
		return false;

	}
	
	public static UserSecvice getInstance() {
		return ServiceFactory.getService(UserSecvice.class);
	}

}
