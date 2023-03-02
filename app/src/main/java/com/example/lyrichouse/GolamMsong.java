package com.example.lyrichouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class GolamMsong extends AppCompatActivity {

    private RecyclerView GolamMsong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.golam_msong);

        GolamMsong = findViewById(R.id.GolamMsong);


        LinearLayoutManager lmg = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        GolamMsong.setLayoutManager(lmg);

        ArrayList<MyModel> Modles = new ArrayList<>();{

            Modles.add(new MyModel(R.drawable.img_pen,"মসজিদেরই পাশে আমার","গোলাম মোহাম্মদ"));
            Modles.add(new MyModel(R.drawable.img_pen,"হেরা হতে হেলে দুলে","গোলাম মোহাম্মদ"));
            Modles.add(new MyModel(R.drawable.img_pen,"নাম মোহাম্মদ বোল রে মন","গোলাম মোহাম্মদ"));
            Modles.add(new MyModel(R.drawable.img_pen,"আল্লাহ কে যে পাইতে চায়","গোলাম মোহাম্মদ"));
            Modles.add(new MyModel(R.drawable.img_pen,"তৌহিদেরো মুর্শিদ আমার","গোলাম মোহাম্মদ"));
            Modles.add(new MyModel(R.drawable.img_pen,"মোহাম্মদ নাম জপেছিলি","গোলাম মোহাম্মদ"));
            Modles.add(new MyModel(R.drawable.img_pen,"এই সুন্দর ফুল সুন্দর ফল","গোলাম মোহাম্মদ"));
            Modles.add(new MyModel(R.drawable.img_pen,"ধর্মের পথে শহীদ যাহারা","গোলাম মোহাম্মদ"));
            Modles.add(new MyModel(R.drawable.img_pen,"পুবাল হাওয়া পশ্চিমে যাও","গোলাম মোহাম্মদ"));
            Modles.add(new MyModel(R.drawable.img_pen,"আমি যদি আরব হতাম","গোলাম মোহাম্মদ"));
            Modles.add(new MyModel(R.drawable.img_pen,"ফুলে পুছিনু, বল, বল ওরে ফুল","গোলাম মোহাম্মদ"));
            Modles.add(new MyModel(R.drawable.img_pen,"তোমার নামে একি নেশা","গোলাম মোহাম্মদ"));
            Modles.add(new MyModel(R.drawable.img_pen,"ত্রিভুবনের প্রিয় মোহাম্মদ","গোলাম মোহাম্মদ"));
            Modles.add(new MyModel(R.drawable.img_pen,"তৌহিদেরি মুর্শিদ আমার","গোলাম মোহাম্মদ"));
            Modles.add(new MyModel(R.drawable.img_pen,"তোরা দেখে যা আমিনা","গোলাম মোহাম্মদ"));
            Modles.add(new MyModel(R.drawable.img_pen,"খোদা এই গরীবের শোন","গোলাম মোহাম্মদ"));
            Modles.add(new MyModel(R.drawable.img_pen,"রাসুল নামের ফুলের ঘ্রানে","গোলাম মোহাম্মদ"));
            Modles.add(new MyModel(R.drawable.img_pen,"জিছে দামামা","গোলাম মোহাম্মদ"));
            Modles.add(new MyModel(R.drawable.img_pen,"ধর্মের পথে শহিদ যাহারা","গোলাম মোহাম্মদ"));
            Modles.add(new MyModel(R.drawable.img_pen,"মনে বড় আশা চিল","গোলাম মোহাম্মদ"));


        }

        MyAdapter myAdapter = new MyAdapter(Modles);
        GolamMsong.setAdapter(myAdapter);
    }
}