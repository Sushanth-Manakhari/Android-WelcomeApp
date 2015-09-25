package com.sushanthmanakhari.welcome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;


public class LoginActivity extends Activity implements OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button b = (Button)this.findViewById(R.id.login_button);
        b.setOnClickListener(this);
    }

    public void onClick(View v) {
        EditText userid = (EditText) findViewById(R.id.user_ID);
        EditText password = (EditText) findViewById(R.id.password);
        TextView resp = (TextView)this.findViewById(R.id.response);
        String usr = userid.getText().toString();
        String pswd = password.getText().toString();
        if(usr.trim().length() == 0 || pswd.trim().length() == 0){
            String str = "The User ID or password is left blank \nPlease Try Again";
            resp.setText(str);
        }
        else{
            if(usr.equals("guest") && pswd.equals("guest")) {
                Intent i= new Intent(this, MessageDisplayActivity.class);
                i.putExtra("Welcome",usr);
                startActivity(i);
            }

            //resp.setText("Welcome " + usr+ " ! ");
            else resp.setText("The User ID or password is incorrect \nPlease Try Again");
        }
    }
}
