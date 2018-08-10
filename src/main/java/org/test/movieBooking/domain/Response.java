package org.test.movieBooking.domain;

public class Response {

    private String response;

    private int code;

    private String errorMessage;

    public Response(String response, int code, String errorMessage) {
        this.response = response;
        this.code = code;
        this.errorMessage = errorMessage;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
