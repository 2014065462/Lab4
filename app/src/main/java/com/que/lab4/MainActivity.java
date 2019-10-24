package com.que.lab4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    String[] name, version, level, release, info;
    ListView list;
    ArrayList<Android> androidList = new ArrayList<>();
    int[] cLogo = {R.drawable.cupcake, R.drawable.donut, R.drawable.eclair, R.drawable.froyo, R.drawable.gingerbread, R.drawable.honeycomb, R.drawable.ice_cream_sandwich, R.drawable.jelly_bean, R.drawable.kitkat, R.drawable.lollipop, R.drawable.marshmallow, R.drawable.nougat, R.drawable.oreo, R.drawable.pie, R.drawable.ten};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = getResources().getStringArray(R.array.name);
        version = getResources().getStringArray(R.array.version);
        level = getResources().getStringArray(R.array.level);
        release = getResources().getStringArray(R.array.release);
        info = getResources().getStringArray(R.array.info);
        for(int i = 0; i<name.length; i++){
            androidList.add(new Android(cLogo[i], name[i], version[i], level[i], release[i], info[i]));
        }
        list = findViewById(R.id.lvAndroid);
        AndroidAdapter adapter = new AndroidAdapter(this, R.layout.item, androidList);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
        //Toast.makeText(this, names[i], Toast.LENGTH_LONG).show();
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle(androidList.get(i).getName());
        dialog.setIcon(androidList.get(i).getLogo());
        dialog.setMessage(androidList.get(i).getInfo());
        dialog.setNeutralButton("CLOSE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.dismiss();
                //Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_LONG).show();
            }
        });
        dialog.create().show();
    }
}
