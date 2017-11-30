package model.customers;

import java.sql.Timestamp;

public class Customers {
	private int customer_no;
	private String name;
	private String notes;
	private String org_no;
	private String vat_no;
	private Contact contact;
	private Address address;
	private DeliveryAddress delivery_address;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private String company_type;
	public Customers() {
		super();
	}
	public int getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(int customerNo) {
		this.customer_no = customerNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getOrg_no() {
		return org_no;
	}
	public void setOrg_no(String org_no) {
		this.org_no = org_no;
	}
	public String getVat_no() {
		return vat_no;
	}
	public void setVat_no(String vat_no) {
		this.vat_no = vat_no;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public DeliveryAddress getDelivery_address() {
		return delivery_address;
	}
	public void setDelivery_address(DeliveryAddress delivery_address) {
		this.delivery_address = delivery_address;
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
	public String getCompany_type() {
		return company_type;
	}
	public void setCompany_type(String company_type) {
		this.company_type = company_type;
	}
}
