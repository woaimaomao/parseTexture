package com.example.parsetexture;

public class ImageInfo {

    private int id;
    private String name;
    private int x;
    private int y;
    private int width;
    private int height;
    
  
    public ImageInfo() {
    }
  
    public ImageInfo(int id, String name, int x, int y, int width, int height) {
        super();
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "ImageInfo [id=" + id + ", name=" + name + ", x=" + x + ", y=" + y + ", width=" + width + ", height="
                + height + "]";
    }

    
}
