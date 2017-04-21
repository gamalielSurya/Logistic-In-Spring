package com.gamaliel.surya;

import java.util.Date;

public class purchaseItem {
	public String itemCode;
	public String itemPurchaseCode;
	public String itemBrand;
	public String itemVendor;
	public int itemPrice;
	public Date itemDatePurchased;
	public int itemQuantityPurchased;
	public purchaseItem(String itemCode, String itemPurchaseCode, String itemBrand, String itemVendor, int itemPrice,
			Date itemDatePurchased, int itemQuantityPurchased) {
		this.itemCode = itemCode;
		this.itemPurchaseCode = itemPurchaseCode;
		this.itemBrand = itemBrand;
		this.itemVendor = itemVendor;
		this.itemPrice = itemPrice;
		this.itemDatePurchased = itemDatePurchased;
		this.itemQuantityPurchased = itemQuantityPurchased;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemPurchaseCode() {
		return itemPurchaseCode;
	}
	public void setItemPurchaseCode(String itemPurchaseCode) {
		this.itemPurchaseCode = itemPurchaseCode;
	}
	public String getItemBrand() {
		return itemBrand;
	}
	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}
	public String getItemVendor() {
		return itemVendor;
	}
	public void setItemVendor(String itemVendor) {
		this.itemVendor = itemVendor;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Date getItemDatePurchased() {
		return itemDatePurchased;
	}
	public void setItemDatePurchased(Date itemDatePurchased) {
		this.itemDatePurchased = itemDatePurchased;
	}
	public int getItemQuantityPurchased() {
		return itemQuantityPurchased;
	}
	public void setItemQuantityPurchased(int itemQuantityPurchased) {
		this.itemQuantityPurchased = itemQuantityPurchased;
	}
	
	
}
