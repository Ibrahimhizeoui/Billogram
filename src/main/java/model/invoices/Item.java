package model.invoices;

import model.item.BaseItem;

public class Item extends BaseItem{

	private int count;
	private int discount;
	
	public Item() {}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
}
