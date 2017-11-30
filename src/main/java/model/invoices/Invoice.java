package model.invoices;

import java.sql.Timestamp;

import api.Customer;

public class Invoice {

	private String id;
	private int invoice_no;
	private String ocr_number;
	private Customer customer;
	private Item[] items;
	private Timestamp invoice_date;
	private Timestamp due_date;
	private Timestamp due_days;
	private int invoice_fee;
	private int invoice_fee_vat;
	private int reminder_fee;
	private int interest_rate;
	private int interest_fee;
	private String currency;
	private BillogramAdditionalInfo info;
	private BillogramSwedishRegionalData billogramSwedishRegionalData;
	private String delivery_method;
	private String state;
	private String url;
	private String[] flags;
	private BillogramEvents[] events ;
	private int remaining_sum;
	private int total_sum;
	private int rounding_value;
	private boolean automatic_reminders;
	private BillogramAutomaticReminder[] automatic_reminders_settings;
	private int reminder_count;
	private Timestamp created_at;
	private Timestamp updated_at;
	private Timestamp attested_at;
	private BillogramCallbacks callbacks;
	private String attachment;
	private BillogramAutomaticCollection automatic_collection;
	private DetailedSums detailed_sums;
	public Invoice() {
		super();
	}
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
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}
	public Timestamp getInvoice_date() {
		return invoice_date;
	}
	public void setInvoice_date(Timestamp invoice_date) {
		this.invoice_date = invoice_date;
	}
	public Timestamp getDue_date() {
		return due_date;
	}
	public void setDue_date(Timestamp due_date) {
		this.due_date = due_date;
	}
	public Timestamp getDue_days() {
		return due_days;
	}
	public void setDue_days(Timestamp due_days) {
		this.due_days = due_days;
	}
	public int getInvoice_fee() {
		return invoice_fee;
	}
	public void setInvoice_fee(int invoice_fee) {
		this.invoice_fee = invoice_fee;
	}
	public int getInvoice_fee_vat() {
		return invoice_fee_vat;
	}
	public void setInvoice_fee_vat(int invoice_fee_vat) {
		this.invoice_fee_vat = invoice_fee_vat;
	}
	public int getReminder_fee() {
		return reminder_fee;
	}
	public void setReminder_fee(int reminder_fee) {
		this.reminder_fee = reminder_fee;
	}
	public int getInterest_rate() {
		return interest_rate;
	}
	public void setInterest_rate(int interest_rate) {
		this.interest_rate = interest_rate;
	}
	public int getInterest_fee() {
		return interest_fee;
	}
	public void setInterest_fee(int interest_fee) {
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
	public BillogramSwedishRegionalData getBillogramSwedishRegionalData() {
		return billogramSwedishRegionalData;
	}
	public void setBillogramSwedishRegionalData(BillogramSwedishRegionalData billogramSwedishRegionalData) {
		this.billogramSwedishRegionalData = billogramSwedishRegionalData;
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
	public int getRemaining_sum() {
		return remaining_sum;
	}
	public void setRemaining_sum(int remaining_sum) {
		this.remaining_sum = remaining_sum;
	}
	public int getTotal_sum() {
		return total_sum;
	}
	public void setTotal_sum(int total_sum) {
		this.total_sum = total_sum;
	}
	public int getRounding_value() {
		return rounding_value;
	}
	public void setRounding_value(int rounding_value) {
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
	public int getReminder_count() {
		return reminder_count;
	}
	public void setReminder_count(int reminder_count) {
		this.reminder_count = reminder_count;
	}
	public Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	public Timestamp getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}
	public Timestamp getAttested_at() {
		return attested_at;
	}
	public void setAttested_at(Timestamp attested_at) {
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
	
}
