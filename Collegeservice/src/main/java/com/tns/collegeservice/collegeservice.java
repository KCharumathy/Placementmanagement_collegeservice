package com.tns.collegeservice;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class collegeservice 
	
	{
		private Integer company_id;
		private String company_name;
		private String email_id;
		private Integer phone_no;
		private Integer date;
		
		
		
		public collegeservice() {
			super();
		}
		
		public collegeservice(Integer company_id, String company_name, String email_id, Integer phone_no,
				Integer date) {
			super();
			this.company_id = company_id;
			this.company_name = company_name;
			this.email_id = email_id;
			this.phone_no = phone_no;
			this.date = date;
		}

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		
		

		public Integer getCompany_id() {
			return company_id;
		}

		public void setCompany_id(Integer company_id) {
			this.company_id = company_id;
		}

		public String getCompany_name() {
			return company_name;
		}

		public void setCompany_name(String company_name) {
			this.company_name = company_name;
		}

		public String getEmail_id() {
			return email_id;
		}

		public void setEmail_id(String email_id) {
			this.email_id = email_id;
		}

		public Integer getPhone_no() {
			return phone_no;
		}

		public void setPhone_no(Integer phone_no) {
			this.phone_no = phone_no;
		}

		public Integer getDate() {
			return date;
		}
	

		public void setDate(Integer date) {
			this.date = date;
		}
		
			@Override
			public String toString() {
				return "collegeservice [company_id=" + company_id + ", company_name=" + company_name + ", email_id="
						+ email_id + ", phone_no=" + phone_no + ", date=" + date + "]";
			}
		
	}



