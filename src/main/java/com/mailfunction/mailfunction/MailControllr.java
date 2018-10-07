package com.mailfunction.mailfunction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.mail.internet.AddressException;
import javax.validation.Valid;
import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping("/mail")
public class MailControllr {

    @Autowired
    EmailServiceImpl emailService;

    @Autowired
    EmailSendipinMime emailSendipinMime;

    ResponseModel model=new ResponseModel();

    @PostMapping("sendmail")
    public ResponseEntity<?> sendEmail(@RequestBody @Valid SimpleMail simpleMail ){
        try {
            emailService.sendSimpleMessage(simpleMail.getTo(), simpleMail.getSubject(), simpleMail.getText(),simpleMail.getFrom());
            model.setStatus(true);
            model.setMessage("email sent");
            return new ResponseEntity<>(model, HttpStatus.OK);
        }catch(Exception e){
            model.setStatus(false);
            model.setMessage(e.getCause().getMessage());
            return new ResponseEntity<>(model,HttpStatus.BAD_REQUEST);
        }

    }

    @PostMapping("sendmail2")
    public ResponseEntity<?> sendEmail2(@RequestBody @Valid  MimeMail mimeMail) throws UnsupportedEncodingException, AddressException {
        emailSendipinMime.sendEmail(mimeMail);
        model.setStatus(true);
        model.setMessage("email sent");
        return new ResponseEntity<>(model, HttpStatus.OK);
    }

}
