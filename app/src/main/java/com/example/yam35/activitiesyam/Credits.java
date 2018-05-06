package com.example.yam35.activitiesyam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Credits extends AppCompatActivity {
Button btn;
TextView TV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        TV= (TextView) findViewById(R.id.textView);
        btn = (Button) findViewById(R.id.btn1);
        TV.setText("the Last result is: "+getIntent().getExtras().getString("result"));
    }

    public void Click1ret(View view) {
        Intent t = new Intent(this, MainActivity.class);
        startActivity(t);

    }
}
