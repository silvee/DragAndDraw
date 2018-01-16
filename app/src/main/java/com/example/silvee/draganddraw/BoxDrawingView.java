package com.example.silvee.draganddraw;

import android.content.Context;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by silvee on 16.01.2018.
 */

public class BoxDrawingView extends View {
    public static final String TAG = "BoxDrawingView";

    private Box currentBox;
    private List<Box> boxList = new ArrayList<>();

    public BoxDrawingView(Context context) {
        super(context);
    }

    public BoxDrawingView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        PointF pointF = new PointF(event.getX(), event.getY());
        String action = "";

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                action = "ACTION_DOWN";
                currentBox = new Box(pointF);
                boxList.add(currentBox);
                break;
            case MotionEvent.ACTION_MOVE:
                action = "ACTION_MOVE";
                if (currentBox != null) {
                    currentBox.setCurrent(pointF);
                    invalidate();
                }
                break;
            case MotionEvent.ACTION_UP:
                action = "ACTION_UP";
                currentBox = null;
                break;
            case MotionEvent.ACTION_CANCEL:
                action = "ACTION_CANCEL";
                currentBox = null;
                break;
            default:
                break;
        }
        return true;

    }
}
