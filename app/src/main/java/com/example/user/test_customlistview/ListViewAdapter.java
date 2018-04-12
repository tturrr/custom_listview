package com.example.user.test_customlistview;


import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter  extends BaseAdapter {


    private ArrayList<listviewitme> listviewitemList = new ArrayList<listviewitme>();

    public ListViewAdapter () {


    }





    @Override
    public int getCount() {
        return listviewitemList.size();
    }

    @Override
    public Object getItem(int position) {
        return listviewitemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View conVertview, ViewGroup parent) {

        final int pos = position;
        final Context context = parent.getContext();
        if (conVertview == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            conVertview = inflater.inflate(R.layout.activity_listview_item, parent, false);
        }

        ImageView iconImageView = (ImageView) conVertview.findViewById(R.id.imageView1) ;
        TextView titleTextView = (TextView) conVertview.findViewById(R.id.textView1) ;
        TextView descTextView = (TextView) conVertview.findViewById(R.id.textView2) ;



        return conVertview;
    }


    public void addItem(Drawable icon, String title, String desc) {
        listviewitme item = new listviewitme();

        item.setIcon(icon);
        item.setTitle(title);
        item.setdesc(desc);

        listviewitemList.add(item);
    }

}

