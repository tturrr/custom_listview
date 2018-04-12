package com.example.user.test_customlistview;


import android.graphics.drawable.Drawable;

public class listviewitme {

    private Drawable iconDrawavle;
    private String titlestr;
    private String descstr;




    public void setIcon(Drawable icon) {

        iconDrawavle = icon ;
    }

    public  void setTitle(String title) {

        titlestr = title;

    }

    public void setdesc(String desc){

        descstr = desc;
    }


    public Drawable getIcon() {
        return this.iconDrawavle;
    }

    public String getTitle(){
        return this.titlestr;
    }

    public String getDesc(){

        return this.descstr;
    }


}
