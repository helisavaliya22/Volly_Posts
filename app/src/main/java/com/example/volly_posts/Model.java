package com.example.volly_posts;

public class Model {
    int id;
    String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    String body;

    public Model(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }
}
