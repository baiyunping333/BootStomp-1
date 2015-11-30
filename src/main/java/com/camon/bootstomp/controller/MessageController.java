package com.camon.bootstomp.controller;

import com.camon.bootstomp.domain.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Date;

/**
 * Created by jooyong on 2015-11-13.
 */
@Controller
public class MessageController {

    @MessageMapping("/room1")
    @SendTo("/topic/room1")
    public ChatMessage sendMessage(ChatMessage chatMessage) {
        chatMessage.setSendDate(new Date());
        return chatMessage;
    }


}
