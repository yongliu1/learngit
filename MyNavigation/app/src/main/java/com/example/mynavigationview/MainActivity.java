package com.example.mynavigationview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private ArrayList<TextView> textViewArrayList;
    private ArrayList<Fragment> list;
    private MyFragmentAdapter adapter;

    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = findViewById(R.id.view_pager);

        list = new ArrayList<>();
        list.add(new Fragment1());
        list.add(new Fragment2());
        list.add(new Fragment3());
        list.add(new Fragment4());

        textViewArrayList = new ArrayList<>();
        textView1=findViewById(R.id.text_view1);
        textView2=findViewById(R.id.text_view2);
        textView3=findViewById(R.id.text_view3);
        textView4=findViewById(R.id.text_view4);
        textViewArrayList.add(textView1);
        textViewArrayList.add(textView2);
        textViewArrayList.add(textView3);
        textViewArrayList.add(textView4);

        FragmentManager manager = getSupportFragmentManager();
        adapter = new MyFragmentAdapter(manager, list);
        mViewPager.setAdapter(adapter);
        MyNavigationView myNavigationView = new MyNavigationView(textViewArrayList, mViewPager);
        myNavigationView.setAnimation(0.2f);
    }
}
