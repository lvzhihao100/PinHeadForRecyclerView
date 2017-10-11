package com.gamerole.itemdecoration.lib;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by lv on 17-10-9.
 */

public class MeizuDecorationDrawer implements DecorationDrawer {
    private final int paddingLeft = 50;

    @Override
    public void drawVertical(Canvas c, String title, float left, float top, float right, float bottom,
                             Paint mBackgroundPaint, Paint mTextPaint, float baseLine, int mTitleHeight) {

//        c.drawRect(left, top, right, bottom, mBackgroundPaint);
        Paint paint = new Paint();
        int num = SumStrAscii(title) % 8 - 1;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.argb(255, num / 4 * 255, (num % 4) / 2 * 255, num % 2 * 255));
        c.drawCircle(paddingLeft, bottom - mTitleHeight / 2, 35, paint);

        mTextPaint.setColor(Color.WHITE);
        c.drawText(title, paddingLeft, baseLine, mTextPaint);
    }

    @Override
    public void drawFlow(Canvas c, String title, float left, float top, float right, float bottom,
                         Paint mBackgroundPaint, Paint mTextPaint, float baseLine, int mTitleHeight) {

        Paint paint = new Paint();
        int num = SumStrAscii(title) % 8 - 1;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.argb(255, num / 4 * 255, (num % 4) / 2 * 255, num % 2 * 255));
        c.drawCircle(paddingLeft, bottom - mTitleHeight / 2, 35, paint);

        mTextPaint.setColor(Color.WHITE);

        c.drawText(title, paddingLeft, baseLine, mTextPaint);
    }

    /**
     * 求出字符串的ASCII值和
     * 注意，如果有中文的话，会把一个汉字用两个byte来表示，其值是负数
     */
    public static int SumStrAscii(String str) {
        byte[] bytestr = str.getBytes();
        int sum = 0;
        for (int i = 0; i < bytestr.length; i++) {
            sum += bytestr[i];
        }
        return sum;
    }
}
