package model.item;

import java.sql.Timestamp;

public class BaseItem {

	protected String item_no;
	protected String title;
	protected String description;
	protected double price;
	protected double vat;
	protected String unit;
	protected Bookkeeping bookkeeping;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	public BaseItem() {}

	public String getItem_no() {
		return item_no;
	}

	public void setItem_no(String item_no) {
		this.item_no = item_no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getVat() {
		return vat;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Bookkeeping getBookkeeping() {
		return bookkeeping;
	}

	public void setBookkeeping(Bookkeeping bookkeeping) {
		this.bookkeeping = bookkeeping;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "BaseItem [item_no=" + item_no + ", title=" + title + ", description=" + description + ", price=" + price
				+ ", vat=" + vat + ", unit=" + unit + ", bookkeeping=" + bookkeeping + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}	
}
