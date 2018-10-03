package com.gonzales.jonathan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Activity 1");
        setContentView(R.layout.activity_1);
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void process(View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.btnAct2) {
            i = new Intent(this, Activity2.class);
            startActivity(i);
        } else {
            i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 14.598774, 120.983795"));
            chooser = Intent.createChooser(i, "Choose Map Application");
            startActivity(chooser);
        }
    }
}
