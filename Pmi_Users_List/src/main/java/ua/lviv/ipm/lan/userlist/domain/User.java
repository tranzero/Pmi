package ua.lviv.ipm.lan.userlist.domain;
import static org.apache.commons.lang.Validate.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="user")
@NamedQueries(value = {
		@NamedQuery(name = User.FIND_BY_LOGIN, query = User.FIND_BY_LOGIN_QUERY)})
public class User extends BaseEntity {
	
	public static final String FIND_BY_LOGIN = "User.findByLogin";;
	public static final String FIND_BY_LOGIN_QUERY = "SELECT user from User user WHERE user.login= ?1";
	
	@Id
	@Column(name="userid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	@Column(name="login")
	private String login;
	
	@Column(name="password")
	private String password;
	
	@Column(name="username")
	private String username;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	public User(){}
	
	public User(String login, String password, String username, String email, String phone){
		
		this.setLogin(login);
		this.setPassword(password);
		this.setUsername(username);
		this.setEmail(email);
		this.setPhone(phone);
		
	}
	

	public String getLogin() {
		return login;
	}

	private void setLogin(String login) {
		notEmpty(login);
		this.login = login;
	}

	public String getPassword() {
		
		return password;
	}

	public void setPassword(String password) {
		
		notEmpty(password);
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
