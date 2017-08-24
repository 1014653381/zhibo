package com.zly.utils;

/**
 * Created by Administrator on 2017/8/23.
 */
        import android.content.Context;
        import android.util.AttributeSet;
        import android.widget.GridView;

/**
 * Created by xiaoyuan on 17/8/16.
 */

public class MyGridView extends GridView {
    public MyGridView(Context context) {
        super(context);
    }

    public MyGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }

}

