package com.khrns.test.myapplication;


import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by herry on 8/16/17.
 */

public class ImageAlaAla extends ImageView {

    public ImageAlaAla(Context context) {
        super(context);
    }

    public ImageAlaAla(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageAlaAla(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int width = getMeasuredWidth();
        int height = getMeasuredHeight();

        int squareLen = width > height ? height : width;
        setMeasuredDimension(squareLen, squareLen);
    }

}