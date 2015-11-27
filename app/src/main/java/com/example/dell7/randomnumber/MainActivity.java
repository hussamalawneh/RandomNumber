package com.example.dell7.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void start(View v){
        Button sta=(Button)findViewById(R.id.button);
        Button gen=(Button)findViewById(R.id.button3);
        Button chk=(Button)findViewById(R.id.button2);
        TextView guess=(TextView)findViewById(R.id.textView2);
        EditText ed=(EditText)findViewById(R.id.editText);
        TextView text1=(TextView)findViewById(R.id.textView);
        TextView text2=(TextView)findViewById(R.id.textView3);

        sta.setEnabled(false);
        sta.setVisibility(View.INVISIBLE);
        guess.setVisibility(View.VISIBLE);
        gen.setVisibility(View.VISIBLE);
        chk.setVisibility(View.VISIBLE);
        ed.setVisibility(View.VISIBLE);
        gen.setEnabled(true);
        chk.setEnabled(false);

    }

   int r;
 public void get_random(View v){
     Button gen=(Button)findViewById(R.id.button3);
     Button chk=(Button)findViewById(R.id.button2);
     EditText ed=(EditText)findViewById(R.id.editText);
     TextView text1=(TextView)findViewById(R.id.textView);
     TextView text2=(TextView)findViewById(R.id.textView3);

     gen.setEnabled(false);
     chk.setEnabled(true);

     text1.setVisibility(View.INVISIBLE);
     text2.setVisibility(View.INVISIBLE);
     ed.setText("");

     r=new Random().nextInt(1000)+1;


    }
    public void check(View v){
        Button gen=(Button)findViewById(R.id.button3);
        Button chk=(Button)findViewById(R.id.button2);
        EditText ed=(EditText)findViewById(R.id.editText);
        TextView text1=(TextView)findViewById(R.id.textView);
        TextView text2=(TextView)findViewById(R.id.textView3);

        int num=Integer.parseInt(ed.getText().toString());

        if(num==r)
        {
            text1.setVisibility(View.VISIBLE);
            text2.setVisibility(View.VISIBLE);
            text1.setText("The Random Number ");
            text2.setText(r + " ");
            Toast.makeText(getApplicationContext(), "Equal !", Toast.LENGTH_SHORT).show();
            gen.setEnabled(true);
            chk.setEnabled(false);
        }
        else
        if(Math.abs(num-r)<=5)
        {
            Toast.makeText(getApplicationContext(), "Very Close !", Toast.LENGTH_SHORT).show();
        }
        else
        if(num>r)
        {
            Toast.makeText(getApplicationContext(), "Greater !", Toast.LENGTH_SHORT).show();
        }
        else
        if(num<r)
        {
            Toast.makeText(getApplicationContext(), "Smaller !", Toast.LENGTH_SHORT).show();
        }


    }

}
