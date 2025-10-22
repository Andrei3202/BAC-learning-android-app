package com.example.proiectfinal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapterMate extends BaseAdapter {
    private Context mContext;
    public ImageAdapterMate(Context c) {
        mContext = c;
    }
    public int getCount() {
        return ImagineMica.length;
    }
    public Object getItem(int position) {
        return null;
    }
    public long getItemId(int position) {
        return 0;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new GridView.LayoutParams(500, 1000));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8, 8, 8, 8);
        imageView.setImageResource(ImagineMica[position]);
        return imageView;
    }
    public Integer[] ImagineMica = {
            R.drawable.mate1,
            R.drawable.mate2,
            R.drawable.mate3,
            R.drawable.mate4
    };
}
