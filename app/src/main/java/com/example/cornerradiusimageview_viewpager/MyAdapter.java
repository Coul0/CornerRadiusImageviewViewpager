package com.example.cornerradiusimageview_viewpager;


import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.FileProvider;
import androidx.viewpager.widget.PagerAdapter;

import com.google.android.material.imageview.ShapeableImageView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class MyAdapter extends PagerAdapter {
    private static final String TAG = "PagerAdapter";
    Context context;
    ArrayList<Img> arrayList;
    LayoutInflater layoutInflater;

    public MyAdapter(Context context, ArrayList<Img> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
        layoutInflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container,final int position) {

        View view = layoutInflater.inflate(R.layout.pager_item, container, false);

        ShapeableImageView imageView = view.findViewById(R.id.img);

        imageView.setImageResource(arrayList.get(position).getImages());
        TextView textView = view.findViewById(R.id.quoteText);
        textView.setText(arrayList.get(position).getQuotes());
        TextView writer = view.findViewById(R.id.writerName);
        writer.setText(arrayList.get(position).getWriter());

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
