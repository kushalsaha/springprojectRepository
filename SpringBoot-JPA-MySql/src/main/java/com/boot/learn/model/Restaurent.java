/**
 * 
 */
package com.boot.learn.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Sanjeev
 *
 */
@Entity
@Table(name = "RESTAURENT", catalog = "food")
public class Restaurent implements Serializable {

	private static final long serialVersionUID = 4453345593297950502L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "RESTAURENT_ID")
	private long restaurentId;

	@Column(name = "RESTAURENT_NAME")
	private String resturentName;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "CONTACT_NO")
	private long contactInfo;

	@OneToOne(cascade = CascadeType.ALL)
	private Menu menu;

	public Restaurent() {
	}

	public long getRestaurentId() {
		return restaurentId;
	}

	public Restaurent setRestaurentId(long restaurentId) {
		this.restaurentId = restaurentId;
		return this;
	}

	public String getResturentName() {
		return resturentName;
	}

	public Restaurent setResturentName(String resturentName) {
		this.resturentName = resturentName;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public Restaurent setAddress(String address) {
		this.address = address;
		return this;
	}

	public long getContactInfo() {
		return contactInfo;
	}

	public Restaurent setContactInfo(long contactInfo) {
		this.contactInfo = contactInfo;
		return this;
	}

	public Menu getMenu() {
		return menu;
	}

	public Restaurent setMenu(Menu menu) {
		this.menu = menu;
		return this;
	}
	
	

}
