package com.latihan.restful.model.response;

import lombok.Builder;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
@Builder
public class WebErrorResponse {
    private Integer status;
    private String message;
    private List<String> errors;

    public WebErrorResponse(Integer status, String message, List<String> errors) {
        super();
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

    public WebErrorResponse(Integer status, String message, String error) {
        super();
        this.status = status;
        this.message = message;
        this.errors = Arrays.asList(error);
    }
}
