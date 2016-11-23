package com.example.dsliang.viewstyleattributedemo;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by dsliang on 2016/11/22.
 */

public class CustomView extends View {

    static final public String TAG = CustomView.class.getSimpleName();

    public CustomView(Context context) {
        this(context, null);
    }

    public CustomView(Context context, AttributeSet attrs) {
//        this(context, attrs, 0);
        this(context, attrs, R.attr.customViewStyle);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CustomView, defStyleAttr, R.style.DefaultCustomViewStyle);

        Log.d(TAG, "attrA: " + a.getString(Integer.valueOf(0)));
        Log.d(TAG, "attrB: " + a.getString(Integer.valueOf(1)));
        Log.d(TAG, "attrC: " + a.getString(Integer.valueOf(2)));
        Log.d(TAG, "attrD: " + a.getString(Integer.valueOf(3)));
        Log.d(TAG, "attrE: " + a.getString(Integer.valueOf(4)));
        Log.d(TAG, "attrF: " + a.getString(Integer.valueOf(5)));
        Log.d(TAG, "attrG: " + a.getString(Integer.valueOf(6)));

        a.recycle();
    }
}
