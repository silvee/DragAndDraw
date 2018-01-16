package com.example.silvee.draganddraw;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by silvee on 16.01.2018.
 */

public class Box {
    private PointF origin;
    private PointF current;

    public Box(PointF origin) {
        this.origin = origin;
        this.current = origin;
    }

    public PointF getOrigin() {
        return origin;
    }

    public PointF getCurrent() {
        return current;
    }

    public void setCurrent(PointF current) {
        this.current = current;
    }


}
