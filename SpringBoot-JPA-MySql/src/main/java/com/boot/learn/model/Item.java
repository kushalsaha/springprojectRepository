/**
 * 
 */
package com.boot.learn.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Sanjeev
 *
 */
@Entity
@Table(name = "FOOD_ITEMS", catalog = "food")
public class Item implements Serializable {

	private static final long serialVersionUID = 6247702726087029466L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ITEM_ID")
	private long itemId;
	
	@Column(name="ITEM_NAME")
	private String itemName;
	
	@Column(name="PRICE")
	private double price;
	
	@Column(name="QUANTITY")
	private String quantity;

	public Item() {
	}

	public long getItemId() {
		return itemId;
	}

	public Item setItemId(long itemId) {
		this.itemId = itemId;
		return this;
	}

	public String getItemName() {
		return itemName;
	}

	public Item setItemName(String itemName) {
		this.itemName = itemName;
		return this;
	}

	public double getPrice() {
		return price;
	}

	public Item setPrice(double price) {
		this.price = price;
		return this;
	}

	public String getQuantity() {
		return quantity;
	}

	public Item setQuantity(String quantity) {
		this.quantity = quantity;
		return this;
	}

}
