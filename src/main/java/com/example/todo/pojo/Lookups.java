package com.example.todo.pojo;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by Indrap on 23/01/2018.
 */
public class Lookups {

    @Id
    private String id;
    private String key;
    private List<LookupValues> values;

    public Lookups(String key, List<LookupValues> values) {
        this.key = key;
        this.values = values;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<LookupValues> getValues() {
        return values;
    }

    public void setValues(List<LookupValues> values) {
        this.values = values;
    }
}
