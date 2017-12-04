package model.invoices;



import java.util.Arrays;
import java.util.Date;

import api.Customer;
import model.customers.Customers;

public class InvoiceModel {

	private String id;
	private int invoice_no;
	private String ocr_number;
	private Customers customer;
	private Item[] items;
	private String invoice_date;
	private String due_date;
	private String due_days;
	private int invoice_fee;
	private String invoice_fee_vat;
	private String reminder_fee;
	private String interest_rate;
	private String interest_fee;
	private String currency;
	private BillogramAdditionalInfo info;
	private BillogramSwedishRegionalData regional_sweden;
	private String delivery_method;
	private String state;
	private String url;
	private String[] flags;
	private BillogramEvents[] events ;
	private String remaining_sum;
	private String total_sum;
	private String rounding_value;
	private boolean automatic_reminders;
	private BillogramAutomaticReminder[] automatic_reminders_settings;
	private String reminder_count;
	private Date created_at;
	private Date updated_at;
	private Date attested_at;
	private BillogramCallbacks callbacks;
	private String attachment;
	private BillogramAutomaticCollection automatic_collection;
	private DetailedSums detailed_sums;
	
	public InvoiceModel() {}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getInvoice_no() {
		return invoice_no;
	}
	public void setInvoice_no(int invoice_no) {
		this.invoice_no = invoice_no;
	}
	public String getOcr_number() {
		return ocr_number;
	}
	public void setOcr_number(String ocr_number) {
		this.ocr_number = ocr_number;
	}
	
	
	
	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}
	
	public String getInvoice_date() {
		return invoice_date;
	}

	public void setInvoice_date(String invoice_date) {
		this.invoice_date = invoice_date;
	}

	public String getDue_date() {
		return due_date;
	}
	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}
	public String getDue_days() {
		return due_days;
	}
	public void setDue_days(String due_days) {
		this.due_days = due_days;
	}
	public int getInvoice_fee() {
		return invoice_fee;
	}
	public void setInvoice_fee(int invoice_fee) {
		this.invoice_fee = invoice_fee;
	}
	public String getInvoice_fee_vat() {
		return invoice_fee_vat;
	}
	public void setInvoice_fee_vat(String invoice_fee_vat) {
		this.invoice_fee_vat = invoice_fee_vat;
	}
	public String getReminder_fee() {
		return reminder_fee;
	}
	public void setReminder_fee(String reminder_fee) {
		this.reminder_fee = reminder_fee;
	}
	public String getInterest_rate() {
		return interest_rate;
	}
	public void setInterest_rate(String interest_rate) {
		this.interest_rate = interest_rate;
	}
	public String getInterest_fee() {
		return interest_fee;
	}
	public void setInterest_fee(String interest_fee) {
		this.interest_fee = interest_fee;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public BillogramAdditionalInfo getInfo() {
		return info;
	}
	public void setInfo(BillogramAdditionalInfo info) {
		this.info = info;
	}
	
	public BillogramSwedishRegionalData getRegional_sweden() {
		return regional_sweden;
	}

	public void setRegional_sweden(BillogramSwedishRegionalData regional_sweden) {
		this.regional_sweden = regional_sweden;
	}

	public String getDelivery_method() {
		return delivery_method;
	}
	public void setDelivery_method(String delivery_method) {
		this.delivery_method = delivery_method;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String[] getFlags() {
		return flags;
	}
	public void setFlags(String[] flags) {
		this.flags = flags;
	}
	public BillogramEvents[] getEvents() {
		return events;
	}
	public void setEvents(BillogramEvents[] events) {
		this.events = events;
	}
	public String getRemaining_sum() {
		return remaining_sum;
	}
	public void setRemaining_sum(String remaining_sum) {
		this.remaining_sum = remaining_sum;
	}
	public String getTotal_sum() {
		return total_sum;
	}
	public void setTotal_sum(String total_sum) {
		this.total_sum = total_sum;
	}
	public String getRounding_value() {
		return rounding_value;
	}
	public void setRounding_value(String rounding_value) {
		this.rounding_value = rounding_value;
	}
	public boolean isAutomatic_reminders() {
		return automatic_reminders;
	}
	public void setAutomatic_reminders(boolean automatic_reminders) {
		this.automatic_reminders = automatic_reminders;
	}
	public BillogramAutomaticReminder[] getAutomatic_reminders_settings() {
		return automatic_reminders_settings;
	}
	public void setAutomatic_reminders_settings(BillogramAutomaticReminder[] automatic_reminders_settings) {
		this.automatic_reminders_settings = automatic_reminders_settings;
	}
	public String getReminder_count() {
		return reminder_count;
	}
	public void setReminder_count(String reminder_count) {
		this.reminder_count = reminder_count;
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
	public Date getAttested_at() {
		return attested_at;
	}
	public void setAttested_at(Date attested_at) {
		this.attested_at = attested_at;
	}
	public BillogramCallbacks getCallbacks() {
		return callbacks;
	}
	public void setCallbacks(BillogramCallbacks callbacks) {
		this.callbacks = callbacks;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public BillogramAutomaticCollection getAutomatic_collection() {
		return automatic_collection;
	}
	public void setAutomatic_collection(BillogramAutomaticCollection automatic_collection) {
		this.automatic_collection = automatic_collection;
	}
	public DetailedSums getDetailed_sums() {
		return detailed_sums;
	}
	public void setDetailed_sums(DetailedSums detailed_sums) {
		this.detailed_sums = detailed_sums;
	}

	@Override
	public String toString() {
		return "InvoiceModel [id=" + id + ", invoice_no=" + invoice_no + ", ocr_number=" + ocr_number + ", customer="
				+ customer.toString() + ", items=" + Arrays.toString(items) + ", invoice_date=" + invoice_date + ", due_date="
				+ due_date + ", due_days=" + due_days + ", url=" + url + ", created_at=" + created_at + ", updated_at="
				+ updated_at + ", attested_at=" + attested_at + "]";
	}
	
	
}
