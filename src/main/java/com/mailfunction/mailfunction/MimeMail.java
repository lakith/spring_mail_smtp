package com.mailfunction.mailfunction;

import javax.validation.constraints.*;

public class MimeMail {

    @NotNull
    @NotBlank
    @NotEmpty
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$", message="Email Must be in Correct Format")
    private String fromAddress;
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 2)
    @Pattern(regexp = "^([A-Za-z0-9_\\s])*$")
    private String fromPersonal;
    @NotNull
    @NotBlank
    @NotEmpty
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$", message="Email Must be in Correct Format")
    private String toAddress;
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 2)
    @Pattern(regexp = "^([A-Za-z0-9_\\s])*$")
    private String toPersonal;
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 2)
    @Pattern(regexp = "^([A-Za-z0-9_\\s])*$")
    private String subject;
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 2)
    @Pattern(regexp = "^([A-Za-z0-9_\\s])*$")
    private String body;

    public MimeMail() {
    }

    public MimeMail(String fromAddress, String fromPersonal, String toAddress, String toPersonal, String subject, String body) {
        this.fromAddress = fromAddress;
        this.fromPersonal = fromPersonal;
        this.toAddress = toAddress;
        this.toPersonal = toPersonal;
        this.subject = subject;
        this.body = body;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getFromPersonal() {
        return fromPersonal;
    }

    public void setFromPersonal(String fromPersonal) {
        this.fromPersonal = fromPersonal;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getToPersonal() {
        return toPersonal;
    }

    public void setToPersonal(String toPersonal) {
        this.toPersonal = toPersonal;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
