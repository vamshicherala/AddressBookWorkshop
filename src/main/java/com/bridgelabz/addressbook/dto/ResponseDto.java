package com.bridgelabz.addressbook.dto;

import lombok.Data;


public @Data class ResponseDto {
    private String message;
	private Object data;
    public void ResponseDTO(String message, Object data) {
		super();
		this.message = message;
		this.data = data;
	}
}
