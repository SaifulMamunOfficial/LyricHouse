package com.example.lyrichouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AsadHafizsong extends AppCompatActivity {
    private RecyclerView AsadHafizsong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asad_hafizsong);


        AsadHafizsong = findViewById(R.id.AsadHafizsong);

        LinearLayoutManager lmg = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        AsadHafizsong.setLayoutManager(lmg);

        ArrayList<MyModel> Modles = new ArrayList<>();{

            Modles.add(new MyModel(R.drawable.img_pen,"মসজিদেরই পাশে আমার","আসাদ বিন হাফিজ"));
            Modles.add(new MyModel(R.drawable.img_pen,"হেরা হতে হেলে দুলে","আসাদ বিন হাফিজ"));
            Modles.add(new MyModel(R.drawable.img_pen,"নাম মোহাম্মদ বোল রে মন","আসাদ বিন হাফিজ"));
            Modles.add(new MyModel(R.drawable.img_pen,"আল্লাহ কে যে পাইতে চায়","আসাদ বিন হাফিজ"));
            Modles.add(new MyModel(R.drawable.img_pen,"তৌহিদেরো মুর্শিদ আমার","আসাদ বিন হাফিজ"));
            Modles.add(new MyModel(R.drawable.img_pen,"মোহাম্মদ নাম জপেছিলি","আসাদ বিন হাফিজ"));
            Modles.add(new MyModel(R.drawable.img_pen,"এই সুন্দর ফুল সুন্দর ফল","আসাদ বিন হাফিজ"));
            Modles.add(new MyModel(R.drawable.img_pen,"ধর্মের পথে শহীদ যাহারা","আসাদ বিন হাফিজ"));
            Modles.add(new MyModel(R.drawable.img_pen,"পুবাল হাওয়া পশ্চিমে যাও","আসাদ বিন হাফিজ"));
            Modles.add(new MyModel(R.drawable.img_pen,"আমি যদি আরব হতাম","আসাদ বিন হাফিজ"));
            Modles.add(new MyModel(R.drawable.img_pen,"ফুলে পুছিনু, বল, বল ওরে ফুল","আসাদ বিন হাফিজ"));
            Modles.add(new MyModel(R.drawable.img_pen,"তোমার নামে একি নেশা","আসাদ বিন হাফিজ"));
            Modles.add(new MyModel(R.drawable.img_pen,"ত্রিভুবনের প্রিয় মোহাম্মদ","আসাদ বিন হাফিজ"));
            Modles.add(new MyModel(R.drawable.img_pen,"তৌহিদেরি মুর্শিদ আমার","আসাদ বিন হাফিজ"));
            Modles.add(new MyModel(R.drawable.img_pen,"তোরা দেখে যা আমিনা","আসাদ বিন হাফিজ"));
            Modles.add(new MyModel(R.drawable.img_pen,"খোদা এই গরীবের শোন","আসাদ বিন হাফিজ"));
            Modles.add(new MyModel(R.drawable.img_pen,"রাসুল নামের ফুলের ঘ্রানে","আসাদ বিন হাফিজ"));
            Modles.add(new MyModel(R.drawable.img_pen,"জিছে দামামা","আসাদ বিন হাফিজ"));
            Modles.add(new MyModel(R.drawable.img_pen,"ধর্মের পথে শহিদ যাহারা","আসাদ বিন হাফিজ"));
            Modles.add(new MyModel(R.drawable.img_pen,"মনে বড় আশা চিল","আসাদ বিন হাফিজ"));

        }

        MyAdapter myAdapter = new MyAdapter(Modles);
        AsadHafizsong.setAdapter(myAdapter);
    }
}