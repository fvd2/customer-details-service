package com.fvd2.customerdetailsservice.model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

public class ErrorObject {
    private String timestamp;
    private int status;
    private List<String> errors;
    private String path;

    public ErrorObject(int status, List<String> errors, String path) {
        super();
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX").format(new Timestamp(System.currentTimeMillis()));
        this.status = status;
        this.errors = errors;
        this.path = path;
    }

    public ErrorObject(int status, String errors, String path) {
        super();
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX").format(new Timestamp(System.currentTimeMillis()));
        this.status = status;
        this.errors = Arrays.asList(errors);
        this.path = path;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public int getStatus() {
        return status;
    }

    public List<String> getErrors() {
        return errors;
    }

    public String getPath() {
        return path;
    }
}
