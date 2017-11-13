package com.example.fragmentintro;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.HashMap;

public class ArticleReaderFragment extends Fragment {
    
    private TextView textView ;
	@Override    
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.article_reader_layout, container, false);
        textView = (TextView)view.findViewById(R.id.text) ;
        return view;
	}

	public void update(int id){
        textView.setText("selection indice = " + id);
    }
}
