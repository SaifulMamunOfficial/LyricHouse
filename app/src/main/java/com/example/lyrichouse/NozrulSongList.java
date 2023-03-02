package com.example.lyrichouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.lyrichouse.MyAdapter;
import com.example.lyrichouse.MyModel;
import com.example.lyrichouse.R;

import java.util.ArrayList;

public class NozrulSongList extends AppCompatActivity {

    private androidx.recyclerview.widget.RecyclerView NozrulSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nozrul_song_list);


        NozrulSong = findViewById(R.id.NozrulSong);


        LinearLayoutManager lmg = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        NozrulSong.setLayoutManager(lmg);

        ArrayList<MyModel> Modles = new ArrayList<>();{

            Modles.add(new MyModel(R.drawable.img_pen,"মসজিদেরই পাশে আমার","কাজী নজরুল ইসলাম"));
            Modles.add(new MyModel(R.drawable.img_pen,"হেরা হতে হেলে দুলে","কাজী নজরুল ইসলাম"));
            Modles.add(new MyModel(R.drawable.img_pen,"নাম মোহাম্মদ বোল রে মন","কাজী নজরুল ইসলাম"));
            Modles.add(new MyModel(R.drawable.img_pen,"আল্লাহ কে যে পাইতে চায়","কাজী নজরুল ইসলাম"));
            Modles.add(new MyModel(R.drawable.img_pen,"তৌহিদেরো মুর্শিদ আমার","কাজী নজরুল ইসলাম"));
            Modles.add(new MyModel(R.drawable.img_pen,"মোহাম্মদ নাম জপেছিলি","কাজী নজরুল ইসলাম"));
            Modles.add(new MyModel(R.drawable.img_pen,"এই সুন্দর ফুল সুন্দর ফল","কাজী নজরুল ইসলাম"));
            Modles.add(new MyModel(R.drawable.img_pen,"ধর্মের পথে শহীদ যাহারা","কাজী নজরুল ইসলাম"));
            Modles.add(new MyModel(R.drawable.img_pen,"পুবাল হাওয়া পশ্চিমে যাও","কাজী নজরুল ইসলাম"));
            Modles.add(new MyModel(R.drawable.img_pen,"আমি যদি আরব হতাম","কাজী নজরুল ইসলাম"));
            Modles.add(new MyModel(R.drawable.img_pen,"ফুলে পুছিনু, বল, বল ওরে ফুল","কাজী নজরুল ইসলাম"));
            Modles.add(new MyModel(R.drawable.img_pen,"তোমার নামে একি নেশা","কাজী নজরুল ইসলাম"));
            Modles.add(new MyModel(R.drawable.img_pen,"ত্রিভুবনের প্রিয় মোহাম্মদ","কাজী নজরুল ইসলাম"));
            Modles.add(new MyModel(R.drawable.img_pen,"তৌহিদেরি মুর্শিদ আমার","কাজী নজরুল ইসলাম"));
            Modles.add(new MyModel(R.drawable.img_pen,"তোরা দেখে যা আমিনা","কাজী নজরুল ইসলাম"));
            Modles.add(new MyModel(R.drawable.img_pen,"খোদা এই গরীবের শোন","কাজী নজরুল ইসলাম"));
            Modles.add(new MyModel(R.drawable.img_pen,"রাসুল নামের ফুলের ঘ্রানে","কাজী নজরুল ইসলাম"));
            Modles.add(new MyModel(R.drawable.img_pen,"জিছে দামামা","কাজী নজরুল ইসলাম"));
            Modles.add(new MyModel(R.drawable.img_pen,"ধর্মের পথে শহিদ যাহারা","কাজী নজরুল ইসলাম"));
            Modles.add(new MyModel(R.drawable.img_pen,"মনে বড় আশা চিল","কাজী নজরুল ইসলাম"));

        }

        MyAdapter myAdapter = new MyAdapter(Modles);
        NozrulSong.setAdapter(myAdapter);
    }
}