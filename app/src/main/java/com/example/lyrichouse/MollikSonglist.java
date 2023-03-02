package com.example.lyrichouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.lyrichouse.MyAdapter;
import com.example.lyrichouse.MyModel;
import com.example.lyrichouse.R;

import java.util.ArrayList;

public class MollikSonglist extends AppCompatActivity {

    private RecyclerView Molliksong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mollik_song_list);

        Molliksong = findViewById(R.id.MollikSong);


        LinearLayoutManager lmg = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        Molliksong.setLayoutManager(lmg);

        ArrayList<MyModel> Modles = new ArrayList<>();{

            Modles.add(new MyModel(R.drawable.img_pen,"তোমার সৃষ্টি যদি","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"এলো কে কাবার ধারে","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"গান শোনাতে পারি","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"আন্দোলন সেতো জীবনের","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"যদি কেউ বুঝে থাক মুসলিম","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"এ আকাশ মেঘে ঢাকা রবে না","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"যা কিছু করতে চাও করতে পারো","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"কথায় কাজে মিল দাও","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"এখানে কি কেউ নেই","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"ধৈর্য্য ধারণ করার শক্তি","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"ঘন দুর্যোগ পথে দুর্ভোগ","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"এই দুর্যোগে এই দুর্ভোগে আজ","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"জিন্দাবাদ জিন্দাবাদ বীর মুজাহিদ","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"আমার গানের ভাষা জীবনের সাথে","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"কোন সাহসে চাও নেভাতে","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"দৃষ্টি তোমার খুলে রাখ","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"রোদের ভেতর ইলশে গুড়ি","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"হে খোদা মোর হৃদয় হতে","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"এই দুটি চোখ দিয়েছ বলে","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"সে কোন বন্ধু বলো","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"না হয় হলো মন শুকনো কোন","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"আমাকে যখন কেউ প্রশ্ন করে","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"কী হবে হতাশ হয়ে","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"উত্তাপে উজ্জ্বল রক্তিম সময়ের","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"চলো চলো চলো মুজাহিদ","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"পৃথিবী আমার আসল","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"জিহাদ করতে চাই আমি","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"মাঠ ভরা ঐ সবুজ দেখে","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"দাও খোদা দাও হেথায় পূর্ণ","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"এসো গাই আল্লাহ নামের গান","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"হঠাৎ করে জীবন দেয়া","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"সারা বাংলার গ্রামে গঞ্জে","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"একজন মুজাহিদ কখনো","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"সাহসের সাথে কিছু স্বপ্ন জড়াও","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"জিহাদের মানে হলো","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"বজ্র আঘাতে ভাঙ্গে এক সাথে","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"এত শহীদ রক্ত ঢালে","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"সংগঠনকে ভালোবাসি আমি","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"কার কতটা ঈমান আছে","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"আম্মা বলেন ঘর ছেড়ে তুই","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"কেউ ছুঁতে চায় তারার আলো","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"এই গুনাহগার প্রভু","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"রাসূল আমার ভালোবাসা","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"গান আমার কাঁদে রে","কবি মতিউর রহমান মল্লিক"));
            Modles.add(new MyModel(R.drawable.img_pen,"টিক টিক টিক টিক যে ঘড়িটা","কবি মতিউর রহমান মল্লিক"));


        }

        MyAdapter myAdapter = new MyAdapter(Modles);
        Molliksong.setAdapter(myAdapter);
    }
}