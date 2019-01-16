package com.threetier.domain;

public class Message {
    private int id;
    private String name;
    private String msgtime;
    private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsgtime() {
        return msgtime;
    }

    public void setMsgtime(String msgtime) {
        this.msgtime = msgtime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
