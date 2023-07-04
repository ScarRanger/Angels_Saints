package com.rhinepereira.saints;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class BooksActivity extends AppCompatActivity {

    private static final String TAG = "BookActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        setTitle("Books of the Bible");
        ListView lstBooksOld = (ListView) findViewById(R.id.lstBooksOld);

        List<String> data = new ArrayList<>();
        data.add("Genesis");
        data.add("Exodus");
        data.add("Leviticus");
        data.add("Numbers");
        data.add("Deuteronomy");
        data.add("Joshua");
        data.add("Judges");
        data.add("Ruth");
        data.add("1 Samuel");
        data.add("2 Samuel");
        data.add("1 Kings");
        data.add("2 Kings");
        data.add("1 Chronicles");
        data.add("2 Chronicles");
        data.add("Ezra");
        data.add("Nehemiah");
        data.add("Esther");
        data.add("Job");
        data.add("Psalms");
        data.add("Proverbs");
        data.add("Ecclesiastes");
        data.add("Song of Solomon");
        data.add("Isaiah");
        data.add("Jeremiah");
        data.add("Lamentations");
        data.add("Ezekiel");
        data.add("Daniel");
        data.add("Hosea");
        data.add("Joel");
        data.add("Amos");
        data.add("Obadiah");
        data.add("Jonah");
        data.add("Micah");
        data.add("Nahum");
        data.add("Habakkuk");
        data.add("Zephaniah");
        data.add("Haggai");
        data.add("Zechariah");
        data.add("Malachi");
        data.add("Tobit");
        data.add("Judith");
        data.add("Esther");
        data.add("Wisdom of Solomon");
        data.add("Sirach");
        data.add("Letter of Jeremiah");
        data.add("Susanna");
        data.add("Bel and the Dragon");
        data.add("1 Maccabees");
        data.add("2 Maccabees");



        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.layout_row_books, data );
        lstBooksOld.setAdapter(arrayAdapter);

        ListView lstBooksNew = (ListView) findViewById(R.id.lstBooksNew);


        List<String> data2 = new ArrayList<>();
        data2.add("Matthew");
        data2.add("Mark");
        data2.add("Luke");
        data2.add("John");
        data2.add("Acts of the Apostles");
        data2.add("Romans");
        data2.add("1 Corinthians");
        data2.add("2 Corinthians");
        data2.add("Galatians");
        data2.add("Ephesians");
        data2.add("Philippians");
        data2.add("Colossians");
        data2.add("1 Thessalonians");
        data2.add("2 Thessalonians");
        data2.add("1 Timothy");
        data2.add("2 Timothy");
        data2.add("Titus");
        data2.add("Philemon");
        data2.add("Hebrews");
        data2.add("James");
        data2.add("1 Peter");
        data2.add("2 Peter");
        data2.add("1 John");
        data2.add("2 John");
        data2.add("3 John");
        data2.add("Jude");
        data2.add("Revelation");
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(this, R.layout.layout_row_books, data2 );
        lstBooksNew.setAdapter(arrayAdapter2);


        ListUtils.setDynamicHeight(lstBooksOld);
        ListUtils.setDynamicHeight(lstBooksNew);
    }

    private static class ListUtils {
        static void setDynamicHeight(ListView mListView) {
            ListAdapter mListAdapter = mListView.getAdapter();
            if (mListAdapter == null) {
                // when adapter is null
                return;
            }
            int height = 0;
            int desiredWidth = View.MeasureSpec.makeMeasureSpec(mListView.getWidth(), View.MeasureSpec.UNSPECIFIED);
            for (int i = 0; i < mListAdapter.getCount(); i++) {
                View listItem = mListAdapter.getView(i, null, mListView);
                listItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
                height += listItem.getMeasuredHeight();
            }
            ViewGroup.LayoutParams params = mListView.getLayoutParams();
            params.height = height + (mListView.getDividerHeight() * (mListAdapter.getCount() - 1));
            mListView.setLayoutParams(params);
            mListView.requestLayout();
        }

    }

}

