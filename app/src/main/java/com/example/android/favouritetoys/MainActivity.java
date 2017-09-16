package com.example.android.favouritetoys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mToysListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToysListTextView = (TextView) findViewById(R.id.toyTextView);
        String[] toyNames = ToyBox.getToyNames();

        for (String toyName : toyNames)
        {
            mToysListTextView.append(toyName+"\n\n\n");
        }

    }
}

