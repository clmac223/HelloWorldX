package com.example.helloworldx;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double temp =  0;
    String temps = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView textbox = findViewById(R.id.textView3);
        final Button button = findViewById(R.id.button9);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                textbox.append(button.getText());
            }
        });
        final Button button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                textbox.append(button1.getText());
            }
        });
        final Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                textbox.append(button2.getText());
            }
        });
        final Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                textbox.append(button3.getText());
            }
        });
        final Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                textbox.append(button4.getText());
            }
        });
        final Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                textbox.append(button5.getText());
            }
        });
        final Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                textbox.append(button6.getText());
            }
        });
        final Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                textbox.append(button7.getText());
            }
        });
        final Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                textbox.append(button8.getText());
            }
        });
        final Button button9 = findViewById(R.id.button11);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                textbox.append(button9.getText());
            }
        });
        final Button buttonAdd = findViewById(R.id.button10);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                temp = Double.parseDouble(textbox.getText().toString());
                textbox.setText("");
                temps = "a";
            }
        });
        final Button buttonMinus = findViewById(R.id.button12);
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                temp = Double.parseDouble(textbox.getText().toString());
                textbox.setText("");
                temps = "s";
            }
        });
        final Button buttonMulti = findViewById(R.id.button13);
        buttonMulti.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                temp = Double.parseDouble(textbox.getText().toString());
                textbox.setText("");
                temps = "m";
            }
        });
        final Button buttonDivide = findViewById(R.id.button15);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                temp = Integer.parseInt(textbox.getText().toString());
                textbox.setText("");
                temps = "d";
            }
        });
        final Button buttonClear = findViewById(R.id.button16);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                temp = 0;
                textbox.setText("");
                temps = "";
            }
        });
        final Button buttonEqual = findViewById(R.id.button14);
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if ((temps == "a"))
                { temp = temp + Integer.parseInt(textbox.getText().toString()); }
                else if ((temps == "s"))
                { temp = temp - Integer.parseInt(textbox.getText().toString()); }
                else if ((temps == "m"))
                { temp = temp / Integer.parseInt(textbox.getText().toString()); }
                else if ((temps == "d"))
                { temp = temp * Integer.parseInt(textbox.getText().toString()); }
                textbox.setText(temp+"");

            }
        });
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
