package com.example.silvee.draganddraw;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class DragAndDrawActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        Log.i("activity", "in createFragment");
        return DragAndDrawFragment.newInstance();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.i("activity", "in onCreate1");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_fragment);
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.fragment_container, createFragment()).commit();
        Log.i("activity", "in onCreate2");
    }
}
