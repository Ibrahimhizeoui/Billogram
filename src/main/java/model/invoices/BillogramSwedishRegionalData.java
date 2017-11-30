package model.invoices;

import java.sql.Timestamp;

public class BillogramSwedishRegionalData {
	
	private int rotavdrag;
	private String rotavdrag_personal_number;
	private String rotavdrag_description;
	private String rotavdrag_description_of_property;
	private String rotavdrag_apartment_designation;
	private String rotavdrag_housing_association_org_no;
	private boolean reversed_vat;
	private String autogiro_betalarnummer;
	private Timestamp autogiro_payment_date;
	private String autogiro_status;
	private String autogiro_full_status;
	private int autogiro_total_sum;
	private String efaktura_recipient_identifier;
	private String efaktura_recipient_type;
	private String efaktura_recipient_bank_name;
	private int efaktura_recipient_bank_id;
	private String efaktura_recipient_bank_code;
	private long efaktura_recipient_id_number;
	private int efaktura_requested_amount;
	private ElectricityCollection electricity_collection;
	
	public BillogramSwedishRegionalData() {}

	public int getRotavdrag() {
		return rotavdrag;
	}

	public void setRotavdrag(int rotavdrag) {
		this.rotavdrag = rotavdrag;
	}

	public String getRotavdrag_personal_number() {
		return rotavdrag_personal_number;
	}

	public void setRotavdrag_personal_number(String rotavdrag_personal_number) {
		this.rotavdrag_personal_number = rotavdrag_personal_number;
	}

	public String getRotavdrag_description() {
		return rotavdrag_description;
	}

	public void setRotavdrag_description(String rotavdrag_description) {
		this.rotavdrag_description = rotavdrag_description;
	}

	public String getRotavdrag_description_of_property() {
		return rotavdrag_description_of_property;
	}

	public void setRotavdrag_description_of_property(String rotavdrag_description_of_property) {
		this.rotavdrag_description_of_property = rotavdrag_description_of_property;
	}

	public String getRotavdrag_apartment_designation() {
		return rotavdrag_apartment_designation;
	}

	public void setRotavdrag_apartment_designation(String rotavdrag_apartment_designation) {
		this.rotavdrag_apartment_designation = rotavdrag_apartment_designation;
	}

	public String getRotavdrag_housing_association_org_no() {
		return rotavdrag_housing_association_org_no;
	}

	public void setRotavdrag_housing_association_org_no(String rotavdrag_housing_association_org_no) {
		this.rotavdrag_housing_association_org_no = rotavdrag_housing_association_org_no;
	}

	public boolean isReversed_vat() {
		return reversed_vat;
	}

	public void setReversed_vat(boolean reversed_vat) {
		this.reversed_vat = reversed_vat;
	}

	public String getAutogiro_betalarnummer() {
		return autogiro_betalarnummer;
	}

	public void setAutogiro_betalarnummer(String autogiro_betalarnummer) {
		this.autogiro_betalarnummer = autogiro_betalarnummer;
	}

	public Timestamp getAutogiro_payment_date() {
		return autogiro_payment_date;
	}

	public void setAutogiro_payment_date(Timestamp autogiro_payment_date) {
		this.autogiro_payment_date = autogiro_payment_date;
	}

	public String getAutogiro_status() {
		return autogiro_status;
	}

	public void setAutogiro_status(String autogiro_status) {
		this.autogiro_status = autogiro_status;
	}

	public String getAutogiro_full_status() {
		return autogiro_full_status;
	}

	public void setAutogiro_full_status(String autogiro_full_status) {
		this.autogiro_full_status = autogiro_full_status;
	}

	public int getAutogiro_total_sum() {
		return autogiro_total_sum;
	}

	public void setAutogiro_total_sum(int autogiro_total_sum) {
		this.autogiro_total_sum = autogiro_total_sum;
	}

	public String getEfaktura_recipient_identifier() {
		return efaktura_recipient_identifier;
	}

	public void setEfaktura_recipient_identifier(String efaktura_recipient_identifier) {
		this.efaktura_recipient_identifier = efaktura_recipient_identifier;
	}

	public String getEfaktura_recipient_type() {
		return efaktura_recipient_type;
	}

	public void setEfaktura_recipient_type(String efaktura_recipient_type) {
		this.efaktura_recipient_type = efaktura_recipient_type;
	}

	public String getEfaktura_recipient_bank_name() {
		return efaktura_recipient_bank_name;
	}

	public void setEfaktura_recipient_bank_name(String efaktura_recipient_bank_name) {
		this.efaktura_recipient_bank_name = efaktura_recipient_bank_name;
	}

	public int getEfaktura_recipient_bank_id() {
		return efaktura_recipient_bank_id;
	}

	public void setEfaktura_recipient_bank_id(int efaktura_recipient_bank_id) {
		this.efaktura_recipient_bank_id = efaktura_recipient_bank_id;
	}

	public String getEfaktura_recipient_bank_code() {
		return efaktura_recipient_bank_code;
	}

	public void setEfaktura_recipient_bank_code(String efaktura_recipient_bank_code) {
		this.efaktura_recipient_bank_code = efaktura_recipient_bank_code;
	}

	public long getEfaktura_recipient_id_number() {
		return efaktura_recipient_id_number;
	}

	public void setEfaktura_recipient_id_number(long efaktura_recipient_id_number) {
		this.efaktura_recipient_id_number = efaktura_recipient_id_number;
	}

	public int getEfaktura_requested_amount() {
		return efaktura_requested_amount;
	}

	public void setEfaktura_requested_amount(int efaktura_requested_amount) {
		this.efaktura_requested_amount = efaktura_requested_amount;
	}

	public ElectricityCollection getElectricity_collection() {
		return electricity_collection;
	}

	public void setElectricity_collection(ElectricityCollection electricity_collection) {
		this.electricity_collection = electricity_collection;
	}
		
}
