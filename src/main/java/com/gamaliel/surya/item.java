package com.gamaliel.surya;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class item {
	@Id @GeneratedValue
	private Long itemId;
	private String itemCode;
	private String itemName;
	private Boolean isStock;
	private int itemStock;
	private int itemBufferStock;
	public item(String itemCode, String itemName, Boolean isStock, int itemStock, int itemBufferStock) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.isStock = isStock;
		this.itemStock = itemStock;
		this.itemBufferStock = itemBufferStock;
	}
	
	public item() {

	}

	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Boolean getIsStock() {
		return isStock;
	}
	public void setIsStock(Boolean isStock) {
		this.isStock = isStock;
	}
	public int getItemStock() {
		return itemStock;
	}
	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}
	public int getItemBufferStock() {
		return itemBufferStock;
	}
	public void setItemBufferStock(int itemBufferStock) {
		this.itemBufferStock = itemBufferStock;
	}
}
