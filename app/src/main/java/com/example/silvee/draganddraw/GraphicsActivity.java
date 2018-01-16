package com.example.silvee.draganddraw;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class GraphicsActivity extends AppCompatActivity {
    Button changeFragmentButton;


    protected Fragment createDragAndDrawFragment() {
        Log.i("activity", "in createFragment");
        return DragAndDrawFragment.newInstance();
    }

    protected Fragment createAnimationFragment() {
        Log.i("activity", "in createFragment");
        return AnimationFragment.newInstance();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.i("activity", "in onCreate1");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_fragment);

        final FragmentManager fm = getSupportFragmentManager();
        changeFragmentButton = findViewById(R.id.change_fragment_button);
        changeFragmentButton.setText(R.string.animation_fragment);
        changeFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (changeFragmentButton.getText() != getResources().getString(R.string.boxes_fragment)) {
                    fm.beginTransaction().replace(R.id.fragment_container, createAnimationFragment()).commit();
                    changeFragmentButton.setText(R.string.boxes_fragment);
                } else {
                    fm.beginTransaction().replace(R.id.fragment_container,  createDragAndDrawFragment()).commit();
                    changeFragmentButton.setText(R.string.animation_fragment);
                }
            }
        });
        fm.beginTransaction().add(R.id.fragment_container,  createDragAndDrawFragment()).commit();
    }
}
