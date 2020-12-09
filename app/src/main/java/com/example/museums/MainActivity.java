package com.example.museums;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);

        ArrayList<String> list = new ArrayList<>();

        list.add("The Museum of Modern Art");
        list.add("Rubin Museum of Art");
        list.add("American Museum of Natural History");
        list.add("Whitney Museum of American Art");

        ArrayAdapter arr = new ArrayAdapter(this, android.R.layout.simple_list_item_1,list);

        listView.setAdapter(arr);
    }

}
