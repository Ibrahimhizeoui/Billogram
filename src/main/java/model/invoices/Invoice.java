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
	private AutomaticReminder automatic_reminders_settings;
	private int reminder_count;
	private Timestamp created_at;
	private Timestamp updated_at;
	private Timestamp attested_at;
	private BillogramCallbacks callbacks;
	private String attachment;
	private AutomaticCollection automatic_collection;
	//detailed_sums
	
}
