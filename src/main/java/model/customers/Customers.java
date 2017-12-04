package model.customers;

import java.sql.Timestamp;
import java.util.Date;

public class Customers {
	private int customer_no;
	private String name;
	private String notes;
	private String org_no;
	private String vat_no;
	private Contact contact;
	private Address address;
	private DeliveryAddress delivery_address;
	private Date created_at;
	private Date updated_at;
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
	
	
	
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public String getCompany_type() {
		return company_type;
	}
	public void setCompany_type(String company_type) {
		this.company_type = company_type;
	}
	@Override
	public String toString() {
		return "Customers [customer_no=" + customer_no + ", name=" + name + ", notes=" + notes + ", org_no=" + org_no
				+ ", vat_no=" + vat_no + ", contact=" + contact + ", address=" + address + ", delivery_address="
				+ delivery_address + ", createdAt=" + created_at + ", updatedAt=" + updated_at + ", company_type="
				+ company_type + "]";
	}
	
	
}
