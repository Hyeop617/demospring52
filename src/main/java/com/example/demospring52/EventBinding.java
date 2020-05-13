package com.example.demospring52;

public class EventBinding {
    Integer id;

    String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public EventBinding(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "EventBinding{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
