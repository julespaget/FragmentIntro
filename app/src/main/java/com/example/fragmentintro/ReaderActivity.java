package com.example.fragmentintro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.HashMap;

/**
 * Created by paget on 25/10/17.
 */

public class ReaderActivity extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_reader_layout);
        Intent intent = getIntent() ;
        int i = getIntent().getIntExtra("ID",0);
        TextView text = (TextView) findViewById(R.id.text) ;
        text.setText("value = " + i);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
