package model.invoices;

public class BillogramAutomaticCollection {

	private int delay_days;
	private float amount;
	
	public BillogramAutomaticCollection() {}

	public int getDelay_days() {
		return delay_days;
	}

	public void setDelay_days(int delay_days) {
		this.delay_days = delay_days;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
	
}
