package ru.android.chatclient;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {
    private String fromName, message;
    private boolean fromMe;
    private Date date;

    public Message() {
    }

    public Message(String fromName, String message, boolean fromMe, Date date) {
        this.fromName = fromName;
        this.message = message;
        this.fromMe = fromMe;
        this.date = date;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isFromMe() {
        return fromMe;
    }

    public void setFromMe(boolean fromMe) {
        this.fromMe = fromMe;
    }

    public String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        return sdf.format(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {

        SimpleDateFormat sdf = new SimpleDateFormat("h:mm a");

        return sdf.format(date);

    }
}