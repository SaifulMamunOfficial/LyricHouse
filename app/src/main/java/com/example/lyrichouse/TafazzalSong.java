package com.example.lyrichouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class TafazzalSong extends AppCompatActivity {

    private RecyclerView TafazzalSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tafazzal_song);

        TafazzalSong = findViewById(R.id.TafazzalSong);


        LinearLayoutManager lmg = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        TafazzalSong.setLayoutManager(lmg);

        ArrayList<MyModel> Modles = new ArrayList<>();{

            Modles.add(new MyModel(R.drawable.img_pen,"মসজিদেরই পাশে আমার","তাফাজ্জল হোসাইন খান"));
            Modles.add(new MyModel(R.drawable.img_pen,"হেরা হতে হেলে দুলে","তাফাজ্জল হোসাইন খান"));
            Modles.add(new MyModel(R.drawable.img_pen,"নাম মোহাম্মদ বোল রে মন","তাফাজ্জল হোসাইন খান"));
            Modles.add(new MyModel(R.drawable.img_pen,"আল্লাহ কে যে পাইতে চায়","তাফাজ্জল হোসাইন খান"));
            Modles.add(new MyModel(R.drawable.img_pen,"তৌহিদেরো মুর্শিদ আমার","তাফাজ্জল হোসাইন খান"));
            Modles.add(new MyModel(R.drawable.img_pen,"মোহাম্মদ নাম জপেছিলি","তাফাজ্জল হোসাইন খান"));
            Modles.add(new MyModel(R.drawable.img_pen,"এই সুন্দর ফুল সুন্দর ফল","তাফাজ্জল হোসাইন খান"));
            Modles.add(new MyModel(R.drawable.img_pen,"ধর্মের পথে শহীদ যাহারা","তাফাজ্জল হোসাইন খান"));
            Modles.add(new MyModel(R.drawable.img_pen,"পুবাল হাওয়া পশ্চিমে যাও","তাফাজ্জল হোসাইন খান"));
            Modles.add(new MyModel(R.drawable.img_pen,"আমি যদি আরব হতাম","তাফাজ্জল হোসাইন খান"));
            Modles.add(new MyModel(R.drawable.img_pen,"ফুলে পুছিনু, বল, বল ওরে ফুল","তাফাজ্জল হোসাইন খান"));
            Modles.add(new MyModel(R.drawable.img_pen,"তোমার নামে একি নেশা","তাফাজ্জল হোসাইন খান"));
            Modles.add(new MyModel(R.drawable.img_pen,"ত্রিভুবনের প্রিয় মোহাম্মদ","তাফাজ্জল হোসাইন খান"));
            Modles.add(new MyModel(R.drawable.img_pen,"তৌহিদেরি মুর্শিদ আমার","তাফাজ্জল হোসাইন খান"));
            Modles.add(new MyModel(R.drawable.img_pen,"তোরা দেখে যা আমিনা","তাফাজ্জল হোসাইন খান"));
            Modles.add(new MyModel(R.drawable.img_pen,"খোদা এই গরীবের শোন","তাফাজ্জল হোসাইন খান"));
            Modles.add(new MyModel(R.drawable.img_pen,"রাসুল নামের ফুলের ঘ্রানে","তাফাজ্জল হোসাইন খান"));
            Modles.add(new MyModel(R.drawable.img_pen,"জিছে দামামা","তাফাজ্জল হোসাইন খান"));
            Modles.add(new MyModel(R.drawable.img_pen,"ধর্মের পথে শহিদ যাহারা","তাফাজ্জল হোসাইন খান"));
            Modles.add(new MyModel(R.drawable.img_pen,"মনে বড় আশা চিল","তাফাজ্জল হোসাইন খান"));


        }

        MyAdapter myAdapter = new MyAdapter(Modles);
        TafazzalSong.setAdapter(myAdapter);
    }
}