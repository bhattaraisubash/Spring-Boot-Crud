package np.com.bsubash.springbootcrud.entity;

import java.io.Serializable;

/**
 * @author subash
 */
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	private long id;
	private String nationality;
	private String state;
	private String streetAddress;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

}
