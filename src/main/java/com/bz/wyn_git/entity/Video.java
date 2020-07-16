package com.bz.wyn_git.entity;

public class Video {
    private String id;
    private String title;
    private String content;

    @Override
    public String toString() {
        return "video{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Video() {
    }

    public Video(String id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
