package com.bz.wyn_git.entity;

public class Category {
    private String id;
    private String cateName;

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", cateName='" + cateName + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public Category() {
    }

    public Category(String id, String cateName) {
        this.id = id;
        this.cateName = cateName;
    }
}
