package br.com.devdojo.awesome.error;

public class CustomErrorType {
	private String errorMessage;

	public CustomErrorType(String errorMessagem) {
		this.errorMessage = errorMessagem;
	}

	public String getErrorMessagem() {
		return errorMessage;
	}
}
