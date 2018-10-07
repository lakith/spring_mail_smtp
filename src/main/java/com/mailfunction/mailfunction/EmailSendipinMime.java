package com.mailfunction.mailfunction;

import it.ozimov.springboot.mail.model.Email;
import it.ozimov.springboot.mail.model.defaultimpl.DefaultEmail;
import it.ozimov.springboot.mail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.mail.internet.InternetAddress;
import java.io.UnsupportedEncodingException;

import static com.google.common.collect.Lists.newArrayList;

@Service
@Transactional
public class EmailSendipinMime {


    @Autowired
    private EmailService emailService;

    public void sendEmail(MimeMail mimeMail) throws UnsupportedEncodingException {
        final Email email = DefaultEmail.builder()
                .from(new InternetAddress(mimeMail.getFromAddress(),
                        mimeMail.getFromPersonal()))
                .to(newArrayList(
                        new InternetAddress(mimeMail.getToAddress(),
                                mimeMail.getToPersonal())))
                .subject(mimeMail.getSubject())
                .body(mimeMail.getBody())
                .encoding("UTF-8").build();

        emailService.send(email);
    }


}
