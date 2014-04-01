/**
 * 
 */
package ua.lviv.ipm.lan.userlist.domain;
import static org.apache.commons.lang.Validate.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author tranzero
 *
 */
@Entity
@Table(name="rang")
public class Rang {
	 @Id
	 @Column(name = "rangid")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int rangId;
	 
	 @Column(name="rangname")
	 private String rangName;
	 
	public Rang(){}
	public Rang(String rangName){
		this.setRangName(rangName);
	}

	public String getRangName() {
		return rangName;
	}

	public void setRangName(String rangName) {
		notEmpty(rangName);
		this.rangName = rangName;
	}

}
