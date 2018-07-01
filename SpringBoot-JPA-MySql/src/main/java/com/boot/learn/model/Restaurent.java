/**
 * 
 */
package com.boot.learn.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Sanjeev
 *
 */
@Entity
public class Restaurent implements Serializable{

	private static final long serialVersionUID = 4453345593297950502L;

	@Id
	@GeneratedValue
	@Column(name = "RESTAURENT_ID")
	private long restaurentId;

	@Column(name = "RESTAURENT_NAME")
	private String resturentName;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "CONTACT_NO")
	private long contactInfo;

	public Restaurent() {
	}

	public long getRestaurentId() {
		return restaurentId;
	}

	public void setRestaurentId(long restaurentId) {
		this.restaurentId = restaurentId;
	}

	public String getResturentName() {
		return resturentName;
	}

	public void setResturentName(String resturentName) {
		this.resturentName = resturentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(long contactInfo) {
		this.contactInfo = contactInfo;
	}

}
