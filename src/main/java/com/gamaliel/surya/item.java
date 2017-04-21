package com.gamaliel.surya;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class itemHeader {
	
	@Id @GeneratedValue
	private Long id;
	private String itemName;
	private Boolean isStock;
	
	public itemHeader(String itemName, Boolean isStock) {
		this.itemName = itemName;
		this.isStock = isStock;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

}
