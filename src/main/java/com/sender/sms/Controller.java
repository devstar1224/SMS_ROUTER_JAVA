package com.sender.sms;

import com.sender.sms.dto.SMSDto;
import com.sender.sms.repository.SMSRepository;
import com.sender.sms.vo.SMSVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private SMSRepository smsRepository;

    @RequestMapping(method = RequestMethod.POST, path = "/")
    public void insertSMS(SMSVo reqBody) {
        smsRepository.save(new SMSDto(reqBody).toEntity());
    }
}
