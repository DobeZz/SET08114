package com.example.napier.androidappb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox cbox1 = (CheckBox) findViewById(R.id.checkBox);
        cbox1.setOnClickListener(startListener);
        CheckBox cbox2 = (CheckBox) findViewById(R.id.checkBox2);
        cbox2.setOnClickListener(startListener);
        CheckBox cbox3 = (CheckBox) findViewById(R.id.checkBox3);
        cbox3.setOnClickListener(startListener);
        TextView tv1 = (TextView) findViewById(R.id.textView);
    }

    private View.OnClickListener startListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            CheckBox cbox1 = (CheckBox) findViewById(R.id.checkBox);
            CheckBox cbox2 = (CheckBox) findViewById(R.id.checkBox2);
            CheckBox cbox3 = (CheckBox) findViewById(R.id.checkBox3);
            TextView tv1 = (TextView) findViewById(R.id.textView);
            String orderText = "Order:";
            String burger = " Burger, ";
            String fries = " Fries, ";
            String coke = " Coke ";
            tv1.setText(orderText);

            if (cbox1.isChecked()) {
                Toast.makeText(MainActivity.this, "Burger added to order", Toast.LENGTH_LONG).show();
                orderText += burger;
                tv1.setText(orderText);
            } else {
                Toast.makeText(MainActivity.this, "Burger removed from order", Toast.LENGTH_LONG).show();
                orderText = "Order:";
                tv1.setText(orderText);
            }

            if (cbox2.isChecked()) {
                Toast.makeText(MainActivity.this, "Fries added to order", Toast.LENGTH_LONG).show();
                orderText += fries;
                tv1.setText(orderText);
            }  else {
                Toast.makeText(MainActivity.this, "Fries removed from order", Toast.LENGTH_LONG).show();
                orderText = "Order:";
                tv1.setText(orderText);
            }

            if (cbox3.isChecked()) {
                Toast.makeText(MainActivity.this, "Coke added to order", Toast.LENGTH_LONG).show();
                orderText += coke;
                tv1.setText(orderText);
            } else {
                Toast.makeText(MainActivity.this, "Coke removed from order", Toast.LENGTH_LONG).show();
                orderText = "Order:";
                tv1.setText(orderText);
            }


        }
    };
}

