package com.example.fragmentintro;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Menu;
import android.widget.LinearLayout;

import java.util.HashMap;

public class MainActivity extends Activity implements ArticleListFragment.OnTitleSelectedListener{


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//((ArticleListFragment)getFragmentManager().findFragmentById(R.id.list)).setOnTitleSelectedListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void OnTitleSelected(int id) {
		// on regarde quel layout on utilise si il est large ou pas
		LinearLayout layout = (LinearLayout) findViewById(R.id.layout_large);
		Log.d("MainActivity :","on est dans on titleselected waaa");
		if(layout != null){
			Log.d("MainActivity :","uemmanuel est un epite merde de djkqsmljkfdqlm");
			ArticleReaderFragment f2 = (ArticleReaderFragment)getFragmentManager().findFragmentById(R.id.viewer);
			f2.update(id) ;
		}
		else {
			Intent intent = new Intent (this, ReaderActivity.class) ;
			intent.putExtra("ID", id) ;
			startActivity(intent) ;
		}
	}


/*	public void ItemSelected(){
		setElected( int i) ;
		getActivtySelcted
	}*/

}
