package com.sender.sms.dto;

import com.sender.sms.entity.SMS;
import com.sender.sms.vo.SMSVo;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SMSDto {

    private String sender;
    private String content;
    private String date;

    @Builder
    public SMSDto(SMSVo vo) {
        sender = vo.getSender();
        content = vo.getContent();
        date = vo.getDate();
    }

    public SMS toEntity() {
        return SMS.builder()
                .content(content)
                .date(date)
                .sender(sender)
                .build();
    }
}
