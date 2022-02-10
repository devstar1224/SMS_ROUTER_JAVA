package com.sender.sms;

import com.sender.sms.dto.SMSDto;
import com.sender.sms.response.SMSResponse;
import com.sender.sms.service.SMSService;
import com.sender.sms.vo.SMSVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private SMSService smsService;

    @RequestMapping(method = RequestMethod.POST, path = "/")
    public void insertSMS(SMSVo reqBody) {
        smsService.insert(new SMSDto(reqBody));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public List<SMSResponse> getSMS() {
        return smsService.allList();
    }
}
