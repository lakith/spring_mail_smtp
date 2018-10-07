package com.mailfunction.mailfunction;

import javax.validation.constraints.*;

public class SimpleMail {

    @NotNull
    @NotBlank
    @NotEmpty
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$", message="Email Must be in Correct Format")
    private String to;
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
    private String text;
    @NotNull
    @NotBlank
    @NotEmpty
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$", message="Email Must be in Correct Format")
    private String from;

    public SimpleMail() {
    }

    public SimpleMail(String to, String subject, String text, String from) {
        this.to = to;
        this.subject = subject;
        this.text = text;
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
