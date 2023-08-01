package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ticket {
	
	String  Date_Time;
	String Incident_description;
	String Server_name;
	String Severity;
	
	public Ticket( String ticketType, String customerdetails,String phone,String Severity) {
	
		this.Date_Time = ticketType;
		this.Incident_description = customerdetails;
		this.Server_name=phone;
		this.Severity=Severity;		
	}
	

	public String getIncident_description() {
		return Incident_description;
	}

	public void setIncident_description(String Incident_description) {
		this.Incident_description = Incident_description;
	}
	

	public String getDate_Time() {
		return Date_Time;
	}

	public void setDate_Time(String Date_Time) {
		this.Date_Time = Date_Time;
	}
	

	public String getServer_name() {
		return Server_name;
	}
	public void setServer_name(String Server_name) {
		this.Server_name = Server_name;
	}
	
	public String getSeverity() {
		return Severity;
	}

	public void setSeverity(String Severity) {
		this.Severity = Severity;
	}
	
	

	@Override
	public String toString() {
		return "Incident [Incident_description=" + Incident_description + ", Date_time=" + Date_Time + ", Server_name=" + Incident_description + "]";
	}

	
	
	

}
