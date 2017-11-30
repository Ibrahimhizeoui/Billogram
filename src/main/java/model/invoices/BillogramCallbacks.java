package model.invoices;

public class BillogramCallbacks {

	private String url;
	private String custom;
	private String sign_key;
	
	public BillogramCallbacks() {}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCustom() {
		return custom;
	}
	public void setCustom(String custom) {
		this.custom = custom;
	}
	public String getSign_key() {
		return sign_key;
	}
	public void setSign_key(String sign_key) {
		this.sign_key = sign_key;
	}
	
}
