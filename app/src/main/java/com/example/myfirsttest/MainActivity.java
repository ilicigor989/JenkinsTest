package com.example.myfirsttest;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView showSumm;
    EditText first;
    EditText second;
    Button summ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        summ=findViewById(R.id.button);
        showSumm=findViewById(R.id.textView);
        first=findViewById(R.id.editText);
        second=findViewById(R.id.editText2);

        summ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int one= Integer.parseInt(first.getText().toString());
                int two= Integer.parseInt(second.getText().toString());
                int summ=summ(one,two);
                showSumm.setText(String.valueOf(summ));

            }
        });

    }

    public int summ(int a, int b){
        return a + b;
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
