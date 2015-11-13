package com.camon.bootstomp;

import lombok.Data;

/**
 * Created by jooyong on 2015-11-13.
 */
@Data
public class Greeting {
    private String content;

    public Greeting(String content) {
        this.content = content;
    }
}
