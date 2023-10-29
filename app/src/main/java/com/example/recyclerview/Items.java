package com.example.recyclerview;

public class Items {
    private String name;
    private int imageId;

    public Items(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
