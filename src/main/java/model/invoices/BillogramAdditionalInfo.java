package model.invoices;

import java.sql.Timestamp;

public class BillogramAdditionalInfo {

	private String order_no;
	private String order_date;
	private String our_reference;
	private String your_reference;
	private Timestamp shipping_date;
	private Timestamp delivery_date;
	private String reference_number;
	private String message;
	
	public BillogramAdditionalInfo() {}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getOur_reference() {
		return our_reference;
	}

	public void setOur_reference(String our_reference) {
		this.our_reference = our_reference;
	}

	public String getYour_reference() {
		return your_reference;
	}

	public void setYour_reference(String your_reference) {
		this.your_reference = your_reference;
	}

	public Timestamp getShipping_date() {
		return shipping_date;
	}

	public void setShipping_date(Timestamp shipping_date) {
		this.shipping_date = shipping_date;
	}

	public Timestamp getDelivery_date() {
		return delivery_date;
	}

	public void setDelivery_date(Timestamp delivery_date) {
		this.delivery_date = delivery_date;
	}

	public String getReference_number() {
		return reference_number;
	}

	public void setReference_number(String reference_number) {
		this.reference_number = reference_number;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
