package com.poly.core;

import java.util.ArrayList;
import java.util.List;

public class RestHeader {

public static final String RESULT_OK ="OK";
	
	public static final String RESULT_KO ="KO";
		
	public static final String MESSAGE_INPUT_NOT_VALID ="INPUT_NOT_VALID";
	
	public static final String MESSAGE_SERVICE_ERROR ="SERVICE_ERROR";
	
	public static final String BLANK_STRING ="";
	
	private String result =BLANK_STRING;
	
	private List<String> erros = new ArrayList<>();
	
	private List<String> warnings = new ArrayList<>();
	
	private List<String> actions = new ArrayList<>();
	
	private List<String> events = new ArrayList<>();
	
	
	public List<String> getEvents() {
		return events;
	}

	public void setEvents(List<String> events) {
		this.events = events;
	}

	public List<String> getWarnings() {
		return warnings;
	}

	public void setWarnings(List<String> warnings) {
		this.warnings = warnings;
	}

	public List<String> getActions() {
		return actions;
	}

	public void setActions(List<String> actions) {
		this.actions = actions;
	}

	private String message="";
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public List<String> getErros() {
		return erros;
	}

	public void setErros(List<String> erros) {
		this.erros = erros;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
