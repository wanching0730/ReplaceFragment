package com.example.android.replacefragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.app.FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment1 frag1 = new Fragment1();
        fragmentTransaction.add(R.id.container, frag1);
        fragmentTransaction.commit();

        TextView textView = (TextView) findViewById(R.id.new_user);
        textView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment2 frag2 = new Fragment2();
                android.app.FragmentManager fragmentManager = getFragmentManager();
                android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container, frag2);
                fragmentTransaction.commit();
            }
        });

    }
}
