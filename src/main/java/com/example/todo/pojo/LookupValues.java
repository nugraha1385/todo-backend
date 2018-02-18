package com.example.todo.pojo;

/**
 * Created by Indrap on 23/01/2018.
 */
public class LookupValues {
    private String key;
    private String text;
    private String value;

    public LookupValues(String key, String text, String value) {
        this.key = key;
        this.text = text;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
