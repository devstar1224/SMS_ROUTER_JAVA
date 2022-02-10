package com.sender.sms.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "receive")
@Builder
public class SMS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id", unique = true, nullable = false)
    private Long id;

    @Column
    private String sender;

    @Column
    private String content;

    @Column
    private String date;

    @Builder
    public SMS(Long id, String sender, String content, String date) {
        this.sender = sender;
        this.content = content;
        this.date = date;
    }
}
