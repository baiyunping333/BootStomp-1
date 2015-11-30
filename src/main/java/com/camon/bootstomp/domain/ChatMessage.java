package com.camon.bootstomp.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by jooyong on 2015-11-13.
 */
@Data
public class ChatMessage {
    private String name;

    private String message;

    private Date sendDate;
}
