package com.shagi.sample4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText  ed1,ed2;
    Button bt1;
    String getUname,getPassword;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.e1);
        ed2=(EditText)findViewById(R.id.e2);
        bt1=(Button)findViewById(R.id.b1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUname=ed1.getText().toString();
                getPassword=ed2.getText().toString();
                Toast.makeText(getApplicationContext(),getUname+"adaa",Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getPassword+"",Toast.LENGTH_LONG).show();
            }
        });

    }
}
