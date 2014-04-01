package ua.lviv.ipm.lan.userlist.domain;

import static org.apache.commons.lang.Validate.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="locations")
public class Location extends BaseEntity {
	
	@Id
	@Column(name="locationid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int locationId;
	
	@Column(name="locationname")
	 private String locationName;
	 
	 @Column(name="locationFloor")
	 private String locationFloor;

	 public Location(){}
	 
	 public Location(String name, String floor) {
		 
		 this.setLocationName(name);
		 this.setLocationFloor(floor);
	 }
	 
	 
	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		notEmpty(locationName);
		this.locationName = locationName;
	}

	public String getLocationFloor() {
		return locationFloor;
	}

	public void setLocationFloor(String locationFloor) {
		this.locationFloor = locationFloor;
	}
	 
	 

}
