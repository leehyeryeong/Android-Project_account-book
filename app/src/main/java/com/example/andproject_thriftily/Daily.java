package com.example.andproject_thriftily;

public class Daily {
    String date;
    String content;
    String coast;

    public Daily(String date, String content, String coast){
        this.date = date;
        this.content = content;
        this.coast = coast;
    }

    public String getDate() {return date;}
    public void setDate(String date) {this. date = date;}

    public String getContent() {return content;}
    public void setContent(String content) {this. content = content;}

    public String getCoast() {return coast;}
    public void setCoast(String coast) {this. coast = coast;}
}
