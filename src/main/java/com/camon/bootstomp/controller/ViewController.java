package com.camon.bootstomp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jooyong on 2015-11-30.
 */
@Controller
public class ViewController {

    @RequestMapping("/")
    public String goRoom() {
        return "room";
    }
}
