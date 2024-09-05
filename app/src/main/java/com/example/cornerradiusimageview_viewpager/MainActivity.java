package com.example.cornerradiusimageview_viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;

    MyAdapter myAdapter;
    ImageView imageView;

    ArrayList<Img> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.vp);

        arrayList.add(new Img("❝L'amour ne soit jamais en retard, toujours il prendra un part de départ dans un nouveau cœur, pour trouver un âme sœur comme lieu de gare. ❞ ", "Alune Badara Dioufe", R.drawable.l01));
        arrayList.add(new Img("❝ Ta beauté de sucre,te rend pulchre,ridère et formose comme l'incontestable Île de Formose, mais si tu te métamorphoses, tu seras sans doute moche. ❞ ", "Alune Badara Dioufe", R.drawable.l03));

        arrayList.add(new Img("❝L'amour ne soit jamais en retard, toujours il prendra un part de départ dans un nouveau cœur, pour trouver un âme sœur comme lieu de gare. ❞ ", "Alune Badara Dioufe", R.drawable.love3));
        myAdapter = new MyAdapter(MainActivity.this, arrayList);

        viewPager.setAdapter(myAdapter);

    }
}