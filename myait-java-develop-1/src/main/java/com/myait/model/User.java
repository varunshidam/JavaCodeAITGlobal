package com.myait.model;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "user")
//@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User {
	@Id
	private int user_id;
	private String ait_id;
	private int dept_id;
	private String first_name;
	private String last_name;
	private Date dob;
	private Date doj;
	private Blob user_image;
	private String ait_email;
	private long contact_number;
	private String password;
	private int reporting_manager_id;
	private String designation;
	private String bench_status;
	private String user_type;
	private String user_status;
	private int created_by;
	private Date created_date;
	private int modified_by;
	private Date modified_date;

	public User() {

	}

	public User(int user_id, String ait_id, int dept_id, String first_name, String last_name, Date dob, Date doj,
			Blob user_image, String ait_email, long contact_number, String password, int reporting_manager_id,
			String designation, String bench_status, String user_type, String user_status, int created_by,
			Date created_date, int modified_by, Date modified_date) {
		this.user_id = user_id;
		this.ait_id = ait_id;
		this.dept_id = dept_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.dob = dob;
		this.doj = doj;
		this.user_image = user_image;
		this.ait_email = ait_email;
		this.contact_number = contact_number;
		this.password = password;
		this.reporting_manager_id = reporting_manager_id;
		this.designation = designation;
		this.bench_status = bench_status;
		this.user_type = user_type;
		this.user_status = user_status;
		this.created_by = created_by;
		this.created_date = created_date;
		this.modified_by = modified_by;
		this.modified_date = modified_date;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getAit_id() {
		return ait_id;
	}

	public void setAit_id(String ait_id) {
		this.ait_id = ait_id;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Blob getUser_image() {
		return user_image;
	}

	public void setUser_image(Blob user_image) {
		this.user_image = user_image;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getReporting_manager_id() {
		return reporting_manager_id;
	}

	public void setReporting_manager_id(int reporting_manager_id) {
		this.reporting_manager_id = reporting_manager_id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getBench_status() {
		return bench_status;
	}

	public void setBench_status(String bench_status) {
		this.bench_status = bench_status;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getUser_status() {
		return user_status;
	}

	public void setUser_status(String user_status) {
		this.user_status = user_status;
	}

	public int getCreated_by() {
		return created_by;
	}

	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public int getModified_by() {
		return modified_by;
	}

	public void setModified_by(int modified_by) {
		this.modified_by = modified_by;
	}

	public Date getModified_date() {
		return modified_date;
	}

	public void setModified_date(Date modified_date) {
		this.modified_date = modified_date;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", ait_id=" + ait_id + ", dept_id=" + dept_id + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", dob=" + dob + ", doj=" + doj + ", user_image=" + user_image
				+ ", ait_email=" + ait_email + ", contact_number=" + contact_number + ", password=" + password
				+ ", reporting_manager_id=" + reporting_manager_id + ", designation=" + designation + ", bench_status="
				+ bench_status + ", user_type=" + user_type + ", user_status=" + user_status + ", created_by="
				+ created_by + ", created_date=" + created_date + ", modified_by=" + modified_by + ", modified_date="
				+ modified_date + "]";
	}
	
	

	
}
