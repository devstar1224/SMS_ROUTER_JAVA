package com.sender.sms.response;

import com.sender.sms.entity.SMS;
import lombok.Getter;

@Getter
public class SMSResponse {

    private String sender;
    private String content;
    private String date;

    public SMSResponse(SMS entity) {
        sender = entity.getSender();
        content = entity.getContent();
        date = entity.getDate();
    }

}
