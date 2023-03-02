package com.example.lyrichouse;

public class MyModel {
    Integer ImageRes;
    String Name, Details;

    public MyModel(Integer imageRes, String name, String details) {
        ImageRes = imageRes;
        Name = name;
        Details = details;
    }

    public Integer getImageRes() {
        return ImageRes;
    }

    public void setImageRes(Integer imageRes) {
        ImageRes = imageRes;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }
}
