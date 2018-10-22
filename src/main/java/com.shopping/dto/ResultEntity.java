package com.shopping.dto;


public class ResultEntity<T> {

    private String  code;

    private String  message;

    private T body;

    public ResultEntity() {
    }

    public ResultEntity(String code, String message) {
        this(code,message,null);
    }

    public ResultEntity(String code, String message, T body) {
        this.code = code;
        this.message = message;
        this.body = body;
    }

    public String getCode() { return code; }

    public void setCode(String code) { this.code = code; }

    public String getMessage() { return message; }

    public void setMessage(String message) { this.message = message; }

    public T getBody() { return body; }

    public void setBody(T body) {
        this.body = body;
    }


}
