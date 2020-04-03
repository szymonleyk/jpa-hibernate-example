package pl.szymonleyk.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	private int id;
	private String city;
	private String street;
	@Column(name = "house_number")
	private String houseNumber;
	@Column(name = "flat_number")
	private Integer flatNumber;
	@Column(name = "post_code")
	private String postCode;

	public Address() {
	}

	public Address(String city, String street, String houseNumber, int flatNumber, String postCode) {
		super();
		this.id = id;
		this.city = city;
		this.street = street;
		this.houseNumber = houseNumber;
		this.flatNumber = flatNumber;
		this.postCode = postCode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", street=" + street + ", houseNumber=" + houseNumber
				+ ", flatNumber=" + flatNumber + ", postCode=" + postCode + "]";
	}
}
