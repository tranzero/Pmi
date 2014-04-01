package ua.lviv.ipm.lan.userlist.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class Department extends BaseEntity {

	@Id
	@Column(name = "departmentsid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int depId;

	@Column(name = "departmentsnumber")
	private int depNumb;

	@Column(name = "departmentsname")
	private String depName;

	public Department() {
	}

	public Department(int number, String name) {

		this.setDepNumb(number);
		this.setDepName(name);
	}

	public int getDepNumb() {
		return depNumb;
	}

	public void setDepNumb(int depNumb) {
		this.depNumb = depNumb;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

}
