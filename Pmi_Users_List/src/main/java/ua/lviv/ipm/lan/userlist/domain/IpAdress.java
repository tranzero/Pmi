package ua.lviv.ipm.lan.userlist.domain;
import static org.apache.commons.lang.Validate.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ipadresses")
public class IpAdress extends BaseEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "rangid")
	private Rang rang;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "sadminid")
	private Sadmin sysAdmin;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "locationid")
	private Location location;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "departmentsid")
	private Department dep;

	@Column(name = "ipadress")
	private String ipAdress;

	@Column(name = "owner")
	private String owner;

	@Column(name = "phone")
	private String phone;

	@Column(name = "email")
	private String email;
	
	@Column(name = "mac")
	private String mac;
	
	@Column(name = "room")
	private String room;

	@Column(name = "isactive")
	private boolean isActive;

	public IpAdress() {
	}

	public IpAdress(String ipadress, String owner, String phone, String mac,
			String email, boolean isActive, Sadmin sysadmin, Rang rang,
			Location location, Department dep, String room) {
		this.setIpAdress(ipadress);
		this.setOwner(owner);
		this.setMac(mac);
		this.setActive(isActive);
		this.setDep(dep);
		this.setEmail(email);
		this.setLocation(location);
		this.setPhone(phone);
		this.setRang(rang);
		this.setSysAdmin(sysadmin);
		this.setRoom(room);
	}

	public Rang getRang() {
		return rang;
	}

	public void setRang(Rang rang) {
		this.rang = rang;
	}

	public Sadmin getSysAdmin() {
		return sysAdmin;
	}

	public void setSysAdmin(Sadmin sysAdmin) {
		this.sysAdmin = sysAdmin;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	public String getIpAdress() {
		return ipAdress;
	}

	public void setIpAdress(String ipAdress) {
		notEmpty(ipAdress);
		this.ipAdress = ipAdress;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		notEmpty(owner);
		this.owner = owner;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
