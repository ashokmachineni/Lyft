package com.example.ashokmachineni.lyft;

public class Action {
    private String name;
    private String studio;
    private String img;
    public Action(){}

    public Action(String name, String studio, String img) {
        this.name = name;
        this.studio = studio;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
