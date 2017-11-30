package model.item;

public class Bookkeeping {

	private String income_account;
	private String vat_account;
	
	public Bookkeeping() {
	}
	
	public String getIncome_account() {
		return income_account;
	}
	public void setIncome_account(String income_account) {
		this.income_account = income_account;
	}
	public String getVat_account() {
		return vat_account;
	}
	public void setVat_account(String vat_account) {
		this.vat_account = vat_account;
	}
}
