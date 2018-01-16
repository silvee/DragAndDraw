package com.example.silvee.draganddraw;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by silvee on 16.01.2018.
 */

public class DragAndDrawFragment extends Fragment {

    public static Fragment newInstance() {
        return new DragAndDrawFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("fragment", "in onCreateView");
        return inflater.inflate(R.layout.fragment_drag_and_draw, container, false);
    }
}
