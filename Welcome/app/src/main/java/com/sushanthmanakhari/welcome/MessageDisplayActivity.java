package com.sushanthmanakhari.welcome;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MessageDisplayActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_display);

        TextView textView1 = (TextView) findViewById(R.id.disp);
        Intent in = getIntent();
        String tv1= in.getExtras().getString("Welcome");
        textView1.setText("Welcome  " +tv1);

    }
}
