package com.sender.sms.service;

import com.sender.sms.dto.SMSDto;
import com.sender.sms.repository.SMSRepository;
import com.sender.sms.response.SMSResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class SMSService {

    @Autowired
    private SMSRepository smsRepository;

    public Long insert(SMSDto smsDto) {
        return smsRepository.save(smsDto.toEntity()).getId();
    }

    public List<SMSResponse> allList() {
        return smsRepository.findAllByOrderByIdDesc().stream()
                .map(SMSResponse::new)
                .collect(Collectors.toList());
    }
}
