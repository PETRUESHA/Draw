package com.example.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint pen = new Paint();
        pen.setColor(Color.GREEN);
        pen.setAntiAlias(true);
        pen.setStrokeWidth(30);
        pen.setStyle(Paint.Style.FILL);
        canvas.drawColor(Color.WHITE);
        canvas.drawRect(0, 1400, getWidth(), getHeight(), pen);
        pen.setColor(Color.GRAY);
        pen.setStyle(Paint.Style.FILL);
        int bench_width = getWidth() / 4 * 3;
        canvas.drawRect(bench_width, 1600, bench_width + 200, 1650, pen);
        canvas.drawRect(bench_width + 20, 1650, bench_width + 80, 1700, pen);
        canvas.drawRect(bench_width + 120, 1650, bench_width + 180, 1700, pen);
        pen.setColor(Color.parseColor("#79553D"));
        canvas.drawRect(bench_width - 200, 1800, bench_width - 160, 1200, pen);
        pen.setColor(Color.parseColor("#44944A"));
        canvas.drawOval(bench_width - 400, 1200, bench_width + 40, 600, pen);
        pen.setColor(Color.YELLOW);
        canvas.drawCircle(100, 100, 200, pen);
        pen.setStrokeWidth(4);
        canvas.drawLine(200, 200, 600, 300, pen);
        canvas.drawLine(200, 200, 600, 500, pen);
        canvas.drawLine(200, 150, 600, 100, pen);
        canvas.drawLine(200, 200, 300, 600, pen);
    }
}
