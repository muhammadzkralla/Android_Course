package com.zkrallah.fragments.model;

public class Chat {
    String name;
    String message;
    int img;

    public Chat(String name, String message, int img) {
        this.name = name;
        this.message = message;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
