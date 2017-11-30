package model.invoices;

public class BillogramAutomaticReminder {

	private float delay_days;
	private String message;
	
	public BillogramAutomaticReminder() {}

	public float getDelay_days() {
		return delay_days;
	}

	public void setDelay_days(float delay_days) {
		this.delay_days = delay_days;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
