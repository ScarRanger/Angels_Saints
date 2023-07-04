//package com.rhinepereira.saints;
//
//import android.graphics.Typeface;
//import android.os.Bundle;
//
//import android.widget.TextView;
//import androidx.appcompat.app.AppCompatActivity;
//
//public class
//CreedActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_creed);
//        setTitle(getString(R.string.apostle));
//
////        TextView myAwesomeTextView = findViewById(R.id.creed_mar);
////        TextView text_view = new TextView(this);
////        Typeface font = Typeface.createFromAsset(getAssets(), "Mar_font.ttf");
////        text_view.setTypeface(font);
////        text_view.setText("मराठी");
//
//
////        TextView text = findViewById(R.id.creed_mar);
////        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/MarathiFont.ttf");
////        text.setTypeFace(tf);
//    }
//
//
//}

package com.rhinepereira.saints;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;


public class CreedActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    ViewPageAdapter2 viewPageAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creed);
        setTitle("Apostle's Creed");

        tabLayout = findViewById(R.id.tab_layout);
        viewPager2 = findViewById(R.id.view_page);
        viewPageAdapter2 = new ViewPageAdapter2(this);
        viewPager2.setAdapter(viewPageAdapter2);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.getTabAt(position).select();
            }
        });
    }

}
