package May15;

public class Branch {
	private String manager_name;
	private String ifsc;
	//getter methods
	public String getMN() {
		return this.manager_name;
	}
	public String getifsc() {
		return this.ifsc;
	}
	//setter methods
	public void setMN(String manager_name) {
		this.manager_name = manager_name;
	}
	public void setifsc(String ifsc) {
		this.ifsc = ifsc;
	}
}
