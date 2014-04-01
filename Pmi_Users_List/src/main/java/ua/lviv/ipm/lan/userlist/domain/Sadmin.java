package ua.lviv.ipm.lan.userlist.domain;
import static org.apache.commons.lang.Validate.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sadmin")
public class Sadmin {
	
	@Id
	 @Column(name = "sadminid")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int sAdminId;
	
	 @Column(name="sadminname")
	 private String sAdminName;
	 
	 @Column(name="sadminphone")
	 private String sAdminPhone;
	 
	 public Sadmin(){}
	 
	 public Sadmin(String name, String phone){
		 
		 this.setsAdminName(name);
		 this.setsAdminPhone(phone);
		 
	 }

	public String getsAdminName() {
		return sAdminName;
	}

	public void setsAdminName(String sAdminName) {
		notEmpty(sAdminName);
		this.sAdminName = sAdminName;
	}

	public String getsAdminPhone() {
		return sAdminPhone;
	}

	public void setsAdminPhone(String sAdminPhone) {
		this.sAdminPhone = sAdminPhone;
	}
	 

}
