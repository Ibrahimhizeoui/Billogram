package model.invoices;

public class DetailedSums {

	private float invoice_fee;
	private float invoice_fee_vat;
	private float net_sum;
	private float vat_sum;
	private float gross_sum;
	private float rounding;
	private float reminder_fee;
	private float interest_fee;
	private float paid_sum;
	private float collector_paid_sum;
	private float remaining_sum;
	private BillogramSwedishRegionalData regional_sweden;
	
	public DetailedSums() {}
	
	public float getInvoice_fee() {
		return invoice_fee;
	}
	public void setInvoice_fee(float invoice_fee) {
		this.invoice_fee = invoice_fee;
	}
	public float getInvoice_fee_vat() {
		return invoice_fee_vat;
	}
	public void setInvoice_fee_vat(float invoice_fee_vat) {
		this.invoice_fee_vat = invoice_fee_vat;
	}
	public float getNet_sum() {
		return net_sum;
	}
	public void setNet_sum(float net_sum) {
		this.net_sum = net_sum;
	}
	public float getVat_sum() {
		return vat_sum;
	}
	public void setVat_sum(float vat_sum) {
		this.vat_sum = vat_sum;
	}
	public float getGross_sum() {
		return gross_sum;
	}
	public void setGross_sum(float gross_sum) {
		this.gross_sum = gross_sum;
	}
	public float getRounding() {
		return rounding;
	}
	public void setRounding(float rounding) {
		this.rounding = rounding;
	}
	public float getReminder_fee() {
		return reminder_fee;
	}
	public void setReminder_fee(float reminder_fee) {
		this.reminder_fee = reminder_fee;
	}
	public float getInterest_fee() {
		return interest_fee;
	}
	public void setInterest_fee(float interest_fee) {
		this.interest_fee = interest_fee;
	}
	public float getPaid_sum() {
		return paid_sum;
	}
	public void setPaid_sum(float paid_sum) {
		this.paid_sum = paid_sum;
	}
	public float getCollector_paid_sum() {
		return collector_paid_sum;
	}
	public void setCollector_paid_sum(float collector_paid_sum) {
		this.collector_paid_sum = collector_paid_sum;
	}
	public float getRemaining_sum() {
		return remaining_sum;
	}
	public void setRemaining_sum(float remaining_sum) {
		this.remaining_sum = remaining_sum;
	}
	public BillogramSwedishRegionalData getRegional_sweden() {
		return regional_sweden;
	}
	public void setRegional_sweden(BillogramSwedishRegionalData regional_sweden) {
		this.regional_sweden = regional_sweden;
	}
	
}
