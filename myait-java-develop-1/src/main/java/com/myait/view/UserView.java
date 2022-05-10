package com.myait.view;

public class UserView {
	
	private String first_name;
	private String last_name;
	private String desgination;
	private String ait_email;
	private long contact_number;

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDesgination() {
		return desgination;
	}

	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}

	public String getAit_email() {
		return ait_email;
	}

	public void setAit_email(String ait_email) {
		this.ait_email = ait_email;
	}

	public long getContact_number() {
		return contact_number;
	}

	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}

	public UserView(String first_name, String last_name, String desgination, String ait_email, long contact_number) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.desgination = desgination;
		this.ait_email = ait_email;
		this.contact_number = contact_number;
	}

	public UserView() {

	}

}