/**
 * 
 */
package com.boot.learn.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Sanjeev
 *
 */
@Entity
@Table(name = "RESTAURENT_MENU", catalog = "food")
public class Menu implements Serializable {

	private static final long serialVersionUID = -5806764291223344714L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MENU_ID")
	private long menuId;

	@Column(name = "MENU_NAME")
	private String menuName;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "MENU_ITEMS", joinColumns = { @JoinColumn(name = "MENU_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "ITEM_ID") })
	private Set<Item> items = new HashSet<>(0);

	public Menu() {
	}

	public long getMenuId() {
		return menuId;
	}

	public Menu setMenuId(long menuId) {
		this.menuId = menuId;
		return this;
	}

	public String getMenuName() {
		return menuName;
	}

	public Menu setMenuName(String menuName) {
		this.menuName = menuName;
		return this;
	}

	public Set<Item> getItems() {
		return items;
	}

	public Menu setItems(Set<Item> items) {
		this.items = items;
		return this;
	}

}
