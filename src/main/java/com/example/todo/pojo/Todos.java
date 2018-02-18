package com.example.todo.pojo;

import org.springframework.data.annotation.Id;

/**
 * Created by Indrap on 19/01/2018.
 */
public class Todos {

    @Id
    private String id;
    private int no;
    private String description;
    private String status;
    private String priority;
    private String userId;

    public Todos(){

    }

    public Todos(String id, int no, String description, String status, String priority) {
        this.id = id;
        this.no = no;
        this.description = description;
        this.status = status;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
