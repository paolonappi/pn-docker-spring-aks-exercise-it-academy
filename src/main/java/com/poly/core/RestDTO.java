package com.poly.core;

/**
 * A Rest Message is an entity exchanged between the client and server
 * 
 * @author PNP
 *
 */
public class RestDTO {

	public RestDTO() {

		header = new RestHeader();

	}

	public RestHeader getHeader() {
		return header;
	}

	public void setHeader(RestHeader header) {
		this.header = header;
	}

	protected RestHeader header;

	public void setHeaderResultOK() {

		header.setResult(RestHeader.RESULT_OK);
	}

	public void setHeaderResultKOServiceError() {

		header.setResult(RestHeader.RESULT_KO);

		header.setMessage(RestHeader.MESSAGE_SERVICE_ERROR);
	}

	public void setHeaderResultKO() {

		header.setResult(RestHeader.RESULT_KO);
	}

	public void setHeaderResultOK(String message) {

		header.setResult(RestHeader.RESULT_OK);

		header.setMessage(message);
	}

	public void setHeaderResultKO(String message) {

		header.setResult(RestHeader.RESULT_KO);

		header.setMessage(message);
	}

	public void setHeaderResultKOInputNotValid() {

		header.setResult(RestHeader.RESULT_KO);

		header.setMessage(RestHeader.MESSAGE_INPUT_NOT_VALID);
	}

	public void setHeaderMessage(String message) {

		header.setMessage(message);
	}

	public void addHeaderError(String error) {

		header.getErros().add(error);
	}

	public void addHeaderAction(String action) {

		header.getActions().add(action);
	}

	public void addHeaderEvent(String event) {

		header.getEvents().add(event);
	}

	public boolean hasNoErros() {

		return (
				header.getErros().isEmpty() &&
				!(RestHeader.RESULT_KO.equalsIgnoreCase(header.getResult()))
		);

	}
	
	
	

}
