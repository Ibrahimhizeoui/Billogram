package model.invoices;

import java.sql.Timestamp;

public class BillogramEvents {

	private Timestamp created_at;
	private String type;
	private BilogramEventData data;
	
	public BillogramEvents() {}
	
	public Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public BilogramEventData getData() {
		return data;
	}
	public void setData(BilogramEventData data) {
		this.data = data;
	}
	
}
