package com.example.malachi.simpleui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import java.util.*;

public class MainActivity extends Activity
{
  //static final String[] items = {"item1","item2","item3","item4"};

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final Button go = (Button)findViewById(R.id.go);
    ListView itemView = (ListView)findViewById(R.id.items);
    ArrayList<String> items = new ArrayList<String>();
    final ArrayAdapter<String> numAdp = new ArrayAdapter<String>(this, R.layout.list_view, items);
    itemView.setAdapter(numAdp);
    go.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        final EditText input = (EditText)findViewById(R.id.input);
        numAdp.add(input.getText().toString());
        input.setText("");
      }
    });

  }



}
