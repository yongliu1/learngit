package com.example.mynavigationview;

import android.view.View;

import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class MyNavigationView<T extends View> {
    private ArrayList<T> viewArrayList;
    private ViewPager viewPager;

    public MyNavigationView(ArrayList<T> viewArrayList, ViewPager viewPager) {
        this.viewArrayList = viewArrayList;
        this.viewPager = viewPager;
    }

    public void setAnimation(final float changeSize) {
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position < viewArrayList.size() - 1) {
                    viewArrayList.get(position).setScaleX(1 + changeSize * (1 - positionOffset));
                    viewArrayList.get(position + 1).setScaleX(1 + changeSize * (positionOffset));
                    viewArrayList.get(position).setScaleY(1 + changeSize * (1 - positionOffset));
                    viewArrayList.get(position + 1).setScaleY(1 + changeSize * (positionOffset));
                } else {
                    viewArrayList.get(position).setScaleX(1 + changeSize * (1 - positionOffset));
                    viewArrayList.get(position - 1).setScaleX(1 + changeSize * (positionOffset));
                    viewArrayList.get(position).setScaleY(1 + changeSize * (1 - positionOffset));
                    viewArrayList.get(position - 1).setScaleY(1 + changeSize * (positionOffset));
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        for (View view : viewArrayList) {
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    for (int i = 0; i < viewArrayList.size(); i++) {
                        if (viewArrayList.get(i) == v) {
                            viewPager.setCurrentItem(i);
                        }
                    }
                }
            });
        }

    }


}
