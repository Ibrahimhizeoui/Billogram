package model.invoices;

import java.sql.Timestamp;

public class BilogramEventData {

	private String invoice_no;
	private String delivery_method;
	private String original_delivery_method;
	private boolean delivery_redirected;
	private String letter_id;
	private int amount;
	private String payer_name;
	private String[] payment_flags;
	private float banking_amount;
	private boolean manual;
	private float reminder_fee;
	private float reminder_count;
	private float interest_rate;
	private String customer_email;
	private String customer_phone;
	private String ip;
	private String type;
	private String message;
	private String full_status;
	private String collector_method;
	private String collector_reference;
	private String factoring_method;
	private String factoring_reference;
	private float sells_for;
	private float sold_for;
	private String bankgiro;
	private String recipient_identifier;
	private String error_status	;
	private float total_sum;
	private float remaining_sum;
	private boolean scanning_central;
	private float offer_id;
	private float sale_type;
	private Timestamp accepted_at;
	private int customer_no;
	private String item_title;
	private float item_price;
	private String item_type;
	
	public BilogramEventData() {}

	public String getInvoice_no() {
		return invoice_no;
	}

	public void setInvoice_no(String invoice_no) {
		this.invoice_no = invoice_no;
	}

	public String getDelivery_method() {
		return delivery_method;
	}

	public void setDelivery_method(String delivery_method) {
		this.delivery_method = delivery_method;
	}

	public String getOriginal_delivery_method() {
		return original_delivery_method;
	}

	public void setOriginal_delivery_method(String original_delivery_method) {
		this.original_delivery_method = original_delivery_method;
	}

	public boolean isDelivery_redirected() {
		return delivery_redirected;
	}

	public void setDelivery_redirected(boolean delivery_redirected) {
		this.delivery_redirected = delivery_redirected;
	}

	public String getLetter_id() {
		return letter_id;
	}

	public void setLetter_id(String letter_id) {
		this.letter_id = letter_id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getPayer_name() {
		return payer_name;
	}

	public void setPayer_name(String payer_name) {
		this.payer_name = payer_name;
	}

	public String[] getPayment_flags() {
		return payment_flags;
	}

	public void setPayment_flags(String[] payment_flags) {
		this.payment_flags = payment_flags;
	}

	public float getBanking_amount() {
		return banking_amount;
	}

	public void setBanking_amount(float banking_amount) {
		this.banking_amount = banking_amount;
	}

	public boolean isManual() {
		return manual;
	}

	public void setManual(boolean manual) {
		this.manual = manual;
	}

	public float getReminder_fee() {
		return reminder_fee;
	}

	public void setReminder_fee(float reminder_fee) {
		this.reminder_fee = reminder_fee;
	}

	public float getReminder_count() {
		return reminder_count;
	}

	public void setReminder_count(float reminder_count) {
		this.reminder_count = reminder_count;
	}

	public float getInterest_rate() {
		return interest_rate;
	}

	public void setInterest_rate(float interest_rate) {
		this.interest_rate = interest_rate;
	}

	public String getCustomer_email() {
		return customer_email;
	}

	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}

	public String getCustomer_phone() {
		return customer_phone;
	}

	public void setCustomer_phone(String customer_phone) {
		this.customer_phone = customer_phone;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFull_status() {
		return full_status;
	}

	public void setFull_status(String full_status) {
		this.full_status = full_status;
	}

	public String getCollector_method() {
		return collector_method;
	}

	public void setCollector_method(String collector_method) {
		this.collector_method = collector_method;
	}

	public String getCollector_reference() {
		return collector_reference;
	}

	public void setCollector_reference(String collector_reference) {
		this.collector_reference = collector_reference;
	}

	public String getFactoring_method() {
		return factoring_method;
	}

	public void setFactoring_method(String factoring_method) {
		this.factoring_method = factoring_method;
	}

	public String getFactoring_reference() {
		return factoring_reference;
	}

	public void setFactoring_reference(String factoring_reference) {
		this.factoring_reference = factoring_reference;
	}

	public float getSells_for() {
		return sells_for;
	}

	public void setSells_for(float sells_for) {
		this.sells_for = sells_for;
	}

	public float getSold_for() {
		return sold_for;
	}

	public void setSold_for(float sold_for) {
		this.sold_for = sold_for;
	}

	public String getBankgiro() {
		return bankgiro;
	}

	public void setBankgiro(String bankgiro) {
		this.bankgiro = bankgiro;
	}

	public String getRecipient_identifier() {
		return recipient_identifier;
	}

	public void setRecipient_identifier(String recipient_identifier) {
		this.recipient_identifier = recipient_identifier;
	}

	public String getError_status() {
		return error_status;
	}

	public void setError_status(String error_status) {
		this.error_status = error_status;
	}

	public float getTotal_sum() {
		return total_sum;
	}

	public void setTotal_sum(float total_sum) {
		this.total_sum = total_sum;
	}

	public float getRemaining_sum() {
		return remaining_sum;
	}

	public void setRemaining_sum(float remaining_sum) {
		this.remaining_sum = remaining_sum;
	}

	public boolean isScanning_central() {
		return scanning_central;
	}

	public void setScanning_central(boolean scanning_central) {
		this.scanning_central = scanning_central;
	}

	public float getOffer_id() {
		return offer_id;
	}

	public void setOffer_id(float offer_id) {
		this.offer_id = offer_id;
	}

	public float getSale_type() {
		return sale_type;
	}

	public void setSale_type(float sale_type) {
		this.sale_type = sale_type;
	}

	public Timestamp getAccepted_at() {
		return accepted_at;
	}

	public void setAccepted_at(Timestamp accepted_at) {
		this.accepted_at = accepted_at;
	}

	public int getCustomer_no() {
		return customer_no;
	}

	public void setCustomer_no(int customer_no) {
		this.customer_no = customer_no;
	}

	public String getItem_title() {
		return item_title;
	}

	public void setItem_title(String item_title) {
		this.item_title = item_title;
	}

	public float getItem_price() {
		return item_price;
	}

	public void setItem_price(float item_price) {
		this.item_price = item_price;
	}

	public String getItem_type() {
		return item_type;
	}

	public void setItem_type(String item_type) {
		this.item_type = item_type;
	}
	
}
