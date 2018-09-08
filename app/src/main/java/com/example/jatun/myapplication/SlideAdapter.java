package com.example.jatun.myapplication;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Timer;
import java.util.zip.Inflater;


public class SlideAdapter extends PagerAdapter {
    LinearLayout layoutslide;
    Context context;
    LayoutInflater inflater;
    public int[] lst_images={
            R.drawable.cloud,
            R.drawable.contact,
            R.drawable.healthcare,
            R.drawable.tech,
            R.drawable.technology,
            R.drawable.androidsupport

    };
    public String[] lst_title=
            {
                    "cloud",
                    "contact",
                    "healthcare",
                    "tech",
                    "technology",
                    "androidsupport"
            };
    public String[] lst_description=
            {
                    "description1",
                    "description2"
            };
    public SlideAdapter(Context context)
    {
        this.context=context;
    }
    @Override
    public int getCount() {
        return lst_title.length;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.slide,container,false);
        layoutslide=(LinearLayout)view.findViewById(R.id.slidelinear);
        ImageView slidview=(ImageView)view.findViewById(R.id.imageView2);
        slidview.setImageResource(lst_images[position]);
        container.addView(view);
        return view;


    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
       container.removeView((LinearLayout)object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view== (LinearLayout)object);
    }
}
